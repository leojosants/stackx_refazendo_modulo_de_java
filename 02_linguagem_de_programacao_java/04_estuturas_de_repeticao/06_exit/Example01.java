public class Example01 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.print(i + "-");

            if (i == 20) {
                System.out.print("Fim!");
                System.exit(0);
            }
        }
    }
}
