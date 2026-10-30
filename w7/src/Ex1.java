import java.util.Scanner;

public class Ex1 {
    static final Scanner scanner = new Scanner(System.in);

    public static int countAndPrintDistinctTriples(int n) {
        int triples = 0;

        for (int a = n - 2; a >= 1; a--) {
            for (int b = a; b >= 1; b--) {
                int c = n - a - b;

                if (c >= 1 && c <= b && c <= a) {
                    System.out.println(a + " + " + b + " + " + c);
                    triples++;
                }
            }
        }

        return triples;
    }

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int triples = countAndPrintDistinctTriples(n);
        System.out.println("triples=" + triples);
    }
}
