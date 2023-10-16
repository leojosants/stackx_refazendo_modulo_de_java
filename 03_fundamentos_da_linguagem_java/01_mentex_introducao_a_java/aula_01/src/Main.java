public class Main {
    public static void main(String[] args) throws Exception {
        /*
         * example 01
         * 
         * data types - int, double, String, char, boolean
         * 
         * // int
         * int age = 10;
         * System.out.println("Idade: " + age);
         * 
         * // double
         * double x = 89.845;
         * System.out.println("x: " + x);
         * 
         * // String
         * String firstName = "Leonardo";
         * System.out.println("Meu nome é: " + firstName);
         */

        /* example 02 */
        int age = 19;

        if (age >= 18) {
            System.out.println("Adulto");
        } else if (age >= 12) {
            System.out.println("Adolescente");
        } else {
            System.out.println("Criança");
        }
    }
}
