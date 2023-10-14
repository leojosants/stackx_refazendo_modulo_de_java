public class Example04 {
    public static void main(String[] args) {
        int x = 0;

        for (;;) {
            x++;

            if (x == 20) {
                System.out.print("Fim do loop - x = " + x);
                break;
            }
        }
    }
}
