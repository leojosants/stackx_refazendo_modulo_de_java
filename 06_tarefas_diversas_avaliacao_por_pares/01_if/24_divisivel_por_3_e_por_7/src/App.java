import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner readerScanner = new Scanner(System.in);

        String message = "";
        int number = 0;

        System.out.println("\nEntre com os dados abaixo solicitados");
        System.out.print("Digite um número inteiro: ");
        number = readerScanner.nextInt();

        if (((number % 3) == 0) && ((number % 7) == 0)) {
            message = "É divisível por 3 e por 7";

        } else {
            message = "Não é divisível por 3 e por 7";
        }

        System.out.println("\nExibindo dados");
        System.out.printf("O número %d: %s%n", number, message);

        readerScanner.close();
    }
}