import java.util.Scanner;

public class Ex1 {
    static final Scanner scanner = new Scanner(System.in);
    static final int K = 5;

    public static int countDigits(int n) {
        int nOfDigits = 0;
        while (n > 0) {
            nOfDigits++;
            n /= 10;
        }

        return nOfDigits;
    }

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int count = 0, sum = 0;
        boolean isValid = true;

        while (count < K && isValid) {
            int x = scanner.nextInt();

            if (countDigits(x) < n) {
                sum += x;
                count++;
            } else {
                isValid = false;
            }
        }

        if (count == 0) {
            System.out.println("0.00");
        } else {
            System.out.printf("%.2f%n", (double) sum / count);
        }
    }
}