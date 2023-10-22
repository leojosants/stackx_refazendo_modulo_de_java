import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner readerScanner = new Scanner(System.in);

        double purchasePrice = 0.0;
        double saleValue = 0.0;
        double profitValue = 0.0;

        System.out.println("\nEntre com os dados abaixo solicitados");

        do {
            System.out.print("Digite o valor da compra: R$ ");
            purchasePrice = readerScanner.nextDouble();

            while (purchasePrice <= 0) {
                System.out.print("Digite o valor positivo e maior que zero para a compra: R$ ");
                purchasePrice = readerScanner.nextDouble();
            }
        } while (purchasePrice <= 0);

        if (purchasePrice < 10.00) {
            profitValue = (purchasePrice * 70) / 100;
            saleValue = purchasePrice + profitValue;

        } else if (purchasePrice < 30.00) {
            profitValue = (purchasePrice * 50) / 100;
            saleValue = purchasePrice + profitValue;

        } else if (purchasePrice < 50.00) {
            profitValue = (purchasePrice * 40) / 100;
            saleValue = purchasePrice + profitValue;

        } else {
            profitValue = (purchasePrice * 30) / 100;
            saleValue = purchasePrice + profitValue;
        }

        System.out.println("\nExibindo dados");
        System.out.printf("Valor da compra: R$ %.2f%n", purchasePrice);
        System.out.printf("Valor da venda: R$ %.2f%n", saleValue);
        System.out.printf("Valor do lucro: R$ %.2f%n", profitValue);

        readerScanner.close();
    }
}