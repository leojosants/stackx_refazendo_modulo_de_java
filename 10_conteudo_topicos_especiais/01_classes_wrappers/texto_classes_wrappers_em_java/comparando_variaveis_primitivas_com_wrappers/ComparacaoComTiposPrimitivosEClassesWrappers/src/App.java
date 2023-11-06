public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Quando existe a comparação apenas com tipos primitivos é utilizado o operador
         * de igualdade (==)
         * 
         * se caso o trabalho for com classes wrappers é invocado o método equals, pois
         * serve para comparação de objetos
         */

        int number_1 = 21;
        double number_2 = 21.0;

        Double number_3 = new Double(282.22);
        Integer number_4 = new Integer(232);

        System.out.println(number_1 == number_2); // true
        // System.out.println(number_3 == number_4); // erro de compilação
        System.out.println(number_1 == number_3); // false
        System.out.println(number_4.equals(number_2)); // false

    }
}
