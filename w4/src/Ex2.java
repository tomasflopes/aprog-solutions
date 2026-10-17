import java.util.Scanner;

public class Ex2 {
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();

        while (n > 0) {
            int sum = 0;

            while (n > 0) {
                int d = n % 10;
                if (d % 2 == 0) sum += d;

                n /= 10;
            }

            System.out.println(sum);
            n = scanner.nextInt();
        }
    }
}