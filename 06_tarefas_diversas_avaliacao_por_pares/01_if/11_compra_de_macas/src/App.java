import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner readerScanner = new Scanner(System.in);

        double applePriceLessThan12Units = 0.30;
        double applePriceMoreThan11Units = 0.25;
        double valueTotalPurchase = 0.0;

        int quantityApplesPurchased = 0;

        System.out.println("\nEntre com os dados solicitados abaixo");
        System.out.print("Informe a quantidade de maçãs[UN]: ");
        quantityApplesPurchased = readerScanner.nextInt();

        System.out.println("\nExibindo dados");

        if (quantityApplesPurchased < 0) {
            System.out.println("Não é possível realizar cáclulo para valores negativos");
        } else {
            if (quantityApplesPurchased < 12) {
                valueTotalPurchase = quantityApplesPurchased * applePriceLessThan12Units;
            } else {
                valueTotalPurchase = quantityApplesPurchased * applePriceMoreThan11Units;
            }

            System.out.printf("Para a quantidade de %d maçãs, o valor da compra é: R$ %.2f", quantityApplesPurchased,
                    valueTotalPurchase);
        }

        readerScanner.close();
    }
}
