import java.util.Scanner;

public class Ex2 {
    static final Scanner scanner = new Scanner(System.in);

    static void printSubject(String subjectName, int nOfApprovedStudents, int nOfFailedStudents) {
        System.out.printf("Subject: %s%n", subjectName);

        System.out.print("- Approved:");

        if (nOfApprovedStudents > 0) System.out.print(" ");
        for (int i = 0; i < nOfApprovedStudents; i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.print("- Failed:");
        if (nOfFailedStudents > 0) System.out.print(" ");
        for (int i = 0; i < nOfFailedStudents; i++) {
            System.out.print("*");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int nOfStudents = scanner.nextInt();
        int nOfSubjects = scanner.nextInt();
        for (int i = 0; i < nOfSubjects; i++) {
            String subjectName = scanner.next();
            int nOfApprovedStudents = scanner.nextInt();
            printSubject(subjectName, nOfApprovedStudents, nOfStudents - nOfApprovedStudents);
        }
    }
}
