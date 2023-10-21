import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner readerScanner = new Scanner(System.in);

        double maximumValueOfInstallments = 0.0;
        double valueOfTheInstallment = 0.0;
        double loanAmount = 0.0;
        double grossSalary = 0.0;
        boolean loanGranted = false;
        int numberOfInstallments = 0;
        String message = "";

        System.out.println("\nEntre com os dados abaixo solicitados");

        do {
            System.out.print("Digite o salário bruto: R$ ");
            grossSalary = readerScanner.nextDouble();

            while (grossSalary <= 0) {
                System.out.print("Informe somente valores positivos, tente novamente: R$ ");
                grossSalary = readerScanner.nextDouble();
            }
        } while (grossSalary <= 0);

        do {
            System.out.print("Digite o valor do empréstimo: R$ ");
            loanAmount = readerScanner.nextDouble();

            while (loanAmount <= 0) {
                System.out.print("Informe somente valores positivos, tente novamente: R$ ");
                loanAmount = readerScanner.nextDouble();
            }
        } while (loanAmount <= 0);

        do {
            System.out.print("Digite o número de parcelas: ");
            numberOfInstallments = readerScanner.nextInt();

            while (numberOfInstallments <= 0) {
                System.out.print("Informe somente valores positivos, tente novamente: ");
                numberOfInstallments = readerScanner.nextInt();
            }
        } while (numberOfInstallments <= 0);

        do {
            System.out.print("Digite o valor da parcelas: R$ ");
            valueOfTheInstallment = readerScanner.nextDouble();

            while (valueOfTheInstallment <= 0) {
                System.out.print("Informe somente valores positivos, tente novamente: R$ ");
                valueOfTheInstallment = readerScanner.nextDouble();
            }
        } while (valueOfTheInstallment <= 0);

        maximumValueOfInstallments = (grossSalary * 30) / 100;

        if (valueOfTheInstallment > maximumValueOfInstallments) {
            loanGranted = false;

        } else {
            loanGranted = true;
        }
        
        System.out.println("\nExibindo dados");
        System.out.printf("Salário bruto: R$ %.2f%n", grossSalary);
        System.out.printf("Valor do empréstimo: R$ %.2f%n", loanAmount);
        System.out.printf("Número de parcela(s): R$ %d%n", numberOfInstallments);
        System.out.printf("Valor da prestação: R$ %.2f%n", valueOfTheInstallment);

         if (loanGranted == true) {
            message = "Empréstimo concedido";
            System.out.printf("%s%n", message);
            
        } else {
            message = "Empréstimo não concedido, pois o valor máximo da prestação ultrapassa 30% do salário bruto";
            System.out.printf("%s%n", message);
            System.out.printf("Valor máximo da prestação: R$ %.2f%n", maximumValueOfInstallments);
        }


        readerScanner.close();
    }
}