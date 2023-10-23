import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner reader = new Scanner(System.in);

        try {
            int firstNumber = ReturnsFirstNumber(reader);
            int secondNumber = ReturnsSecondNumber(reader);
            int sum = ReturnsSum(firstNumber, secondNumber);
            int subtraction = ReturnsSubtraction(firstNumber, secondNumber);
            int multiplication = ReturnsMultiplication(firstNumber, secondNumber);
            int division = ReturnsDivision(firstNumber, secondNumber);

            DisplaysData(firstNumber, secondNumber, sum, subtraction, multiplication, division);

        } catch (InputMismatchException e) {
            System.out.println("Erro, entrada inválida");
        
        } catch (ArithmeticException e) {
            System.out.println("Erro, não é possível realizar divisão por zero");
        
        } catch (Exception e) {
            System.out.println(e);

        } finally {
            reader.close();
            System.out.println("\nFim do programa");
        }
    }

    /* SUB-ROUTINES */
    public static int ReturnsFirstNumber(Scanner reader) {
        int firstNumber = 0;

        do {
            System.out.print("Digite o primeiro número [inteiro]: ");
            firstNumber = reader.nextInt();
        } while (firstNumber < 0);

        return firstNumber;
    }

    public static int ReturnsSecondNumber(Scanner reader) {
        int secondNumber = 0;

        do {
            System.out.print("Digite o segundo número [inteiro]: ");
            secondNumber = reader.nextInt();
        } while (secondNumber < 0);

        return secondNumber;
    }

    public static int ReturnsSum(int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;
        return result;
    }

    public static int ReturnsSubtraction(int firstNumber, int secondNumber) {
        int result = firstNumber - secondNumber;
        return result;
    }

    public static int ReturnsMultiplication(int firstNumber, int secondNumber) {
        int result = firstNumber * secondNumber;
        return result;
    }

    public static int ReturnsDivision(int firstNumber, int secondNumber) {
        int result = firstNumber / secondNumber;
        return result;
    }

    public static void DisplaysData(int firstNumber, int secondNumber, int sum, int subtraction, int multiplication,int division) {
        System.out.println("\nExibindo dados");
        System.out.printf("Primeiro número: %d%n", firstNumber);
        System.out.printf("Segundo número: %d%n", secondNumber);
        System.out.printf("Soma: %d%n", sum);
        System.out.printf("Subtração: %d%n", subtraction);
        System.out.printf("Multiplicação: %d%n", multiplication);
        System.out.printf("Divisão: %d%n", division);
    }
}
