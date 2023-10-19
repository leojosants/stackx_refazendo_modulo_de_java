import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner readerScanner = new Scanner(System.in);
        double weight = 0.0;
        int age;
        int groupRisk = 0;

        System.out.println("\nEntre os os dados abaixo.");

        System.out.print("Informe a idade: ");
        age = readerScanner.nextInt();

        System.out.print("Informe o peso em [kg]: ");
        weight = readerScanner.nextDouble();

        System.out.println("\nEXIBICAO DE DADOS.");

        if ((age < 0) || (weight < 0.0)) {
            System.out.println("Não é possivel realizar cálculo com valores negativos.");
        } else {

            if (age < 20) {
                if (weight <= 60) {
                    groupRisk = 9;
                } else if (weight <= 90) {
                    groupRisk = 8;
                } else if (weight > 90) {
                    groupRisk = 7;
                }
            } else if (age <= 50) {
                if (weight <= 60) {
                    groupRisk = 6;
                } else if (weight <= 90) {
                    groupRisk = 5;
                } else if (weight > 90) {
                    groupRisk = 4;
                }
            } else if (age > 50) {
                if (weight <= 60) {
                    groupRisk = 3;
                } else if (weight <= 90) {
                    groupRisk = 2;
                } else if (weight > 90) {
                    groupRisk = 1;
                }
            }
        }

        if (groupRisk == 0) {
            System.out.println("Grupo de risco: INDEFINIDO.");
        } else {
            System.out.printf("Grupo de risco: %d%n", groupRisk);
        }
        readerScanner.close();
    }
}
