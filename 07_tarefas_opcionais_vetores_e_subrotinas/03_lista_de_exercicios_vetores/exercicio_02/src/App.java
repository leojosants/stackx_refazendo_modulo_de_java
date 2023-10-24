public class App {
    public static void main(String[] args) throws Exception {

        int numbers[] = { 5, 10, 8, 4, 9, 16, 28, 40, 80, 10 };
        int sumNumbers = ReturnsSumNumbers(numbers);
        DisplaysData(sumNumbers);
    }

    /* SUB-ROUTINES */
    public static int ReturnsSumNumbers(int numbers[]) {
        int sumNumbers = 0;

        for (int i = 0; i < numbers.length; i++) {
            sumNumbers += numbers[i];
        }

        return sumNumbers;
    }

    public static void DisplaysData(int sumNumbers) {
        System.out.println("\nExibidindo dados");
        System.out.printf("Soma de todos os valores: %d%n", sumNumbers);
    }
}
