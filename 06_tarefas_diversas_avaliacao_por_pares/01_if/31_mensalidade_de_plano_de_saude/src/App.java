import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner readerScanner = new Scanner(System.in);

        double amountToPay = 0.0;
        int age = 0;

        System.out.println("\nEntre com os dados abaixo solicitados");

        do {
            System.out.print("Digite a idade: ");
            age = readerScanner.nextInt();

            while (age < 0) {
                System.out.print("Digite um valor positivo para a idade: ");
                age = readerScanner.nextInt();
            }
        } while (age < 0);

        if (age <= 10) {
            amountToPay = 30.00;

        } else if (age <= 29) {
            amountToPay = 60.00;

        } else if (age <= 45) {
            amountToPay = 120.00;

        } else if (age <= 59) {
            amountToPay = 150.00;

        } else if (age <= 65) {
            amountToPay = 250.00;

        } else {
            amountToPay = 400.00;
        }

        System.out.println("\nExibindo dados");
        System.out.printf("Para a idade de %d anos o valor do plano será: R$ %.2f%n", age, amountToPay);

        readerScanner.close();
    }
}