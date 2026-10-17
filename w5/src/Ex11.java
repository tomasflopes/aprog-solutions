import java.util.Scanner;

public class Ex11 {
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int nOfEvenDigits = 0;
        int nOfOddDigits = 0;
        int maxOddDigit = 0;

        while (n > 0) {
            int digit = n % 10;

            if (digit % 2 == 0) {
                nOfEvenDigits++;
            } else {
                nOfOddDigits++;
                if (digit > maxOddDigit) maxOddDigit = digit;
            }

            n /= 10;
        }

        double percentageOfEven = (double) (nOfEvenDigits) / (nOfEvenDigits + nOfOddDigits) * 100;

        System.out.printf("%.2f%%%n", percentageOfEven);
        if (nOfOddDigits > 0) {
            System.out.println(maxOddDigit);
        } else {
            System.out.println("no odd digits");
        }
    }
}