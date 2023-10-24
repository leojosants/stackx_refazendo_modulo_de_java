import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        try {

            DisplaysInitialMessage();

            int number = ReturnsValue(scanner);
            int sumOfTheFirst_N_Numbers = ReturnsSomaDosNPrimeirosNumeros(number);

            DisplaysData(number, sumOfTheFirst_N_Numbers);

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
        int number = 0;

        do {
            System.out.print("Digite um número inteiro [somente valor positivo]: ");
            number = scanner.nextInt();
        } while (number < 0);

        return number;
    }

    public static int ReturnsSomaDosNPrimeirosNumeros(int number) {
        int sum = 0;
        int counter = 1;

        while (counter <= number) {
            sum += counter;
            counter++;
        }

        return sum;
    }

    public static void DisplaysData(int number, int sumOfTheFirst_N_Numbers) {
        System.out.println("\nExibindo dados");
        System.out.printf("Número: %d%n", number);
        System.out.printf("Soma dos N primeiros números: %d%n", sumOfTheFirst_N_Numbers);
    }
}