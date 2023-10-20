import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner readerScanner = new Scanner(System.in);

        int totalEmployees = 10;
        int counter = 1;
        int code;

        int totalHoursWorkedMonth;
        double valueHourWorked = 0.0;
        double foodAid = 0.0;
        double minimumWage = 450.00;
        double initialSalary = 0.0;
        double finalSalary = 0.0;

        char shiftWork;
        char category;

        System.out.println("\nEntre com os dados abaixo");

        while (counter <= totalEmployees) {
            System.out.printf("Informe os dados do %dº funcionário%n", counter);

            // - a) Leia as informações dos funcionários, exceto o valor da hora trabalhada,
            // não permitindo que sejam informado os turnos e nem categorias inexistentes.

            System.out.print("Código: ");
            code = readerScanner.nextInt();
            code += (int) (Math.random() * 1000);

            do {
                System.out.print("Números de horas trabalhadas no mês: ");
                totalHoursWorkedMonth = readerScanner.nextInt();
            } while ((totalHoursWorkedMonth < 0) || (totalHoursWorkedMonth > 180));

            do {
                System.out.println("Turno de trabalho, informe somente as opções abaixo:");
                System.out.println("[ M ] - Matutino");
                System.out.println("[ V ] - Vespertino");
                System.out.println("[ N ] - Noturno");
                System.out.print("Digite sua opção: ");
                shiftWork = readerScanner.next().toUpperCase().charAt(0);
            } while ((shiftWork != 'M') &&
                    (shiftWork != 'V') &&
                    (shiftWork != 'N'));
            do {
                System.out.println("Categoria, informe somente as opções abaixo:");
                System.out.println("[ O ] - Operário");
                System.out.println("[ G ] - Gerente");
                System.out.print("Digite sua opção: ");
                category = readerScanner.next().toUpperCase().charAt(0);
            } while ((category != 'O') && (category != 'G'));

            System.out.println("\nFuncionário cadastrado com sucesso");

            // - b) Calcule o valor da hora trabalhada, conforme a tabela 1.
            if (category == 'G') {
                if (shiftWork == 'N') {
                    valueHourWorked = (minimumWage * 18) / 100;
                } else if ((shiftWork == 'M') || (shiftWork == 'V')) {
                    valueHourWorked = (minimumWage * 15) / 100;
                }
            } else if (category == 'O') {
                if (shiftWork == 'N') {
                    valueHourWorked = (minimumWage * 13) / 100;
                } else if ((shiftWork == 'M') || (shiftWork == 'V')) {
                    valueHourWorked = (minimumWage * 10) / 100;
                }
            }

            // - c) Calcule o salário inicial dos funcionários com base no valor da hora trabalhada e no número de horas trabalhadas;
            initialSalary = valueHourWorked * totalHoursWorkedMonth;

            // - d) Calcule o valor do auxílio alimentação recebido pelo funcionário de acordo com seu salário inicial, conforme a tabela 2;
            if (initialSalary <= 300.00) {
                foodAid = (initialSalary * 20) / 100;
            } else if (initialSalary <= 600.00) {
                foodAid = (initialSalary * 15) / 100;
            } else if (initialSalary > 600.00) {
                foodAid = (initialSalary * 5) / 100;
            }

            // - e) Mostre o código, número de horas trabalhadas, valor da hora trabalhada, salário inicial, auxílio alimentação e salário final (salário inicial + auxílio alimentação).
            System.out.printf("Código:                      %d%n", code);
            System.out.printf("Número de horas trabalhadas: %d%n", totalHoursWorkedMonth);
            System.out.printf("Valor da hora trabalhada:    R$ %.2f%n", valueHourWorked);
            System.out.printf("Salário inicial:             R$ %.2f%n", initialSalary);
            System.out.printf("Auxílio alimentação:         R$ %.2f%n", foodAid);

            finalSalary = initialSalary + foodAid;
            System.out.printf("Salário final:               R$ %.2f%n", finalSalary);

            System.out.println("\n=====**=====**=====**=====**=====**=====**=====\n");

            counter++;
        }

        readerScanner.close();
    }
}
