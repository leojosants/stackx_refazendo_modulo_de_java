public class App {
    public static void main(String[] args) throws Exception {

        double numbers[] = { 85.0, 105.0, 40.0, 90.0, 35.0, 65.0, 33.0, 22.0, 19.0, 50.0 };
        double copyNumbers[] = ReturnsCopyNumbers(numbers);

        double sumNumbers = ReturnsSumNumbers(copyNumbers);
        double average = ReturnsAverage(copyNumbers, sumNumbers);
        DisplaysData(average);
    }

    /* SUB-ROUTINES */
    public static double[] ReturnsCopyNumbers(double numbers[]) {
        double copy[] = new double[numbers.length];
        System.arraycopy(numbers, 0, copy, 0, numbers.length);
        return copy;
    }

    public static double ReturnsSumNumbers(double copyNumbers[]) {
        double sumNumbers = 0.0;

        for (int i = 0; i < copyNumbers.length; i++) {
            sumNumbers += copyNumbers[i];
        }

        return sumNumbers;
    }

    public static double ReturnsAverage(double copyNumbers[], double sumNumbers) {
        double average = 0.0;
        int totalNumeros = copyNumbers.length;
        average = sumNumbers / totalNumeros;
        return average;
    }

    public static void DisplaysData(double average) {
        System.out.println("\nExibindo dados");
        System.out.printf("Média: %.2f%n", average);
    }
}
// public class App {
// public static void main(String[] args) throws Exception {

// double numbers[] = { 85.0, 105.0, 40.0, 90.0, 35.0, 65.0, 33.0, 22.0, 19.0,
// 50.0 };
// double sumNumbers = ReturnsSumNumbers(numbers);
// double average = ReturnsAverage(numbers, sumNumbers);
// DisplaysData(average);
// }

// /* SUB-ROUTINES */
// public static double ReturnsSumNumbers(double numbers[]) {
// double sumNumbers = 0.0;

// for (int i = 0; i < numbers.length; i++) {
// sumNumbers += numbers[i];
// }

// return sumNumbers;
// }

// public static double ReturnsAverage(double numbers[],double sumNumbers) {
// double average = 0.0;
// int totalNumeros = numbers.length;
// average = sumNumbers / totalNumeros;
// return average;
// }

// public static void DisplaysData(double average) {
// System.out.println("\nExibindo dados");
// System.out.printf("Média: %.2f%n", average);
// }
// }
