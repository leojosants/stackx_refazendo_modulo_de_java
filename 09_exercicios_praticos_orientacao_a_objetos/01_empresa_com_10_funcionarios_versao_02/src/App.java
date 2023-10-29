import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import classes.EmployeeV2;
import classes.PayStub;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        try {

            List<PayStub> payStub_list = new ArrayList<PayStub>();
            int totalNumberOfEmployees = 2;

            System.out.println("\nEntre com os dados abaixo");

            for (int i = 1; i <= totalNumberOfEmployees; i++) {
                System.out.printf("\nCadastrando %dº funcionário %n", i);

                int employeeCode = requestEmployeeCode(scanner);
                int numberOfHoursWorkedInTheMonth = requestNumberOfHoursWorked(scanner);
                char employeeWorkShift = requestEmployeeWorkShift(scanner);
                char employeeJobCategory = requestEmployeeJobCategory(scanner);

                EmployeeV2 employee = new EmployeeV2(employeeCode, employeeWorkShift,
                        employeeJobCategory);

                PayStub payStub = new PayStub(employee);
                payStub.setNumberOfHoursWorkedInTheMonth(numberOfHoursWorkedInTheMonth);
               
                payStub_list.add(payStub);

                System.out.println("-> Funcionário cadastrado com sucesso");
                System.out.println("\n=====**=====**=====Funcionário cadastrado com sucesso=====**=====**=====");
            }

            System.out.println("\nListagem de funcionarios");

            for (PayStub payStub : payStub_list) {
                payStub.printEmploee();
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
