import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        double increasevalue = 0.0;
        double taxvalue = 0.0;
        double newPrice = 0.0;
        double price = 0.0;
        int category = 0;
        char situation;

        System.out.println("\nEntre com os dados do produto:");
        System.out.print("Preço: R$ ");
        price = reader.nextDouble();

        System.out.println("\nCATEGORIA:");
        System.out.println("\t[1] - Limpeza");
        System.out.println("\t[2] - Alimentação");
        System.out.println("\t[3] - Vestuário: ");
        System.out.print("Informe a categoria: ");
        category = reader.nextInt();

        while ((category != 1) && (category != 2) && (category != 3)) {
            System.out.print("ERRO, informe somente [1] [2] ou [3]: ");
            category = reader.nextInt();
        }

        System.out.println("\nSITUAÇÃO:");
        System.out.println("\t[R] - Produtos que necessitam de refrigeração");
        System.out.println("\t[N] - Produtos que não necessitam de refrigeração");
        System.out.print("Informe a opção: ");
        situation = reader.next().toUpperCase().charAt(0);

        while ((situation != 'R') && (situation != 'N')) {
            System.out.print("ERRO, informe somente [R] ou [N]: ");
            situation = reader.next().toUpperCase().charAt(0);
        }

        if (price <= 25) {
            switch (category) {
                case 1:
                    increasevalue += price * 0.05;
                    break;

                case 2:
                    increasevalue += price * 0.08;
                    break;

                case 3:
                    increasevalue += price * 0.1;
                    break;

                default:
                    break;
            }
        } else {
            switch (category) {
                case 1:
                    increasevalue += price * 0.12;
                    break;

                case 2:
                    increasevalue += price * 0.15;
                    break;

                case 3:
                    increasevalue += price * 0.18;
                    break;

                default:
                    break;
            }
        }

        System.out.println("\nEXIBIÇÃO DOS DADOS");
        System.out.printf("\tPreço inicial: R$ %.2f%n", price);
        System.out.printf("\tValor do aumento: R$ %.2f%n", increasevalue);

        newPrice += price + increasevalue - taxvalue;

        System.out.printf("\tNovo preço: R$ %.2f%n", newPrice);

        if (newPrice <= 50) {
            System.out.print("\tClassificação: Barato");

        } else {
            if ((newPrice > 50) && (newPrice < 120)) {
                System.out.print("\tClassificação: Normal");

            } else {
                System.out.println("\tClassificação: Caro");
            }
        }

        reader.close();
    }
}
