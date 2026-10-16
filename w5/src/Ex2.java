import java.util.Scanner;

public class Ex2 {
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();

        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;

            for (int divisor = 2; divisor <= Math.sqrt(i) && isPrime; divisor++) {
                if (i % divisor == 0) isPrime = false;
            }

            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}