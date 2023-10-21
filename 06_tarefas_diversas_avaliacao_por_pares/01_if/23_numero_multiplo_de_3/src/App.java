import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner readerScanner = new Scanner(System.in);

        String message = "";
        int number = 0;

        System.out.println("\nEntre com os dados abaixo solicitados");
        System.out.print("Digite um número inteiro: ");
        number = readerScanner.nextInt();

        if ((number % 3) == 0) {
            message = "É múltiplo de 3";

        } else {
            message = "Não é múltiplo de 3";
        }

        System.out.println("\nExibindo dados");
        System.out.printf("O número %d: %s", number, message);

        readerScanner.close();
    }
}