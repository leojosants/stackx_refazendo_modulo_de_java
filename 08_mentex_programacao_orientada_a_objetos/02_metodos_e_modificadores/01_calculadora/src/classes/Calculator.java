package classes;
public class Calculator {

    private int sum(int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;
        return result;
    }

    private int subtract(int firstNumber, int secondNumber) {
        int result = firstNumber - secondNumber;
        return result;
    }

    private int multiply(int firstNumber, int secondNumber) {
        int result = firstNumber * secondNumber;
        return result;
    }

    private int toDivide(int firstNumber, int secondNumber) {
        int result = firstNumber / secondNumber;
        return result;
    }

    public void performOperation(int firstNumber, char operator, int secondNumber) {
        if (operator == '+') {
            System.out.printf("Resultado da operação: %d%n", sum(firstNumber, secondNumber));
        }

        if (operator == '-') {
            System.out.printf("Resultado da operação: %d%n", subtract(firstNumber, secondNumber));
        }

        if (operator == '*') {
            System.out.printf("Resultado da operação: %d%n", multiply(firstNumber, secondNumber));
        }

        if (operator == '/') {
            System.out.printf("Resultado da operação: %d%n", toDivide(firstNumber, secondNumber));
        }
    }
}
