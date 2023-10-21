public class App {
    public static void main(String[] args) throws Exception {

        // example 1
        /*
         * int a = 5;
         * int b = 6;
         * 
         * if (a > b) {
         * System.out.printf("O maior é: %d%n", a);
         * 
         * } else {
         * System.out.printf("O maior é: %d", b);
         * }
         */

        // example 2

        int x = 10;

        if (x > 10) {
            System.out.println("Valor maior do que 10");

        } else if ((x <= 10) && (x > 5)) {
            System.out.println("Menor ou igual a 10 e maior do que 5");

        } else  {
            System.out.println("Menor ou igual a 5");
        }
    }
}
