import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        try {
            int numbers[] = { 56, 48, 9, 48, 60, 13, 24, 27, 13, 56, 85, 9, 48, 55, 9 };
            int copyNumbers[] = MakeCopy(numbers);
            int numberReceived = RequestsData(scanner);
            int quantityTimesNumberIsFound = ReturnsQuantityTimesNumberIsFound(copyNumbers, numberReceived);

            DisplaysData(numberReceived, quantityTimesNumberIsFound);

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
    public static int[] MakeCopy(int numbers[]) {
        int copyVetor[] = new int[numbers.length];
        System.arraycopy(numbers, 0, copyVetor, 0, numbers.length);
        return copyVetor;
    }

    public static int RequestsData(Scanner scanner) {
        int numberReceived = 0;

        System.out.print("Digite um valor inteiro [positivo]: ");
        numberReceived = scanner.nextInt();

        return numberReceived;
    }

    public static int ReturnsQuantityTimesNumberIsFound(int copyNumbers[], int numberReceived) {
        int quantityTimesNumberIsFound = 0;

        for (int i = 0; i < copyNumbers.length; i++) {
            if (copyNumbers[i] == numberReceived) {
                quantityTimesNumberIsFound += 1;
            }
        }

        return quantityTimesNumberIsFound;
    }

    public static void DisplaysData(int numberReceived, int quantityTimesNumberIsFound) {
        System.out.println("\nExibindo dados");
        System.out.printf("Número recebido: %d%n", numberReceived);
        System.out.printf("Quantidade de vezes que o número %d é encontrado no vetor: %d%n", numberReceived, quantityTimesNumberIsFound);
    }
}
