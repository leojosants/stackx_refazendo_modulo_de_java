public class App {
    public static void main(String[] args) throws Exception {

        int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        DisplaysData(numbers);
    }

    /* SUB-ROUTINES */
    public static void returnsSymmetricalElements(int numbers[]) {

        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%d - %d%n", numbers[i], numbers[9-i]);
        }
    }

    public static void DisplaysData(int numbers[]) {
        System.out.println("\nExibindo dados");
        returnsSymmetricalElements(numbers);
    }
}
