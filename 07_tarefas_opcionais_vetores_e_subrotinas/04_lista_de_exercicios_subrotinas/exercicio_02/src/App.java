import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        try {

            int numbers[] = { 56, 48, 9, 48, 60, 13, 24, 27, 13, 56, 85, 9, 48, 55, 9 };
            int numbersCopy[] = PerformsVectorCopy(numbers);
            int numberReceived = ReceivesDataFromTheKeyboard(scanner);

            SearchForElementsInTheVector(numbersCopy, numberReceived);

        } catch (InputMismatchException e) {
            System.out.println("Erro: entrada inválida de dados");
            
        } catch (Exception e) {
            System.out.println(e);

        } finally {
            scanner.close();
            System.out.println("Fim do programa");
        }
    }

    /* SUB-ROUTINES */
    public static int[] PerformsVectorCopy(int vector[]) {
        int vectorCopied[] = new int[vector.length];
        System.arraycopy(vector, 0, vectorCopied, 0, vector.length);
        return vectorCopied;
    }

    public static int ReceivesDataFromTheKeyboard(Scanner scanner) {
        int number = 0;

        do {
            System.out.print("Digite um valor inteiro [positivo]: ");
            number = scanner.nextInt();
        } while (number < 0);

        return number;
    }

    public static void SearchForElementsInTheVector(int vector[], int numberSearched) {
        int totalNumberOfTimesTheNumberWasFound = 0;
        String message = "";

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == numberSearched) {
                totalNumberOfTimesTheNumberWasFound += 1;
                message = "SIM";
            } else {
                message = "NAO";
            }
        }

        System.out.println("\nExibindo informação");
        System.out.printf("Número pesquisado: %d%n", numberSearched);
        System.out.printf("Número encontrado: %s%n", message);
        System.out.printf("Total: %d vez(s)%n", totalNumberOfTimesTheNumberWasFound);
    }
}
