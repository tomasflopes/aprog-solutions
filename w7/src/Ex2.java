import java.util.Scanner;

public class Ex2 {
    static final Scanner scanner = new Scanner(System.in);

    static int countDigits(long n) {
        int nOfDigits = 0;
        while (n > 0) {
            nOfDigits++;
            n /= 10;
        }

        return nOfDigits;
    }

    static long scoreGame(long n) {
        int divisor = (int) Math.pow(10, countDigits(n));

        long score = 0;
        long previous = -1;

        while (divisor > 0) {
            long current = (n / divisor) % 10;

            if (current == previous) {
                score = score >= 0 ? -(score + current) : score - current;
            } else {
                score += current;
            }

            previous = current;
            divisor /= 10;
        }

        return score;
    }

    public static void main(String[] args) {
        long n = scanner.nextLong();
        long points = scoreGame(n);
        System.out.printf("points=%d%n", points);
    }
}
