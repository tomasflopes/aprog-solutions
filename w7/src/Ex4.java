import java.util.Scanner;

public class Ex4 {
    static final Scanner scanner = new Scanner(System.in);

    public static boolean hasUniqueDigits(int n) {
        int seenDigits = 0;

        while (n != 0) {
            int digit = Math.abs(n % 10);
            int mask = 1 << digit;

            if ((seenDigits & mask) != 0) return false;

            seenDigits |= mask;
            n /= 10;
        }

        return true;
    }

    public static long percentage(long count, long total) {
        return (count * 20000 + total) / (2 * total);
    }

    public static void showPercentage(String label, long count, long total) {
        long hundredths = percentage(count, total);
        System.out.printf("%s: %d.%02d%%%n", label, hundredths / 100, hundredths % 100);
    }

    public static void main(String[] args) {
        int total = 0;
        int negatives = 0;
        int positives = 0;
        int uniques = 0;

        int n = scanner.nextInt();
        while (n != 0) {
            total++;

            if (n < 0) negatives++;
            else positives++;

            if (hasUniqueDigits(n)) {
                uniques++;
                System.out.println(n);
            }

            n = scanner.nextInt();
        }

        if (total > 0) {
            showPercentage("negatives", negatives, total);
            showPercentage("positives", positives, total);
            showPercentage("with unique digits", uniques, total);
        }
    }
}
