import java.util.Scanner;

public class Ex8 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(n) && isPrime; i++) {
            if (n % i == 0) isPrime = false;
        }

        if (isPrime && n > 1) System.out.println("prime");
        else System.out.println("not prime");
    }
}
