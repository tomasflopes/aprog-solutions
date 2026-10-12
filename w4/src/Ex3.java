import java.util.Scanner;

public class Ex3 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();

        int product = 1;
        boolean hasOddDigits = false;

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
    }
}