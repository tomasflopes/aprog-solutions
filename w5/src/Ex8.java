import java.util.Scanner;

public class Ex8 {
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();

        int seenMask = 0;
        int result = 0;

        while (n > 0) {
            int number = n;
            int power = 1;

            while (number >= 10) {
                number /= 10;
                power *= 10;
            }

            int remaining = n;

            while (power > 0) {
                int digit = remaining / power;
                int value = (int) Math.pow(2, digit);

                if ((seenMask / value) % 2 == 0) {
                    seenMask += value;
                    result = result * 10 + digit;
                }

                remaining %= power;
                power /= 10;
            }

            n = scanner.nextInt();
        }

        System.out.println(result);
    }
}