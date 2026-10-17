import java.util.Scanner;

public class Ex9 {
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }

        int lcm = b;

        while (lcm % a != 0) lcm += b;

        System.out.println(lcm);
    }
}
