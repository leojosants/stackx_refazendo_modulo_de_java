import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        try {

            int vectorReceivedNumbers[] = new int[10];
            int vectorOddNumbers[] = new int[10];

            FillVector(scanner, vectorReceivedNumbers);
            DisplaysVectorReceivedNumbers(vectorReceivedNumbers);
            ChecksOddNumbers(vectorReceivedNumbers, vectorOddNumbers);
            DisplaysVectorOddNumbers(vectorReceivedNumbers, vectorOddNumbers);

        } catch (InputMismatchException e) {
            System.out.println("Erro, entrada inválida de dados");

        } catch (Exception e) {
            System.out.println(e);

        } finally {
            scanner.close();
            System.out.println("Fim do programa");
        }
    }

    /* SUB-ROUTINES */
    public static void FillVector(Scanner scanner, int vectorReceivedNumbers[]) {
        System.out.println("\nInforme 10 números");

        for (int i = 0; i < vectorReceivedNumbers.length; i++) {
            do {
                System.out.printf("Digite o %dº valor inteiro [positivo]: ", (i + 1));
                vectorReceivedNumbers[i] = scanner.nextInt();
            } while (vectorReceivedNumbers[i] < 0);
        }
    }

    public static void DisplaysVectorReceivedNumbers(int vectorReceivedNumbers[]) {
        System.out.println("\nNúmeros recebidos");
        for (int i = 0; i < vectorReceivedNumbers.length; i++) {
            System.out.printf("Posição %d: %d%n", i, vectorReceivedNumbers[i]);
        }
    }

    public static void ChecksOddNumbers(int vectorReceivedNumbers[], int vectorOddNumbers[]) {
        System.out.println("\nNúmeros ímpares encontrados");

        for (int i = 0; i < vectorReceivedNumbers.length; i++) {
            if ((vectorReceivedNumbers[i] % 2) == 0) {
                System.out.printf("Posição %d: %d%n", i, vectorReceivedNumbers[i]);
            }

            if ((vectorReceivedNumbers[i] % 2) == 1) {
                vectorOddNumbers[i] = vectorReceivedNumbers[i];
                System.out.printf("Posição %d: %d <-%n", i, vectorReceivedNumbers[i]);
            }
        }
    }

    public static void DisplaysVectorOddNumbers(int vectorReceivedNumbers[], int vectorOddNumbers[]) {
        System.out.println("\nNovo vetor de números ímpares");

        for (int i = 0; i < vectorOddNumbers.length; i++) {
            if (vectorOddNumbers[i] != 0) {
                System.out.printf("Posição %d: %d%n", i, vectorOddNumbers[i]);
            }
        }
    }
}
