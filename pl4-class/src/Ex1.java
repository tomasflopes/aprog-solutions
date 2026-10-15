import java.util.Scanner;

public class Ex1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int sum = 0;

        while(n > 0) {
            int digit = n % 10;

            if(digit % 2 == 0) {
                sum += digit;
            }

            n /= 10;
        }

        System.out.println(sum);
    }
}