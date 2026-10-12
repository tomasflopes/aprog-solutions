import java.util.Scanner;

public class Ex7 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();

        System.out.println(1);
        int divisors = 1;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                divisors++;
                System.out.println(i);
            }
        }

        if (n > 1) {
            System.out.println(n);
            divisors++;
        }

        System.out.println("(" + divisors + ")");
    }
}
