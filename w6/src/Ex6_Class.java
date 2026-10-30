import java.util.Scanner;

public class Ex6_Class {
    static Scanner scanner = new Scanner(System.in);

    static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    static int combinations(int m, int n) {
        return factorial(m) / (factorial(n) * factorial(m - n));
    }

    static int permutations(int n1, int n2) {
        return factorial(n1) / factorial(n1 - n2);
    }

    static void showResults(int m, int n, int resultCombinations, int resultPermutations) {
        System.out.printf("C(%d,%d)=%d%n", m, n, resultCombinations);
        System.out.printf("P(%d,%d)=%d%n", m, n, resultPermutations);
    }

    public static void main(String[] args) {
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        if (m >= n) {
            int resultCombination = combinations(m, n);
            int resultPermutation = permutations(m, n);
            showResults(m, n, resultCombination, resultPermutation);
        }
    }
}
