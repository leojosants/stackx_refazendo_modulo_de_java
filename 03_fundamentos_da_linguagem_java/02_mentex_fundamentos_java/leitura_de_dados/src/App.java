import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        String treatmentPronoun;
        String fullName;
        double price;
        int totalOfInstallments;

        System.out.print("\nComo gostaria de ser tratado - [Sr, Sra, Srta]? ");
        treatmentPronoun = reader.next();

        System.out.print("Informe seu nome completo: ");

        // buffer
        reader.nextLine();

        fullName = reader.nextLine();

        System.out.print("Qual o valor do produto: R$");
        price = reader.nextDouble();

        System.out.print("Quantidade de parcelas: ");
        totalOfInstallments = reader.nextInt();

        System.out.println("Olá " + treatmentPronoun + " " + fullName);
        System.out.println("Valor: R$" + price + " - Parcelas: " + totalOfInstallments);
        System.out.println("Valor de cada parcela: R$" + price / totalOfInstallments);

    }
}
