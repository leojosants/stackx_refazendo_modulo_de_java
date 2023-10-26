import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        try {

            int numberOfStudents = RequestNumberOfStudents(scanner);
            double averagesReceived_vector[] = new double[numberOfStudents];

            FillVectorWithReceivedAverages(averagesReceived_vector, scanner);

            double copyAveragesReceived_vector[] = CopyVector(averagesReceived_vector);
            double overallAverage = CalculateOverallAverage(copyAveragesReceived_vector);

            DisplayData(overallAverage);

        } catch (InputMismatchException e) {
            System.out.println("-> Erro: entrada inválida de dados");

        } finally {
            scanner.close();
            System.out.println("Programa finalizado");
        }
    }

    /* SUB-ROUTINES */
    public static int RequestNumberOfStudents(Scanner scanner) {
        int numberOfStudents = 0;

        System.out.println();

        do {
            System.out.print("Digite a quantidade de alunos [somente valor positivo / inteiro]: ");
            numberOfStudents = scanner.nextInt();
        } while (numberOfStudents < 0);

        return numberOfStudents;
    }

    public static void FillVectorWithReceivedAverages(double vector[], Scanner scanner) {
        System.out.printf("\nInforme a(s) %d média(s)  abaixo, utilize virgula como separador%n", vector.length);

        for (int i = 0; i < vector.length; i++) {
            do {
                System.out.printf("Digite a %dª média [valor positivo]: ", (i + 1));
                vector[i] = scanner.nextDouble();
            } while (vector[i] < 0.0);
        }
    }

    public static double[] CopyVector(double vector[]) {
        double copy_vector[] = new double[vector.length];
        System.arraycopy(vector, 0, copy_vector, 0, vector.length);
        return copy_vector;
    }

    public static double CalculateOverallAverage(double vector[]) {
        double sumOfAverages = 0.0;
        double overallAverage = 0.0;

        for (int i = 0; i < vector.length; i++) {
            sumOfAverages += vector[i];
        }

        overallAverage = sumOfAverages / vector.length;
        return overallAverage;
    }

    public static void DisplayData(double overallAverage) {
        System.out.println("\nExibindo dados");
        System.out.printf("Média geral: %.2f%n", overallAverage);
    }
}
