public class App {
    public static void main(String[] args) throws Exception {

        int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.println("\nExibindo elementos do vetor\n");

        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Posição %d: %d%n", i, numbers[i]);
        }

    }
}
