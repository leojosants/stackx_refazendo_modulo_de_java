public class App {
    public static void main(String[] args) throws Exception {

        double firstGrade = 7.5;
        double secondGrade = 10.3;
        double average = CalcularMedia(firstGrade, secondGrade);

        System.out.printf("%.2f", average);
    }

    // subrotinas
    public static double CalcularMedia(double firstGrade, double secondGrade) {
        double average = 0.0;
        average = (firstGrade + secondGrade) / 2;
        return average;
    }
}
