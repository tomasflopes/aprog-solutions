import java.util.Scanner;

public class Ex6 {
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();

        int original = n;
        int reversed = 0;

        while (n > 0) {
            int d = n % 10;
            reversed = reversed * 10 + d;
            n /= 10;
        }

        if (original == reversed) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}
