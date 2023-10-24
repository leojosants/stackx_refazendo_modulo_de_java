public class App {
    public static void main(String[] args) throws Exception {

        int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int copyNumbers[] = ReturnsCopyNumbers(numbers);

        DisplaysData(copyNumbers);
    }

    /* SUB-ROUTINES */
    public static int[] ReturnsCopyNumbers(int numbers[]) {
        int copy[] = new int[numbers.length];
        System.arraycopy(numbers, 0, copy, 0, numbers.length);
        return copy;
    }

    public static void returnsSymmetricalElements(int copyNumbers[]) {
        for (int i = 0; i < copyNumbers.length; i++) {
            System.out.printf("%d - %d%n", copyNumbers[i], copyNumbers[9 - i]);
        }
    }

    public static void DisplaysData(int copyNumbers[]) {
        System.out.println("\nExibindo dados");
        returnsSymmetricalElements(copyNumbers);
    }
}
