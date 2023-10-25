import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        try {
        
            int numbers[] = { 91, 10, 50, 89, 45, 80, 2, 45, 3, 105, 95, 13, 26, 49, 50 };
            int numbersCopy[] = PerformsVectorCopy(numbers);
            int numberReceived = RecebeDadosDoTeclado(scanner);
            SearchForElementsInTheVector(numbersCopy, numberReceived);
        
        } catch (InputMismatchException e) {
            System.out.println("Erro, entrada inválida de dados");
        
        } catch (Exception e) {
            System.out.println(e);
        
        } finally {
            scanner.close();
            System.out.println("Programa finalizado");
        }
    }

    /* SUB-ROUTINES */
    public static int[] PerformsVectorCopy(int vector[]) {
        int vectorCopied[] = new int[vector.length];
        System.arraycopy(vector, 0, vectorCopied, 0, vector.length);
        return vectorCopied;
    }

    public static int RecebeDadosDoTeclado(Scanner scanner) {
        int number = 0;

        do {
            System.out.print("Digite um valor inteiro [positivo]: ");
            number = scanner.nextInt();
        } while (number < 0);

        return number;
    }

    public static void SearchForElementsInTheVector(int vector[], int numberSearched) {
        String message = "";

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == numberSearched) {
                message = "SIM";

            } else {
                message = "NÃO";
            }
        }

        System.out.printf("Número pesquisado: %d%n", numberSearched);
        System.out.printf("Número encontrado: %s%n", message);
    }
}
