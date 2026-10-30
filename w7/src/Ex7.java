import java.util.Scanner;

public class Ex7 {
    static final Scanner scanner = new Scanner(System.in);

    public static boolean isPrime(long n) {
        if (n < 2) return false;

        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    public static int countDigits(long n) {
        int count = 0;

        while (n > 0) {
            n /= 10;
            count++;
        }

        return count;
    }

    public static boolean isFullTimePrime(long n) {
        long power = 1;
        for (long i = 1; i < countDigits(n); i++) {
            power *= 10;
        }

        long rotated = n;
        do {
            if (!isPrime(rotated)) return false;
            rotated = (rotated % 10) * power + rotated / 10;
        } while (rotated != n);

        return true;
    }

    public static void main(String[] args) {
        long start = scanner.nextLong();
        long end = scanner.nextLong();
        int count = 0;

        for (long n = start; n <= end; n++) {
            if (isFullTimePrime(n)) {
                System.out.println(n);
                count++;
            }
        }

        System.out.printf("(%d)%n", count);
    }
}
