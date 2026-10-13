import java.util.Scanner;

public class Ex1 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();

        if (n >= 0) {
            double maxPercentage = 0.0;

            for (int i = 0; i < n; i++) {
                int number = scanner.nextInt();
                int totalDigits = 0;
                int divisorDigits = 0;

                int value = number;
                while (value > 0) {
                    int digit = value % 10;
                    totalDigits++;

                    if (digit != 0 && number % digit == 0) divisorDigits++;

                    value /= 10;
                }

                double percentage = (divisorDigits * 100.0) / totalDigits;
                System.out.printf("%.2f%%%n", percentage);

                if (percentage > maxPercentage) maxPercentage = percentage;
            }

            System.out.printf("(%.2f%%)%n", maxPercentage);
        }
    }
}