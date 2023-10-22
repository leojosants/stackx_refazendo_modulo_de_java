import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner readerScanner = new Scanner(System.in);

        double purchaseValue = 0.0;
        double profitValue = 0.0;
        double saleValue = 0.0;

        System.out.println("\nEntre com os dados abaixo solicitados");

        do {
            System.out.print("Digite o valor da a compra: R$ ");
            purchaseValue = readerScanner.nextDouble();

            while (purchaseValue <= 0) {
                System.out.print("Digite um valor positivo e maior que zero para a compra: R$ ");
                purchaseValue = readerScanner.nextDouble();
            }
        } while (purchaseValue <= 0);

        if (purchaseValue < 20.00) {
            profitValue = (purchaseValue * 45) / 100;
            saleValue = purchaseValue + profitValue;

        } else {
            profitValue = (purchaseValue * 30) / 100;
            saleValue = purchaseValue + profitValue;
        }

        System.out.println("\nExibindo dados");
        System.out.printf("Valor da compra: %.2f%n", purchaseValue);
        System.out.printf("Valor da venda : %.2f%n", saleValue);
        System.out.printf("Valor do lucro : %.2f%n", profitValue);

        readerScanner.close();
    }
}