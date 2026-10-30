import java.util.Scanner;

public class Ex5 {
    static final Scanner scanner = new Scanner(System.in);

    public static long sumOfSquaredDigits(long n) {
        long sum = 0;

        while (n > 0) {
            long digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        return sum;
    }

    // true if value appears among the first (steps + 1) terms of the sequence starting at start
    public static boolean wasSeen(long start, int steps, long value) {
        long current = start;

        for (int i = 0; i <= steps; i++) {
            if (current == value) return true;
            current = sumOfSquaredDigits(current);
        }

        return false;
    }

    public static void showCycle(long n) {
        long current = n;
        int steps = 0;

        System.out.print(current);

        while (current != 1) {
            long next = sumOfSquaredDigits(current);
            steps++;
            System.out.print(" > " + next);

            if (wasSeen(n, steps - 1, next)) {
                System.out.println(" ...");
                System.out.println("Cyclic : " + steps);
                return;
            }

            current = next;
        }

        System.out.println();
        System.out.println("Stable : " + steps);
    }

    public static void main(String[] args) {
        long n = scanner.nextLong();
        showCycle(n);
    }
}
