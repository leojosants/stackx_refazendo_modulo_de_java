import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        try {

            DisplaysInitialMessage();

            int valueA = ReturnsValue(scanner, 'A');
            int valueB = ReturnsValue(scanner, 'B');
            int valueN = ReturnsValue(scanner, 'N');
            int sum = ReturnsSum(valueA, valueB);
            boolean comparison = ReturnsComparison(sum, valueN);

            DisplaysData(valueA, valueB, valueN, sum, comparison);

        } catch (InputMismatchException e) {
            System.out.println("Erro, entrada de dados inválida");
       
        } catch (ArithmeticException e) {
            System.out.println("Erro, não possivel realizar divisão por zero");

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

        } else if (valueReceivedGoesTo == 'B') {
            do {
                System.out.print("Digite o valor de B [numero inteiro positivo]: ");
                value = scanner.nextInt();
            } while (value < 0);

        } else {
            do {
                System.out.print("Digite o valor de N [numero inteiro positivo]: ");
                value = scanner.nextInt();
            } while (value < 0);
        }

        return value;
    }

    public static int ReturnsSum(int valueA, int valueB) {
        int sum = valueA + valueB;
        return sum;
    }

    public static boolean ReturnsComparison(int sum,int valueN) {
        boolean isDivisibleByN = false;

        if ((sum % valueN) == 0) {
            isDivisibleByN = true;
        }

        return isDivisibleByN;
    }

    public static void DisplaysData(int valueA, int valueB, int valueN,int sum, boolean comparison) {
        System.out.println("\nExibindo dados");
        System.out.printf("Valor de A: %d%n", valueA);
        System.out.printf("Valor de B: %d%n", valueB);
        System.out.printf("Valor de N: %d%n", valueN);
        System.out.printf("Soma de A e B: %d%n", sum);
        System.out.printf("A soma de A e B é divisível por N?: %b%n", comparison);
    }
}