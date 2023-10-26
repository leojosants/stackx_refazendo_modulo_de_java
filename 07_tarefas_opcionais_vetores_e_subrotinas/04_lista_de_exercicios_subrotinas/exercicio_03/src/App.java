import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        try {

            int numberOfNumbersToBeReceived = 0;
            int numbersReceived_vector[];

            do {
                System.out.print(
                        "\nDigite a quantidade de números que serão recebidos [positivo / inteiro]: ");
                numberOfNumbersToBeReceived = scanner.nextInt();
            } while (numberOfNumbersToBeReceived < 0);

            numbersReceived_vector = new int[numberOfNumbersToBeReceived];

            FillVector(numbersReceived_vector, scanner);

            System.out.println("\nExibindo informação");

            PrintLargerNumber(numbersReceived_vector);
            PrintSmallestNumber(numbersReceived_vector);

        } catch (InputMismatchException e) {
            System.out.println("--> Erro: entrada de inválida de dados");

        } finally {
            scanner.close();
            System.out.println("Fim do programa");
        }
    }

    /* SUB-ROUTINES */
    public static void FillVector(int vector[], Scanner scanner) {
        for (int i = 0; i < vector.length; i++) {
            System.out.printf("Digite o %dº número inteiro [positivo]: ", (i + 1));
            vector[i] = scanner.nextInt();
        }
    }

    public static void PrintLargerNumber(int vector[]) {
        int higherNumber = 0;
        higherNumber = vector[0];

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > higherNumber) {
                higherNumber = vector[i];
            }
        }

        System.out.printf("Maior número digitado: %d%n", higherNumber);
    }

    public static void PrintSmallestNumber(int vector[]) {
        int smallestNumber = 0;
        smallestNumber = vector[0];

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] < smallestNumber) {
                smallestNumber = vector[i];
            }
        }

        System.out.printf("Menor número digitado: %d%n", smallestNumber);
    }
}
