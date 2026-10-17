import java.util.Scanner;

public class Ex7 {
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();

        while (n >= 0) {
            int number = n;
            int rightPosition = 1;
            boolean found = false;

            while (number > 0 && !found) {
                int digit = number % 10;
                int remainingNumber = number / 10;
                int leftPosition = rightPosition + 1;

                while (remainingNumber > 0 && !found) {
                    int leftDigit = remainingNumber % 10;

                    if (leftDigit == digit) {
                        System.out.printf("%d : digit (%d) repeated in positions (%d) and (%d)%n", n, digit, rightPosition, leftPosition);
                        found = true;
                    }

                    remainingNumber /= 10;
                    leftPosition++;
                }

                number /= 10;
                rightPosition++;
            }

            n = scanner.nextInt();
        }
    }
}