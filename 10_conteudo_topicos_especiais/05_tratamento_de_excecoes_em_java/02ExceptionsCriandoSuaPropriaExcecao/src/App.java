import classes.NotExactDivision;

public class App {
    public static void main(String[] args) throws Exception {

        int[] numbers = { 4, 8, 5, 16, 32, 21, 64, 128 };
        int[] denominator = { 2, 0, 4, 8, 0, 2, 3 };

        for (int i = 0; i < numbers.length; i++) {
            try {
                if ((numbers[i] % 2) != 0) {
                    throw new NotExactDivision(numbers[i], denominator[i]);
                }

                System.out.printf("%d / %d = %d%n", numbers[i], denominator[i], (numbers[i] / denominator[i]));

            } catch (ArithmeticException e) {
                System.out.println("-> não é possível realizar divisão por zero");

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("-> não é possível acessar um indice inexistente");

            } catch (NotExactDivision e) {
                System.out.println(e);
                // e.printStackTrace();
            }
        }

        System.out.println("-> fim do programa");
    }
}
