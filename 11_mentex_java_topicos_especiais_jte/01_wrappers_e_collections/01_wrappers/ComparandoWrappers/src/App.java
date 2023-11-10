public class App {
    public static void main(String[] args) throws Exception {

        int number_1 = 4506;
        int number_2 = 4506;
        System.out.printf("number_1 é igual a number_2: %b%n", number_1 == number_2);

        Integer number_3 = 4506;
        Integer number_4 = 4506;
        System.out.printf("number_3 é igual a number_4: %b%n", number_3 == number_4);
        System.out.printf("number_3 é igual a number_4: %b%n", number_3.equals(number_4));
    }
}
