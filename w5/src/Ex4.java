import java.util.Scanner;

public class Ex4 {
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();

        if(n > 0) {
            int n1 = 0;
            int n2 = 1;

            System.out.println(n1);

            for (int i = 0; i < n-1; i++) {
                System.out.println(n2);
                int temp = n1 + n2;
                n1 = n2;
                n2 = temp;
            }
        }
    }
}