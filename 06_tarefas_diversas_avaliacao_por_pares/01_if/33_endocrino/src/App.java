import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner readerScanner = new Scanner(System.in);

        double bodyMassIndex = 0.0;
        double weight = 0.0;
        double height = 0.0;
        String riskStrip = "";

        System.out.println("\nEntre com os dados abaixo solicitados");

        do {
            System.out.print("Digite o peso   [kg]: ");
            weight = readerScanner.nextDouble();

            while (weight < 0) {
                System.out.print("Digite um valor positivo para o peso [kg]: ");
                weight = readerScanner.nextDouble();
            }
        } while (weight < 0);

        do {
            System.out.print("Digite a altura [m ]: ");
            height = readerScanner.nextDouble();

            while (height < 0) {
                System.out.print("Digite um valor positivo para a altura [m]: ");
                height = readerScanner.nextDouble();
            }
        } while (height < 0);

        bodyMassIndex = weight / (height * height);

        if (bodyMassIndex < 20) {
         riskStrip = "Abaixo do peso";

        } else if (bodyMassIndex <= 25) {
         riskStrip = "Peso normal";

        } else if (bodyMassIndex <= 30) {
         riskStrip = "Excesso de peso";

        } else if (bodyMassIndex <= 35) {
         riskStrip = "Obesidade";

        } else {
         riskStrip = "Obesidade mórbida";
        }

        System.out.println("\nExibindo dados");
        System.out.printf("IMC: %.2f%n", bodyMassIndex);
        System.out.printf("Faixa de risco: %s%n", riskStrip);

        readerScanner.close();
    }
}