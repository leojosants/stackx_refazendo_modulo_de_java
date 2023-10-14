public class Example02 {
    public static void main(String[] args) {
        int x = 0;

        while (true) {
            x++;

            if (x == 20) {
                System.out.print("Fim do loop - x = " + x);
                break;
            }
        }
    }
}
