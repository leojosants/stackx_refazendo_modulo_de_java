import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner readerScanner = new Scanner(System.in);
        int numberOfGrades = 2;
        double firstGrade = 0.0;
        double secondGrade = 0.0;
        double average = 0.0;

        ReturnGrade(readerScanner, firstGrade, secondGrade);
        
        average = CalculateAverage(firstGrade, secondGrade, numberOfGrades);

        DisplaysData(firstGrade, secondGrade, average);
    }

    /* SUB-ROUTINES */
    public static void ReturnGrade(Scanner readerScanner, double firstGrade, double secondGrade) {
        try {
            do {
                System.out.print("Digite a primeira nota, informe somente valores positivos separados por vírgula: ");
                firstGrade = readerScanner.nextDouble();
            } while (firstGrade < 0);

            do {
                System.out.print("Digite a segunda nota, informe somente valores positivos separados por vírgula: ");
                secondGrade = readerScanner.nextDouble();
            } while (secondGrade < 0);

        } catch (InputMismatchException e) {
            System.out.println("Erro de entrada, informe somente valores numério separados por vírgula");

        } catch (Exception e) {
            System.out.println(e);

        } finally {
            readerScanner.close();
            System.out.println("\nFim do programa");
        }
    }

    public static double CalculateAverage(double firstGrade, double secondGrade, int numberOfGrades) {
        double average = 0.0;
        average = (firstGrade + secondGrade) / numberOfGrades;
        return average;
    }

    public static void DisplaysData(double firstGrade, double secondGrade, double average) {
        System.out.println("\nExibir dados: ");
        System.out.printf("Primeira nota: %.2f%n", firstGrade);
        System.out.printf("Segunda nota: %.2f%n", secondGrade);
        System.out.printf("Média: %.2f%n", average);
    }
}