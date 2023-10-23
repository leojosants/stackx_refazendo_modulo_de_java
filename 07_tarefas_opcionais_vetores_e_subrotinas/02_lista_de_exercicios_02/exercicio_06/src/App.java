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
            System.out.print("Digite um número [1 - 7]: ");
            number = scanner.nextInt();
        } while ((number < 1) || (number > 7));

        return number;
    }

    public static String ReturnDiaDaSemana(int number) {
        String message = "";

        switch (number) {
            case 1:
                message = "Domingo";
                break;

            case 2:
                message = "Segunda-feira";
                break;

            case 3:
                message = "Terça-feira";
                break;

            case 4:
                message = "Quarta-feira";
                break;

            case 5:
                message = "Quinta-feira";
                break;

            case 6:
                message = "Sexta-feira";
                break;

            case 7:
                message = "Sábado";
                break;

            default:
                message = "Indefinido";
                break;
        }

        return message;
    }

    public static void DisplaysData(int number, String message) {
        System.out.println("\nExibindo dados");
        System.out.printf("Número:        %d%n", number);
        System.out.printf("Dia da semana: %s%n", message);
    }
}