import java.util.Scanner;

public class Ex3 {
    static final Scanner scanner = new Scanner(System.in);

    public static double calculateAngleInDegrees(double a, double b, double c) {
        double cos = (Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b);
        return Math.toDegrees(Math.acos(cos));
    }

    public static boolean isPossible(double a, double b, double c) {
        return a > 0 && b > 0 && c > 0 &&
                a + b > c && a + c > b && b + c > a;
    }

    public static void main(String[] args) {
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if (isPossible(a, b, c)) {
            System.out.printf("a=%.2f%n", a);
            System.out.printf("b=%.2f%n", b);
            System.out.printf("c=%.2f%n", c);
            System.out.printf("ang(a,b)=%.2f%n", calculateAngleInDegrees(a, b, c));
            System.out.printf("ang(a,c)=%.2f%n", calculateAngleInDegrees(a, c, b));
            System.out.printf("ang(b,c)=%.2f%n", calculateAngleInDegrees(b, c, a));
        } else {
            System.out.println("impossible");
        }
    }
}