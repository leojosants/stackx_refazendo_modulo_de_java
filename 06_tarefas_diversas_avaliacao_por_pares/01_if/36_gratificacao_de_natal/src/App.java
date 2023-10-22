import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner readerScanner = new Scanner(System.in);

        double numberOfOvertimeHours = 0.0;
        double numberOfHoursAbsent = 0.0;
        double gratification = 0.0;
        double calculationOfHours = 0.0;

        System.out.println("\nEntre com os dados abaixo solicitados");

        do {
            System.out.print("Digite o número de horas-extras do funcionário: ");
            numberOfOvertimeHours = readerScanner.nextDouble();

            while (numberOfOvertimeHours < 0) {
                System.out.print("Digite um valor positivo para o número de horas-extras do funcionário: ");
                numberOfOvertimeHours = readerScanner.nextDouble();
            }
        } while (numberOfOvertimeHours < 0);

        do {
            System.out.print("Digite o número de horas-faltas do funcionário: ");
            numberOfHoursAbsent = readerScanner.nextDouble();

            while (numberOfHoursAbsent < 0) {
                System.out.print("Digite um valor positivo para o número de horas-faltas do funcionário: ");
                numberOfHoursAbsent = readerScanner.nextDouble();
            }
        } while (numberOfHoursAbsent < 0);

        calculationOfHours = numberOfOvertimeHours - 2 / 3 * numberOfHoursAbsent;

        if (calculationOfHours < 600) {
            gratification = 100.00;

        } else if (calculationOfHours < 1_200) {
            gratification = 200.00;

        } else if (calculationOfHours < 1_800) {
            gratification = 300.00;

        } else if (calculationOfHours <= 2_400) {
            gratification = 400.00;

        } else {
            gratification = 500.00;
        }

        System.out.println("\nExibindo dados");
        System.out.printf("Número de horas-extras: %.2f%n", numberOfOvertimeHours);
        System.out.printf("Número de horas-faltas: %.2f%n", numberOfHoursAbsent);
        System.out.printf("Calculo H: %.2f%n", calculationOfHours);
        System.out.printf("Gratificação: %.2f%n", gratification);

        readerScanner.close();
    }
}