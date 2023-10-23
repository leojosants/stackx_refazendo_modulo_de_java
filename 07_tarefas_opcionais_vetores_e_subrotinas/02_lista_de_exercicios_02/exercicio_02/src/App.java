import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        try {
            DisplaysInitialMessage();

            int numberOfGrades = 2;
            double averageForApproval = 6.0;
            double firstGrade = ReturnsFirstGrade(scanner);
            double secondGrade = ReturnsSecondGrade(scanner);
            double average = ReturnsAverage(firstGrade, secondGrade, numberOfGrades);
            String situation = ReturnsSituation(average, averageForApproval);

            DisplaysData(firstGrade, secondGrade, average, situation, averageForApproval);

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

    public static double ReturnsFirstGrade(Scanner scanner) {
        double firstGrade = 0.0;

        do {
            System.out.print("Digite a primeira nota [valores postivos / vírgula como separador]: ");
            firstGrade = scanner.nextDouble();
        } while (firstGrade < 0);

        return firstGrade;
    }

    public static double ReturnsSecondGrade(Scanner scanner) {
        double secondGrade = 0.0;

        do {
            System.out.print("Digite a segunda  nota [valores postivos / vírgula como separador]: ");
            secondGrade = scanner.nextDouble();
        } while (secondGrade < 0);

        return secondGrade;
    }

    public static double ReturnsAverage(double firstGrade, double secondGrade, int numberOfGrades) {
        double average = (firstGrade + secondGrade) / numberOfGrades;
        return average;
    }

    public static String ReturnsSituation(double average, double averageForApproval) {
        String situation = "";

        if (average < averageForApproval) {
            situation = "Reprovado";

        } else {
            situation = "Aprovado";
        }

        return situation;
    }

    public static void DisplaysData(double firstGrade, double secondGrade, double average, String situation,
            double averageForApproval) {
        System.out.println("\nExibindo dados");
        System.out.printf("Média para aprovação: \t%.2f%n", averageForApproval);
        System.out.printf("Primeira nota: \t\t%.2f%n", firstGrade);
        System.out.printf("Segunda  nota: \t\t%.2f%n", secondGrade);
        System.out.printf("Média do aluno: \t%.2f%n", average);
        System.out.printf("Situação: \t\t%s%n", situation);
    }
}