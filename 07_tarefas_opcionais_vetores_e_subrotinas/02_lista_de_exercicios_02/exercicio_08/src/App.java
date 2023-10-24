import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        try {
            DisplaysInitialMessage();

            int totalNumberToBeReceived = 10;
            int totalOfOddNumbers = ReturnsTotalOfOddNumbers(scanner, totalNumberToBeReceived);

            DisplaysData(totalNumberToBeReceived, totalOfOddNumbers);

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

    public static int ReturnsTotalOfOddNumbers(Scanner scanner, int totalNumberToBeReceived) {
        int totalOfOddNumbers = 0;
        int numberRecebido = 0;

        System.out.println("Digite 10 números [somente inteiros]");

        for (int i = 1; i <= totalNumberToBeReceived; i++) {
            do {
                System.out.printf("%dº número: ", i);
                numberRecebido = scanner.nextInt();
            } while (numberRecebido < 0);

            if ((numberRecebido % 2) == 1) {
                totalOfOddNumbers++;
            }
        }

        return totalOfOddNumbers;
    }

    public static void DisplaysData(int totalNumberToBeReceived,int totalOfOddNumbers) {
        System.out.println("\nExibindo dados");
        System.out.printf("Total de números digitados: %d%n", totalNumberToBeReceived);
        System.out.printf("Total de números impares:   %d%n", totalOfOddNumbers);
    }
}