public class App {
    public static void main(String[] args) throws Exception {

        int numbers[] = { 5, 10, 8, 4, 9, 16, 28, 40, 80, 10 };
        int copyNumbers[] = ReturnsCopyNumbers(numbers);
        int sumNumbers = ReturnsSumNumbers(copyNumbers);
        DisplaysData(sumNumbers);
    }

    /* SUB-ROUTINES */
    public static int[] ReturnsCopyNumbers(int numbers[]) {
        int copy[] = new int[numbers.length];
        System.arraycopy(numbers, 0, copy, 0, numbers.length);
        return copy;
    }

    public static int ReturnsSumNumbers(int copyNumbers[]) {
        int sumNumbers = 0;

        for (int i = 0; i < copyNumbers.length; i++) {
            sumNumbers += copyNumbers[i];
        }

        return sumNumbers;
    }

    public static void DisplaysData(int sumNumbers) {
        System.out.println("\nExibidindo dados");
        System.out.printf("Soma de todos os valores: %d%n", sumNumbers);
    }
}