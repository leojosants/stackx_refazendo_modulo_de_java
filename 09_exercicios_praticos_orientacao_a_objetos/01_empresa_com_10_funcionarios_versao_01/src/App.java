import java.util.InputMismatchException;
import java.util.Scanner;

import classes.Employee;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        try {

            int totalNumberOfEmployees = 10;

            Employee employee_vector[] = new Employee[totalNumberOfEmployees];

            int counter = 0;

            System.out.println("\nEntre com os dados abaixo");

            do {
                System.out.printf("\nCadastrando %dº funcionário %n", (counter + 1));

                int employeeCode = requestEmployeeCode(scanner);
                int numberOfHoursWorkedInTheMonth = requestNumberOfHoursWorked(scanner);
                char employeeWorkShift = requestEmployeeWorkShift(scanner);
                char employeeJobCategory = requestEmployeeJobCategory(scanner);

                employee_vector[counter] = new Employee(employeeCode, numberOfHoursWorkedInTheMonth, employeeWorkShift,
                        employeeJobCategory);

                System.out.println("-> Funcionário cadastrado com sucesso");
                System.out.println("\n=====**=====**=====Funcionário cadastrado com sucesso=====**=====**=====");

                counter++;
            } while (counter < totalNumberOfEmployees);

            for (int i = 0; i < employee_vector.length; i++) {
                employee_vector[i].displayData();
            }

        } catch (InputMismatchException e) {
            System.out.println("--> erro: entrada inválida de dados");

        } catch (Exception e) {
            System.out.println(e);

        } finally {
            scanner.close();
            System.out.println("\n-> Fim do programa");
        }
    }

    /* SUB-ROUTINES */
    public static int requestEmployeeCode(Scanner scanner) {
        int employeeCode = 0;

        do {
            System.out.print("Digite um valor positivo e inteiro para 'Código': ");
            employeeCode = scanner.nextInt();

            while (employeeCode < 0) {
                System.out.print("-> Informe [somente] valore(s) positivo(s) e inteiro(s) para 'Código': ");
                employeeCode = scanner.nextInt();
            }
        } while (employeeCode < 0);

        return employeeCode;
    }

    public static int requestNumberOfHoursWorked(Scanner scanner) {
        int numberOfHoursWorkedInTheMonth = 0;

        do {
            System.out
                    .print("\nDigite um valor positivo e inteiro para 'Números de horas trabalhadas no mês': ");
            numberOfHoursWorkedInTheMonth = scanner.nextInt();

            while (numberOfHoursWorkedInTheMonth < 0) {
                System.out.print(
                        "-> Informe [somente] valore(s) positivo(s) e inteiro(s) para 'Números de horas trabalhadas no mês': ");
                numberOfHoursWorkedInTheMonth = scanner.nextInt();
            }
        } while (numberOfHoursWorkedInTheMonth < 0);

        return numberOfHoursWorkedInTheMonth;
    }

    public static char requestEmployeeWorkShift(Scanner scanner) {
        char employeeWorkShift;

        do {
            System.out.println("\nEscolha uma opção abaixo para 'Turno de trabalho'");
            System.out.println("[ M - Matutino ], [ V - Vespertino ] ou [ N - Noturno ]");

            System.out.print("Digite sua opção: ");
            employeeWorkShift = scanner.next().toUpperCase().charAt(0);

            while ((employeeWorkShift != 'M') &&
                    (employeeWorkShift != 'V') &&
                    (employeeWorkShift != 'N')) {
                System.out.println(
                        "\n-> Informe somente [ M  -  Matutino ], [ V - Vespertino ] ou [ N - Noturno ] para 'Turno de trabalho'");

                System.out.print("Digite sua opção: ");
                employeeWorkShift = scanner.next().toUpperCase().charAt(0);
            }
        } while ((employeeWorkShift != 'M') &&
                (employeeWorkShift != 'V') &&
                (employeeWorkShift != 'N'));

        return employeeWorkShift;
    }

    public static char requestEmployeeJobCategory(Scanner scanner) {
        char employeeJobCategory;

        do {
            System.out.println("\nEscolha uma opção abaixo para 'Categoria'");
            System.out.println("[ O - Operário ] ou [ G - Gerente ]");

            System.out.print("Digite sua opção: ");
            employeeJobCategory = scanner.next().toUpperCase().charAt(0);

            while ((employeeJobCategory != 'O') && (employeeJobCategory != 'G')) {
                System.out.println("\n-> Informe somente [ O - Operário ] ou [ G - Gerente] para 'Categoria'");

                System.out.print("Digite sua opção: ");
                employeeJobCategory = scanner.next().toUpperCase().charAt(0);
            }
        } while ((employeeJobCategory != 'O') && (employeeJobCategory != 'G'));

        return employeeJobCategory;
    }
}
