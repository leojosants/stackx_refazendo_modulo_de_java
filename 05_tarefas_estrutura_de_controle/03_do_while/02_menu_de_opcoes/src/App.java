import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner readerScanner = new Scanner(System.in);

        double salaryEmployee = 0.0;
        double valueTax = 0.0;
        double newSalary = 0.0;

        String classification = "";

        int optionMenu = 0;

        do {
            System.out.println("\nMENU DE OPÇÕES:");
            System.out.println("\t[1] - Imposto");
            System.out.println("\t[2] - Novo Salário");
            System.out.println("\t[3] - Classificação");
            System.out.println("\t[4] - Finalizar programa");

            System.out.print("Digite a opção desejada [1, 2, 3 ou 4]: ");
            optionMenu = readerScanner.nextInt();

            switch (optionMenu) {
                case 1:
                    System.out.println("\nOpção escolhida - Imposto");
                    System.out.print("Informe o salário: R$ ");
                    salaryEmployee = readerScanner.nextDouble();

                    if (salaryEmployee < 500.00) {
                        valueTax = (salaryEmployee * 5) / 100;
                    } else if (salaryEmployee <= 850.00) {
                        valueTax = (salaryEmployee * 10) / 100;
                    } else {
                        valueTax = (salaryEmployee * 15) / 100;
                    }

                    System.out.printf("Valor do imposto: R$ %.2f%n", valueTax);
                    break;

                case 2:
                    System.out.println("\nOpção escolhida - Novo Salário");
                    System.out.print("Informe o salário: R$ ");
                    salaryEmployee = readerScanner.nextDouble();

                    if (salaryEmployee < 450.00) {
                        newSalary = salaryEmployee + 100.00;
                    } else if (salaryEmployee < 750.00) {
                        newSalary = salaryEmployee + 75.00;
                    } else if (salaryEmployee <= 1500.00) {
                        newSalary = salaryEmployee + 50.00;
                    } else {
                        newSalary = salaryEmployee + 250.00;
                    }

                    System.out.printf("Novo salário: R$ %.2f%n%n", newSalary);
                    break;

                case 3:
                    System.out.println("\nOpção escolhida - Classificação");
                    System.out.print("Informe o salário: R$ ");
                    salaryEmployee = readerScanner.nextDouble();

                    if (salaryEmployee <= 700.00) {
                        classification = "Mal remunerado";
                    } else {
                        classification = "Bem remunerado";
                    }

                    System.out.printf("Classificação: %s%n", classification);
                    break;

                case 4:
                    System.out.println("\nOpção escolhida - Finalizar Programa\n");
                    break;

                default:
                    System.out.println("\nOpção inválida, tente novamente [1, 2, 3 ou 4]");
                    break;
            }

        } while (optionMenu != 4);

        readerScanner.close();
    }
}
