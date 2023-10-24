import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        try {
            DisplaysInitialMessage();
            int numberOfValuesTtoBeEntered = 10;
            RequestData(scanner, numberOfValuesTtoBeEntered);

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

    public static void RequestData(Scanner scanner, int numberOfValuesTtoBeEntered) {
        int number = 0;
        int highestNumberRead = 0;
        int smallestNumberRead = 1000000000;

        for (int i = 1; i <= numberOfValuesTtoBeEntered; i++) {
            System.out.printf("Digite o %dº número [somente inteiro]: ", i);
            number = scanner.nextInt();

            if (number > highestNumberRead) {
                highestNumberRead = number;
            }

            if (number < smallestNumberRead) {
                smallestNumberRead = number;
            }
        }

        DisplaysData(highestNumberRead, smallestNumberRead);
    }

    public static void DisplaysData(int highestNumberRead, int smallestNumberRead) {
        System.out.println("\nExibindo dados");
        System.out.printf("Maior número lido: %d%n", highestNumberRead);
        System.out.printf("Menor número lido: %d%n", smallestNumberRead);
    }
}