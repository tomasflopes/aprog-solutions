import java.util.Scanner;

public class Ex5 {
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n1 = scanner.nextInt();

        while (n1 >= 0) {
            int n2 = scanner.nextInt();

            if (n2 > n1) {
                int temp = n2;
                int firstDigit = temp % 10;
                temp /= 10;
                boolean valid = true;

                while (temp > 0) {
                    int secondDigit = temp % 10;
                    if (firstDigit <= secondDigit) valid = false;
                    firstDigit = secondDigit;
                    temp /= 10;
                }

                if (valid) {
                    System.out.println(n2);
                }
            }

            n1 = n2;
        }
    }
}