import java.util.Scanner;

public class Ex8 {
    static final Scanner scanner = new Scanner(System.in);

    static boolean isPalindrome(int n) {
        int original = n;
        int reversed = 0;

        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        int MAX_ATTEMPTS = 5;

        int n = scanner.nextInt();
        int attemptsCount = 1;

        while (!isPalindrome(n) && attemptsCount < MAX_ATTEMPTS) {
            attemptsCount++;
            n = scanner.nextInt();
        }

        if (attemptsCount < MAX_ATTEMPTS) {
            System.out.println("palindrome");
        } else {
            System.out.println("attempts exceeded");
        }
    }
}