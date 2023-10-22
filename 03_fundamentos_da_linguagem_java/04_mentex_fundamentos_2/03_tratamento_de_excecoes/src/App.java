public class App {
    public static void main(String[] args) throws Exception {
        try {
            int firstNumber = 2;
            int secondNumber = 1;
            int result = firstNumber / secondNumber; // ArithmeticException

            int[] numbers = { 1, 2, 3 };
            int nonExistentPosition = numbers[4]; // ArrayIndexOutOfBoundsException

        } catch (ArithmeticException e) {
            System.out.println("Erro de divisão por zero");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro, index inexistente");

        } catch (Exception e) {
            System.out.println("Erro genérico");

        } finally {
            System.out.println("Fim do programa");
        }
    }
}
