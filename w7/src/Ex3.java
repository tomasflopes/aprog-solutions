import java.util.Scanner;

public class Ex3 {
    static final Scanner scanner = new Scanner(System.in);

    public static int countWords(String sentence) {
        int count = 0;
        boolean isInsideWord = false;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                isInsideWord = false;
            } else if (!isInsideWord) {
                isInsideWord = true;
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        if (scanner.hasNextLine()) {
            String sentence = scanner.nextLine();
            System.out.println(countWords(sentence));
        } else {
            System.out.println(0);
        }
    }
}
