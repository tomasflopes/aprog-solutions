import java.util.Scanner;

public class Ex6 {
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int preferences = scanner.nextInt();
        int n = scanner.nextInt();
        int bannedMask = 0;
        int suggestion = 1;

        if (preferences == 0) {
            bannedMask = 1;
        } else {
            while (preferences > 0) {
                int digit = preferences % 10;
                int value = (int) Math.pow(2, digit);

                if ((bannedMask / value) % 2 == 0) bannedMask += value;

                preferences /= 10;
            }
        }

        for (int i = 0; i < n; i++) {
            int pizza = scanner.nextInt();
            int originalPizza = pizza;
            boolean ok = pizza != 0 || bannedMask % 2 != 1;

            while (pizza > 0 && ok) {
                int digit = pizza % 10;
                int value = (int) Math.pow(2, digit);

                if ((bannedMask / value) % 2 == 1) ok = false;

                pizza /= 10;
            }

            if (ok) {
                System.out.println("Suggestion #" + suggestion + ":" + originalPizza);
                suggestion++;
            }
        }
    }
}