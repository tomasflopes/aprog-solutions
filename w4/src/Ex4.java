import java.util.Scanner;

public class Ex4 {
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();

        while (n > 0) {
            boolean hasOddDigits = false;
            int product = 1;

            while (n > 0) {
                int d = n % 10;
                if (d % 2 == 1) {
                    product *= d;
                    hasOddDigits = true;
                }

                n /= 10;
            }

            if (!hasOddDigits) {
                System.out.println("no odd digits");
            } else {
                System.out.println(product);
            }

            n = scanner.nextInt();
        }
    }
}