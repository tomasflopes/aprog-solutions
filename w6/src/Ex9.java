import java.util.Scanner;

public class Ex9 {
    static final Scanner scanner = new Scanner(System.in);

    static boolean isPerfectSquare(long value) {
        long sqrt = (long) Math.sqrt(value);
        return sqrt * sqrt == value;
    }

    static boolean isFibonacci(int n) {
        long val1 = 5 * (long) Math.pow(n, 2) + 4;
        long val2 = 5 * (long) Math.pow(n, 2) - 4;

        return isPerfectSquare(val1) || isPerfectSquare(val2);
    }

    public static void main(String[] args) {
        int n = scanner.nextInt();

        if (isFibonacci(n)) {
            System.out.println("is a Fibonacci number");
        } else {
            System.out.println("is not a Fibonacci number");
        }
    }
}
