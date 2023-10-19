import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        double firstNumber = 0.0;
        double secondNumber = 0.0;
        double averageBetweenNumbers = 0.0;
        double differenceBiggestSmallestNumber = 0.0;
        double higherNumber = 0.0;
        double smallestNumber = 0.0;
        double resultDivision = 0.0;
        double resultMultiplication = 0.0;
        int userOption = 0;
        double sumOfNumbers = 0.0;
        char optionContinue = 'S';

        System.out.println("\nENTRE COM OS DADOS");
        System.out.print("Primeiro número: ");
        firstNumber = reader.nextDouble();

        System.out.print("Segundo número: ");
        secondNumber = reader.nextDouble();

        sumOfNumbers = firstNumber + secondNumber;

        do {
            System.out.println("\nEscolha uma opção para ver o resultado:");
            System.out.println("\t[1] - Média entre os números digitados.");
            System.out.println("\t[2] - Diferença do maior pelo menor.");
            System.out.println("\t[3] - Produto entre os numeros digitados.");
            System.out.println("\t[4] - Divisão do primeiro pelo segundo.");

            System.out.print("Digite a sua opção: ");
            userOption = reader.nextInt();

            while ((userOption != 1) && (userOption != 2) && (userOption != 3) && (userOption != 4)) {
                System.out.print("Opção inválida, digite somente 1 a 4: ");
                userOption = reader.nextInt();
            }

            System.out.println("\nEXIBIÇÃO DE DADOS");

            switch (userOption) {
                case 1:
                    averageBetweenNumbers = sumOfNumbers / 2;
                    System.out.printf("Média entre os números digitados: %.2f%n", averageBetweenNumbers);
                    break;

                case 2:
                    smallestNumber = Math.min(firstNumber, secondNumber);
                    higherNumber = Math.max(firstNumber, secondNumber);
                    differenceBiggestSmallestNumber = higherNumber - smallestNumber;
                    System.out.printf("Diferença do maior pelo menor: %.2f%n", differenceBiggestSmallestNumber);
                    break;

                case 3:
                    resultMultiplication = firstNumber * secondNumber;
                    System.out.printf("Produto entre os numeros digitados: %.2f%n", resultMultiplication);
                    break;

                case 4:
                    while (secondNumber == 0) {
                        System.out.print("Não é possível realizar divisão por zero, digite outro número: ");
                        secondNumber = reader.nextDouble();
                    }

                    resultDivision = firstNumber / secondNumber;
                    System.out.printf("Divisão do primeiro pelo segundo: %.2f%n%n", resultDivision);

                    break;

                default:
                    break;
            }

            System.out.print("Quer continuar [S / N]? ");
            optionContinue = reader.next().toUpperCase().charAt(0);

        } while (optionContinue != 'N');

        reader.close();
    }
}
