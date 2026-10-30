import java.util.Scanner;

public class Ex5 {
    static final Scanner scanner = new Scanner(System.in);

    static int countRepeatedDigitsInSamePosition(int a, int b) {
        int count = 0;
        while (a > 0 && b > 0) {
            int aDigit = a % 10;
            int bDigit = b % 10;

            if (aDigit == bDigit) count++;

            a /= 10;
            b /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int mostCommonDigitsInSamePosition = 0;
        int a = 0, b = 0;

        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int candidateA = scanner.nextInt();
                int candidateB = scanner.nextInt();

                int repeatedDigitsInSamePosition = countRepeatedDigitsInSamePosition(candidateA, candidateB);

                if (repeatedDigitsInSamePosition >= mostCommonDigitsInSamePosition) {
                    mostCommonDigitsInSamePosition = repeatedDigitsInSamePosition;
                    a = candidateA;
                    b = candidateB;
                }
            }

            if (mostCommonDigitsInSamePosition > 0) {
                System.out.printf("%d/%d%n", a, b);
            } else {
                System.out.println("no results");
            }
        }
    }
}
