import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        try {

            DisplaysInitialMessage();
            
            int valueA = ReturnsValue(scanner, 'A');
            int valueB = ReturnsValue(scanner, 'B');
            int sum = RetornaSum(valueA, valueB);
            boolean comparison = ReturnsComparison(sum);
            
            DisplaysData(valueA, valueB, sum, comparison);

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

    public static int ReturnsValue(Scanner scanner, char valueReceivedGoesTo) {
        int value = 0;

        if (valueReceivedGoesTo == 'A') {
            do {
                System.out.print("Digite o valor de A [numero inteiro positivo]: ");
                value = scanner.nextInt();
            } while (value < 0);

        } else {
            do {
                System.out.print("Digite o valor de B [numero inteiro positivo]: ");
                value = scanner.nextInt();
            } while (value < 0);
        }

        return value;
    }

    public static int RetornaSum(int valueA, int valueB) {
        int sum = valueA + valueB;
        return sum;
    }

    public static boolean ReturnsComparison(int sum) {
        boolean isDivisibleBy2 = false;

        if ((sum % 2) == 0) {
            isDivisibleBy2 = true;
        }

        return isDivisibleBy2;
    }

    public static void DisplaysData(int valueA, int valueB, int sum, boolean comparison) {
        System.out.println("\nExibindo dados");
        System.out.printf("Valor de A: %d%n", valueA);
        System.out.printf("Valor de B: %d%n", valueB);
        System.out.printf("Soma de A e B: %d%n", sum);
        System.out.printf("A sum de A e B é divisível por 2?: %b%n", comparison);
    }
}