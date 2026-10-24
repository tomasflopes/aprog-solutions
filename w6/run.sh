#!/bin/sh

set -eu

if [ "$#" -ne 1 ]; then
    echo "Usage: $0 Ex1" >&2
    exit 2
fi

exercise=$1
exercise_number=$(printf '%s' "$exercise" | sed 's/^[Ee]x//')
input_dir="inputs/ex${exercise_number}"
expected_dir="expected/ex${exercise_number}"
source_file="src/${exercise}.java"
output_dir="outputs/${exercise}"
class_dir="out/${exercise}"

print_diff() {
    sed '1,2d' | awk '
        /^@@/ { printf "\033[36m%s\033[0m\n", $0; next }
        /^\+/ { printf "\033[32m%s\033[0m\n", $0; next }
        /^-/  { printf "\033[31m%s\033[0m\n", $0; next }
        { print }
    '
}

if [ ! -f "$source_file" ]; then
    echo "Source file not found: $source_file" >&2
    exit 1
fi

if [ ! -d "$input_dir" ]; then
    echo "Input directory not found: $input_dir" >&2
    exit 1
fi

if [ ! -d "$expected_dir" ]; then
    echo "Expected directory not found: $expected_dir" >&2
    exit 1
fi

rm -rf "$class_dir"
mkdir -p "$class_dir" "$output_dir"
javac "$source_file" -d "$class_dir"

failed=0
found_input=0

for input_file in "$input_dir"/*; do
    [ -f "$input_file" ] || continue
    found_input=1

    name=$(basename "$input_file")
    output_file="$output_dir/$name"
    expected_file="$expected_dir/$name"

    if [ ! -f "$expected_file" ]; then
        echo "Missing expected file: $expected_file" >&2
        failed=1
        continue
    fi

    java -cp "$class_dir" "$exercise" < "$input_file" > "$output_file"

    normalized_expected=$(mktemp)
    normalized_output=$(mktemp)
    awk '{ print }' "$expected_file" > "$normalized_expected"
    awk '{ print }' "$output_file" > "$normalized_output"

    if diff_output=$(diff -u "$normalized_expected" "$normalized_output"); then
        printf '%s: PASS\n' "$name"
    else
        printf '%s\n' "$diff_output" | print_diff
        printf '%s: FAIL\n' "$name"
        failed=1
    fi

    rm -f "$normalized_expected" "$normalized_output"
done

if [ "$found_input" -eq 0 ]; then
    echo "No input files found in: $input_dir" >&2
    exit 1
fi

exit "$failed"
