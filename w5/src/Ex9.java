import java.util.Scanner;

public class Ex9 {
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int code = scanner.nextInt();
        String brandName;

        switch (code) {
            case 1:
                brandName = "Tag Heuer";
                break;
            case 2:
                brandName = "Rolex";
                break;
            case 3:
                brandName = "Omega";
                break;
            case 4:
                brandName = "Cartier";
                break;
            case 5:
                brandName = "Bvlgari";
                break;
            case 6:
                brandName = "Raymond Weil";
                break;
            default:
                brandName = "Invalid brand";
        }

        System.out.println(brandName);
    }
}