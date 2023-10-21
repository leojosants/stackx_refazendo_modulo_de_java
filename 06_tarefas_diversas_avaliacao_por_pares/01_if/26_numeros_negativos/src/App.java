import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner readerScanner = new Scanner(System.in);

        int firstNumber = 0;
        int secondNumber = 0;
        int thirdNumber = 0;
        int counter = 0;

        boolean statusFirstNumber = false;
        boolean statusSecondNumber = false;
        boolean statusThirdNumber = false;

        System.out.println("\nEntre com os dados abaixo solicitados");
        System.out.print("Digite o primeiro número inteiro: ");
        firstNumber = readerScanner.nextInt();

        System.out.print("Digite o segundo  número inteiro: ");
        secondNumber = readerScanner.nextInt();

        System.out.print("Digite o terceiro número inteiro: ");
        thirdNumber = readerScanner.nextInt();

        if (firstNumber < 0) {
            counter += 1;
            statusFirstNumber = true;
        }

        if (secondNumber < 0) {
            counter += 1;
            statusSecondNumber = true;
        }

        if (thirdNumber < 0) {
            counter += 1;
            statusThirdNumber = true;
        }

        System.out.println("\nExibindo dados");
        System.out.printf("O número %d é negativo? %b%n", firstNumber, statusFirstNumber);
        System.out.printf("O número %d é negativo? %b%n", secondNumber, statusSecondNumber);
        System.out.printf("O número %d é negativo? %b%n", thirdNumber, statusThirdNumber);
        System.out.printf("Total de números negativo(s): %d%n", counter);

        readerScanner.close();
    }
}