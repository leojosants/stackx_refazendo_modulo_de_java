import java.util.InputMismatchException;
import java.util.Scanner;

import classes.Calculator;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        try {

            Calculator calculator = new Calculator();

            int firstNumber = solicitarPrimeiroNumero(scanner);
            char operator = solicitarOperador(scanner);
            int secondNumber = solicitarSegundoNumero(scanner);

            calculator.performOperation(firstNumber, operator, secondNumber);

        } catch (ArithmeticException e) {
            System.out.println("--> erro: não é possível realizar divisão por zero");

        } catch (InputMismatchException e) {
            System.out.println("--> erro: entrada inválida de dados");

        } catch (Exception e) {
            System.out.println(e);

        } finally {
            scanner.close();
            System.out.println("Programa finalizado");
        }
    }

    /* SUB-ROUTINES */
    private static int solicitarPrimeiroNumero(Scanner scanner) {
        System.out.print("\nInforme o primeiro número: ");
        int firstNumber = scanner.nextInt();
        return firstNumber;
    }

    private static char solicitarOperador(Scanner scanner) {
        char operator;

        do {
            System.out.print("Informe o operator [ + - * / ]: ");
            operator = scanner.next().charAt(0);
        } while ((operator != '+') && (operator != '-') && (operator != '*') && (operator != '/'));

        return operator;
    }

    private static int solicitarSegundoNumero(Scanner scanner) {
        System.out.print("Informe o segundo número: ");
        int secondNumber = scanner.nextInt();
        return secondNumber;
    }
}
