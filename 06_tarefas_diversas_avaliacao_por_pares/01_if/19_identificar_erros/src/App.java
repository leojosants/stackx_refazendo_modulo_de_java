public class App {
    public static void main(String[] args) throws Exception {

        // a
        /*
         * int age = 65;
         * 
         * if (age >= 65) {
         *      System.out.println("melhor idade");
         * }
         */

        // b
        /*
         * int gender = 0;
         * 
         * if (gender == 1) {
         *      System.out.println("Masculino");
         * 
         * } else if (gender == 2) {
         *      System.out.println("Feminino");
         * }
         */

        //  c
        
        double price = 10.51;

        if (price > 10.50) {
            price = price * 1.2;

        } else {
            price = price * 1.35;
        }
        
        System.out.println(price);
    }
}
