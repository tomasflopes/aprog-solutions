import java.util.Scanner;

public class Ex6 {
    static final Scanner scanner = new Scanner(System.in);

    public static int readPositiveValue() {
        int value;

        do {
            value = scanner.nextInt();
        } while (value <= 0);

        return value;
    }

    public static void showTableOfNumber(int n) {
        System.out.printf("Multiplication table of %d%n", n);

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", n, i, n * i);
        }
    }

    public static void showTablesInRange(int start, int end) {
        for (int n = start; n <= end; n++) {
            showTableOfNumber(n);
        }
    }

    public static void main(String[] args) {
        int first = readPositiveValue();
        int second = readPositiveValue();
        showTablesInRange(Math.min(first, second), Math.max(first, second));
    }
}
