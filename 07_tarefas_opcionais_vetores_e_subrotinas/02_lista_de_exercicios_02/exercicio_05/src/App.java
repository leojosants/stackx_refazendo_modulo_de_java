import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        try {
            DisplaysInitialMessage();

            int value = ReturnsValue(scanner);
            String message = ReturnsMessage(value);

            DisplaysData(value, message);

        } catch (InputMismatchException e) {
            System.out.println("Erro, entrada de dados inválida");

        } catch (Exception e) {
            System.out.println(e);

        } finally {
            scanner.close();
            System.out.println("\nFim do programa");
        }
    }

    /* SUB-ROUTINES */
    public static void DisplaysInitialMessage() {
        System.out.println("\nInforme os dados solicitados abaixo");
    }

    public static int ReturnsValue(Scanner scanner) {
        int value = 0;

        do {
            System.out.print("Digite um valor inteiro [somente número]: ");
            value = scanner.nextInt();
        } while (value < 0);

        return value;
    }

    public static String ReturnsMessage(int value) {
        String even = "PAR";
        String odd = "IMPAR";
        String message = "";

        if ((value % 2) == 0) {
            message = even;

        } else {
            message = odd;
        }

        return message;
    }

    public static void DisplaysData(int value, String message) {
        System.out.println("\nExibindo dados");
        System.out.printf("Valor:\t  %d%n", value);
        System.out.printf("Mensagem: %s%n", message);
    }
}