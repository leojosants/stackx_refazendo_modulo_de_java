import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // while
        Scanner reader = new Scanner(System.in);
        int thoughtNumber = 42;
        int userOption = -1;

        while (userOption != thoughtNumber) {
            System.out.print("Estou pensando em um número entre 1 e 50, tente adivinhar!");
            userOption = reader.nextInt();

            if (userOption == thoughtNumber) {
                System.out.println("Acertou");
            } else {
                System.out.println("Errou");
            }
        }

        // for
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
