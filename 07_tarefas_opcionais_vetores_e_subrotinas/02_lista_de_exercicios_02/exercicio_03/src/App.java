import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        try {
            DisplaysInitialMessage();
            double applePriceIfLessThan12Uunits = 1.30;
            double applePriceIfLessThan12Units = 1.00;
            int quantityOfApplesPurchased = ReturnsQuantityOfApplesPurchased(scanner);
            double totalPurchaseCost = ReturnsTotalPurchaseCost(applePriceIfLessThan12Uunits, applePriceIfLessThan12Units, quantityOfApplesPurchased);
            DisplaysData(quantityOfApplesPurchased, totalPurchaseCost);

        } catch (InputMismatchException e) {
            System.out.println("Erro, entrada de dados inválida");

        } catch (Exception e) {
            System.out.println(e);

        } finally {
            scanner.close();
            System.out.println("\nFim do programa");
        }
    }

    /* SUB-ROUTINES */
    public static void DisplaysInitialMessage() {
        System.out.println("\nInforme os dados solicitados abaixo");
    }

    public static int ReturnsQuantityOfApplesPurchased(Scanner scanner) {
        int quantityOfApplesPurchased = 0;

        do {
            System.out.print("Digite a quantidade em UN de maçã(s) comprada(s) [somente valores positivos]: ");
            quantityOfApplesPurchased = scanner.nextInt();
        } while (quantityOfApplesPurchased < 0);

        return quantityOfApplesPurchased;
    }

    public static double ReturnsTotalPurchaseCost(double applePriceIfLessThan12Uunits, double applePriceIfLessThan12Units, int quantityOfApplesPurchased) {
        double totalPurchaseCost = 0.0;

        if (quantityOfApplesPurchased < 12) {
            totalPurchaseCost = quantityOfApplesPurchased * applePriceIfLessThan12Uunits;
        } else {
            totalPurchaseCost = quantityOfApplesPurchased * applePriceIfLessThan12Units;
        }

        return totalPurchaseCost;
    }

    public static void DisplaysData(int quantityOfApplesPurchased, double totalPurchaseCost) {
        System.out.println("\nExibindo dados");
        System.out.printf("Quantidade de maçã(s) comprada(s): %d UN%n", quantityOfApplesPurchased);
        System.out.printf("Custo total da compra: R$ %.2f%n", totalPurchaseCost);
    }
}