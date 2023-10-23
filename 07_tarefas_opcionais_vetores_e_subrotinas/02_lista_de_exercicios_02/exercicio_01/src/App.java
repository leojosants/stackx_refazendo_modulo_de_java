import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            DisplaysInitialMessage();
            double salary = ReturnSalary(scanner);
            double adjustedSalary = ReturnAdjustedSalary(scanner, salary);
            DisplaysData(salary, adjustedSalary);

        } catch (InputMismatchException e) {
            System.out.println("Erro, entrada de dados inválida");

        } catch (Exception e) {
            System.out.println(e);

        } finally {
            scanner.close();
            System.out.println("\nFim do programa");
        }
    }

    /* SUB-ROUTINES */
    public static void DisplaysInitialMessage() {
        System.out.println("\nInforme os dados solicitados abaixo");
    }

    public static double ReturnSalary(Scanner scanner) {
        double salary = 0.0;

        do {
            System.out.print("Digite o salário [utilize vírgula como separador]: R$ ");
            salary = scanner.nextDouble();
        } while (salary < 0);

        return salary;
    }

    public static double ReturnAdjustedSalary(Scanner scanner, double salary) {
        double adjustedSalary = 0.0;
        double reajuste = (salary * 15) / 100;
        adjustedSalary = salary + reajuste;
        return adjustedSalary;
    }

    public static void DisplaysData(double salary, double adjustedSalary) {
        System.out.println("\nExibindo dados");
        System.out.printf("Salário inicial: R$ %.2f%n", salary);

        if (salary == 0) {
            System.out.println("O salário não sofreu reajuste");

        } else {
            System.out.printf("Salário reajustado: R$ %.2f%n", adjustedSalary);
        }
    }
}
