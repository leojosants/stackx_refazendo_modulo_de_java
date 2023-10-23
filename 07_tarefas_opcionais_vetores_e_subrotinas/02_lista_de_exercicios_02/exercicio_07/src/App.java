import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        try {

            DisplaysInitialMessage();

            int number = ReturnsNumber(scanner);
            String message = ReturnDiaDaSemana(number);

            DisplaysData(number, message);

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

    public static int ReturnsNumber(Scanner scanner) {
        int number = 0;

        do {
            System.out.print("Digite um número [1 - 12]: ");
            number = scanner.nextInt();
        } while ((number < 1) || (number > 12));

        return number;
    }

    public static String ReturnDiaDaSemana(int number) {
        String message = "";

        switch (number) {
            case 1:
                message = "Janeiro";
                break;

            case 2:
                message = "Fevereiro";
                break;

            case 3:
                message = "Março";
                break;

            case 4:
                message = "Abril";
                break;

            case 5:
                message = "Maio";
                break;

            case 6:
                message = "Junho";
                break;

            case 7:
                message = "Julho";
                break;

            case 8:
                message = "Agosto";
                break;

            case 9:
                message = "Setembro";
                break;

            case 10:
                message = "Outubro";
                break;

            case 11:
                message = "Novembro";
                break;

            case 12:
                message = "Dezembro";
                break;

            default:
                message = "Indefinido";
                break;
        }

        return message;
    }

    public static void DisplaysData(int number, String message) {
        System.out.println("\nExibindo dados");
        System.out.printf("Número:     %d%n", number);
        System.out.printf("Mês do ano: %s%n", message);
    }
}