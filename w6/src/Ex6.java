import java.util.Scanner;

public class Ex6 {
    static final Scanner scanner = new Scanner(System.in);

    static double calculateSphereVolume(double r) {
        return ((double) 4 / 3) * Math.PI * Math.pow(r, 3);
    }

    static double calculateCylinderVolume(double r, double h) {
        return Math.PI * Math.pow(r, 2) * h;
    }

    static double calculateConeVolume(double r, double h) {
        return ((double) 1 / 3) * Math.PI * Math.pow(r, 2) * h;
    }

    public static void main(String[] args) {
        String shape = scanner.next();

        while (!shape.equals("end")) {
            double radius = scanner.nextDouble();
            double height;
            double volume = 0;

            switch (shape) {
                case "cone":
                    height = scanner.nextDouble();
                    volume = calculateConeVolume(radius, height);
                    break;
                case "cylinder":
                    height = scanner.nextDouble();
                    volume = calculateCylinderVolume(radius, height);
                    break;
                case "sphere":
                    volume = calculateSphereVolume(radius);
                    break;
            }

            if (volume != 0) {
                System.out.printf("%.2f%n", volume);
            }

            shape = scanner.next();
        }
    }
}