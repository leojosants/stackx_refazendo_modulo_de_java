public class Example02 {
    public static void main(String[] args) {
        try {
            int number_1 = 2;
            int number_2 = 0;
            int result = (number_1 / number_2);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero.");
        }
    }
}
