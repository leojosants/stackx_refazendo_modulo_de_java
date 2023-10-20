import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner readerScanner = new Scanner(System.in);

        int firstValue;
        int secondValue;
        int highestValue;

        System.out.println("\nEntre com os dados solicitados abaixo");
        System.out.print("Digite um valor inteiro: ");
        firstValue = readerScanner.nextInt();

        System.out.print("Digite outro valor inteiro: ");
        secondValue = readerScanner.nextInt();

        highestValue = Math.max(firstValue, secondValue);

        System.out.println("\nExibindo dados");
        System.out.printf("O maior valor entre %d e %d é: %d", firstValue, secondValue, highestValue);

        readerScanner.close();
    }
}
