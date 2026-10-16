import java.util.Scanner;

public class Exercicio1_1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) { // psvm
        int x = scanner.nextInt(); // LER()

        x = x * 2; // x <- x * 2

        if(x == 2) { // SE (x = 2) ENTÃO
            System.out.println("o x é 2");
        } else {
            System.out.println("o x não é 2");
        }

        System.out.println("o número é: " + x); // sout // ESCREVER()

        // REPETIR ENQUANTO
        // PARA (..) FAZER

        while(x < 5) {
            System.out.println("o x é menor que 5 (while)");
            x = scanner.nextInt();
        }

        do {
            System.out.println("o x é menor que 5 (do-while)");
            x++; // x = x + 1
            x += 5; // x = x + 5
            // syntatic sugar
        } while(x < 5);

        for (int contador = 0; contador < 10; contador+=5) { // fori PARA(..) FAZER
            System.out.println(contador);
        }

        double real = 1.02;
        int inteiro = 10;
        String texto = "isto é um texto";
        boolean VouF = true;
        char caracter = 'a';
    }
}
