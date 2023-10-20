import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner readerScanner = new Scanner(System.in);

        int highestValue = 0;
        int firstValue;
        int secondValue;
        int thirdValue;

        System.out.println("\nEntre com os dados solicitados abaixo");
        System.out.print("Digite o primeiro número inteiro: ");
        firstValue = readerScanner.nextInt();

        System.out.print("Digite o segundo  número inteiro: ");
        secondValue = readerScanner.nextInt();

        System.out.print("Digite o terceiro número inteiro: ");
        thirdValue = readerScanner.nextInt();

        if ((firstValue > secondValue) && (firstValue > thirdValue)) {
            highestValue = firstValue;

        } else if ((secondValue > firstValue) && (secondValue > thirdValue)) {
            highestValue = secondValue;

        } else if ((thirdValue > firstValue) && (thirdValue > secondValue)) {
            highestValue = thirdValue;
        }

        System.out.println("\nExibindo dados");
        System.out.printf("O maior valor entre %d, %d e %d é: %d", firstValue, secondValue, thirdValue,
                highestValue);

        readerScanner.close();
    }
}
