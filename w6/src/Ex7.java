import java.util.Scanner;

public class Ex7 {
    static final Scanner scanner = new Scanner(System.in);

    static int countDigits(int n) {
        int nOfDigits = 0;

        while (n > 0) {
            nOfDigits++;
            n /= 10;
        }
        return nOfDigits;
    }

    static boolean isArmstrongNumber(int n) {
        int original = n;
        int sum = 0;
        int nOfDigits = countDigits(n);

        while (n > 0) {
            int digit = n % 10;
            sum += (int) Math.pow(digit, nOfDigits);
            n /= 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            if (isArmstrongNumber(i)) {
                System.out.println(i);
            }
        }
    }
}