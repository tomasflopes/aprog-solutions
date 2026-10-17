import java.util.Scanner;

public class Ex10 {
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        boolean hasDividers = false;

        for (int i = 3; i <= n; i += 3) {
            if (n % i == 0) {
                System.out.println(i);
                hasDividers = true;
            }
        }

        if(!hasDividers) {
            System.out.println("without dividers multiples of 3");
        }
    }
}