import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner reader = new java.util.Scanner(System.in);
        int codeProduct = 0;
        int quantityPurchased;
        double priceUnitaryProduct = 0.0;
        double priceTotalNote = 0.0;
        double valueDiscount = 0.0;
        double priceFinalNote = 0.0;

        System.out.println("\nEntre com os dados abaixo");
        System.out.print("Digite o código do produto: ");
        codeProduct = reader.nextInt();

        while (codeProduct < 1 || codeProduct > 40) {
            System.out.print("ERRO: Fora do intervalo, escolha somente [1 a 40]: ");
            codeProduct = reader.nextInt();
        }

        System.out.print("Digite a quantidade comprada [Un]: ");
        quantityPurchased = reader.nextInt();

        switch (codeProduct) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                priceUnitaryProduct = 10.00;
                break;

            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                priceUnitaryProduct = 15.00;
                break;

            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
                priceUnitaryProduct = 20.00;
                break;

            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
                priceUnitaryProduct = 30.00;
                break;

            default:
                break;
        }

        System.out.println("\nEXIBIÇÃO DOS DADOS");
        System.out.printf("Preço unitário do produto: R$ %.2f%n", priceUnitaryProduct);

        priceTotalNote = priceUnitaryProduct * quantityPurchased;

        System.out.printf("Preço total da nota: R$ %.2f%n", priceTotalNote);

        if (priceTotalNote <= 250.00) {
            valueDiscount = (priceTotalNote * 5) / 100;
        } else if (priceTotalNote <= 500.00) {
            valueDiscount = (priceTotalNote * 10) / 100;
        } else {
            valueDiscount = (priceTotalNote * 15) / 100;
        }

        System.out.printf("Valor do desconto: R$ %.2f%n", valueDiscount);

        priceFinalNote = priceTotalNote - valueDiscount;

        System.out.printf("Preço final da nota: R$ %.2f%n%n", priceFinalNote);

        reader.close();
    }
}
