import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        Scanner scanner_string = new Scanner(System.in);

        try {

            System.out.println("\nDigite dois números");

            Double first_number = requestNumber(scanner, scanner_string, 0);
            Double second_number = requestNumber(scanner, scanner_string, 1);

            Double division_result = calculateDivision(first_number, second_number);
            displayResult(first_number, second_number, division_result);

        } catch (ArithmeticException e) {
            System.out.printf("%s%n", e.getMessage());

        } catch (InputMismatchException e) {
            System.out.println("-> erro: entrada inválida, esperado somente dígitos numéricos");

        } catch (Exception e) {
            System.out.println(e);

        } finally {
            scanner.close();
            System.out.println("-> fim do programa");
        }
    }

    /*
     * methods
     */
    private static Double requestNumber(Scanner scanner, Scanner scanner_string,
            int para_primeiro_valor_use_0_para_segundo_valor_use_1) {
        Double number = 0.0;

        if (para_primeiro_valor_use_0_para_segundo_valor_use_1 == 0) {
            System.out.print("Digite o primeiro número: ");
            number = scanner.nextDouble();

        } else if (para_primeiro_valor_use_0_para_segundo_valor_use_1 == 1) {
            System.out.print("Digite o segundo número: ");
            number = scanner.nextDouble();
        }

        return number;
    }

    private static Double calculateDivision(Double first_number, Double second_number) {
        Double result = 0.0;

        if (second_number == 0) {
            throw new ArithmeticException("-> erro: não é possível realizar divisão por ZERO");

        } else {
            result = first_number / second_number;
        }

        return result;
    }

    private static void displayResult(Double first_number, Double second_number, Double division_result) {
        System.out.printf("O resultado de %.2f / %.2f é: %.2f%n", first_number, second_number, division_result);
    }
}
