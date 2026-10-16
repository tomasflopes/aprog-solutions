import java.util.Scanner;

public class Ex3 {
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();

        if (n > 0) {
            int count = 0;
            int candidate = 1;

            while (count < n) {
                int sum = 0;

                for (int divisor = 1; divisor <= candidate / 2; divisor++) {
                    if (candidate % divisor == 0 && divisor != candidate) sum += divisor;
                }

                if (sum == candidate) {
                    count++;
                    System.out.println(candidate);
                }

                candidate++;
            }
        }
    }
}