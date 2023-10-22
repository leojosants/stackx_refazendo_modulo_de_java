import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner readerScanner = new Scanner(System.in);

        double consumerCost = 0.0;
        double factoryCost = 0.0;
        double distributorPercentage = 0.0;
        double percentageOfTaxes = 0.0;

        System.out.println("\nEntre com os dados abaixo solicitados");

        do {
            System.out.print("Digite o custo de fábrica de um carro: R$ ");
            factoryCost = readerScanner.nextDouble();

            while (factoryCost <= 0) {
                System.out
                        .print("Informe somente valor positivo e maior que zero para o custo de fábrica de um carro: R$ ");
                factoryCost = readerScanner.nextDouble();
            }
        } while (factoryCost <= 0);

        if (factoryCost <= 12_000.00) {
            distributorPercentage = (factoryCost * 5) / 100;
            consumerCost = factoryCost + distributorPercentage + percentageOfTaxes;

        } else if (factoryCost <= 25_000.00) {
            distributorPercentage = (factoryCost * 10) / 100;
            percentageOfTaxes = (factoryCost * 15) / 100;
            consumerCost = factoryCost + distributorPercentage + percentageOfTaxes;

        } else {
            distributorPercentage = (factoryCost * 15) / 100;
            percentageOfTaxes = (factoryCost * 20) / 100;
            consumerCost = factoryCost + distributorPercentage + percentageOfTaxes;
        }

        System.out.println("\nExibindo dados");
        System.out.printf("Custo de fábrica: R$ %.2f%n", factoryCost);
        System.out.printf("Custo do consumidor: R$ %.2f%n", consumerCost);

        readerScanner.close();
    }
}