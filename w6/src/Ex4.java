import java.util.Scanner;

public class Ex4 {
    static final Scanner scanner = new Scanner(System.in);

    static int factorial(int n) {
        int res = 1;
        for (int i = 2; i <= n; i++) {
            res *= i;
        }
        return res;
    }

    static int combinations(int m, int n) {
        return factorial(m) / (factorial(n) * factorial(m - n));
    }

    static int permutations(int m, int n) {
        return factorial(m) / factorial(m - n);
    }

    public static void main(String[] args) {
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        if (n <= m && n >= 0) {
            System.out.printf("C(%d,%d)=%d%n", m, n, combinations(m, n));
            System.out.printf("P(%d,%d)=%d%n", m, n, permutations(m, n));
        }
    }
}