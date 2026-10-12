import java.util.Scanner;

public class Ex5 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();

        while (n > 0) {
            int result = 0;
            int exponent = 0;

            while (n > 0) {
                int d = n % 10;
                result += d * (int) Math.pow(8, exponent);

                n /= 10;
                exponent++;
            }

            System.out.println(result);

            n = scanner.nextInt();
        }
    }
}