import java.util.Scanner;

public class Ex9 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        long a = scanner.nextLong();
        long b = scanner.nextLong();

        long larger = a;
        long smaller = b;
        if (b > a) {
            larger = b;
            smaller = a;
        }

        long lcm = larger;

        while (lcm % smaller != 0) lcm += larger;

        System.out.println(lcm);
    }
}
