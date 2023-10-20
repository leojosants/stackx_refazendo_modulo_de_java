import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner readerScanner = new Scanner(System.in);

        int totalMonths = 0;

        String employeeCarlos = "Carlos";
        double salaryEmployeeCarlos = 0.0;
        double percentageIncomeMonthlyCarlos = 0.0;
        double valueFinalIncomeMonthlyCarlos = 0.0;

        String employeeJoao = "João";
        double salaryEmployeeJoao = 0.0;
        double percentageIncomeMonthlyJoao = 0.0;
        double valueFinalIncomeMonthlyJoao = 0.0;

        double differenceBetweenFinalValues = 0.0;

        System.out.println("\nEntre com os dados solicitados");

        do {
            System.out.printf("Salário do funcionário %s: R$ ", employeeCarlos);
            salaryEmployeeCarlos = readerScanner.nextDouble();
        } while (salaryEmployeeCarlos <= 0.0);

        salaryEmployeeJoao = salaryEmployeeCarlos / 3;
        percentageIncomeMonthlyCarlos = (salaryEmployeeCarlos * 2) / 100;
        percentageIncomeMonthlyJoao = (salaryEmployeeJoao * 5) / 100;
        valueFinalIncomeMonthlyCarlos = salaryEmployeeCarlos + percentageIncomeMonthlyCarlos;
        valueFinalIncomeMonthlyJoao = salaryEmployeeJoao + percentageIncomeMonthlyJoao;
        differenceBetweenFinalValues = valueFinalIncomeMonthlyCarlos - valueFinalIncomeMonthlyJoao;

        System.out.printf("\nExibindo dados do funcionário %s%n", employeeCarlos);
        System.out.printf("Salário: R$ %.2f%n", salaryEmployeeCarlos);
        System.out.printf("Percentual de rendimento mensal: R$ %.2f%n", percentageIncomeMonthlyCarlos);
        System.out.printf("Valor final de rendimento mensal: R$ %.2f%n", valueFinalIncomeMonthlyCarlos);

        System.out.printf("\nExibindo dados do funcionário %s%n", employeeJoao);
        System.out.printf("Salário: R$ %.2f%n", salaryEmployeeJoao);
        System.out.printf("Percentual de rendimento mensal: R$ %.2f%n", percentageIncomeMonthlyJoao);
        System.out.printf("Valor final de rendimento mensal: R$ %.2f%n", valueFinalIncomeMonthlyJoao);

        System.out.printf("Diferença de valores de %s para %s: R$ %.2f%n", employeeCarlos, employeeJoao,
                differenceBetweenFinalValues);

        // verificar se lógica esta correta
        while (valueFinalIncomeMonthlyJoao < differenceBetweenFinalValues) {
            valueFinalIncomeMonthlyJoao += percentageIncomeMonthlyJoao;
            totalMonths++;
        }

        System.out.printf("Quantidade de meses para %s se igualar ou ultrapassar o valor de %s: %d",
                employeeJoao, employeeCarlos, totalMonths);

        readerScanner.close();
    }
}
