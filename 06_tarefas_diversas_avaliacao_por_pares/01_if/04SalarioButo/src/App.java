import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner readerScanner = new Scanner(System.in);

        double grossSalary = 0.0;
        double valueReceive = 0.0;
        double gratification = 0.0;
        double tax = 0.0;

        System.out.println("\nEntre com os dados solicitados.");

        do {
            System.out.print("Informe o salário bruto: R$ ");
            grossSalary = readerScanner.nextDouble();

            while (grossSalary <= 0.0) {
                System.out.print("O valor deve ser acima de R$0, tente novamente: R$ ");
                grossSalary = readerScanner.nextDouble();
            }

            if (grossSalary <= 350) {
                tax = (grossSalary * 7) / 100;
                gratification = 100;
                valueReceive = grossSalary + gratification - tax;
            } else if (grossSalary <= 600) {
                tax = (grossSalary * 7) / 100;
                gratification = 75;
                valueReceive = grossSalary + gratification - tax;
            } else if (grossSalary <= 900) {
                tax = (grossSalary * 7) / 100;
                gratification = 50;
                valueReceive = grossSalary + gratification - tax;
            } else if (grossSalary > 900) {
                tax = (grossSalary * 7) / 100;
                gratification = 35;
                valueReceive = grossSalary + gratification - tax;
            }

        } while (grossSalary <= 0.0);

        System.out.println("\nExibindo dados.");
        System.out.printf("Para o salario bruto de R$ %.2f o valor a receber será: R$ %.2f%n", grossSalary,
                valueReceive);

        readerScanner.close();
    }
}
