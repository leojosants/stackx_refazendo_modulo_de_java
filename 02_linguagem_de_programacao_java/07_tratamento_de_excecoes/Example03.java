public class Example03 {
    public static void main(String[] args) {
        try {
            int number_1 = 2;
            int number_2 = 0;
            int result = (number_1 / number_2);
            System.out.println(args[0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: args[0].");
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero.");
        }
    }
}
