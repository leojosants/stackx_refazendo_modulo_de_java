public class App {
    public static void main(String[] args) throws Exception {

        int numbers[] = { 5, 10, 8, 4, 9, 16, 28, 40, 80, 10 };
        int soma = SomaValores(numbers);
        ExibeDados(soma);
    }

    /* SUB-ROUTINES */
    public static int SomaValores(int numbers[]) {
        int soma = 0;

        for (int i = 0; i < numbers.length; i++) {
            soma += numbers[i];
        }

        return soma;
    }

    public static void ExibeDados(int soma) {
        System.out.println("\nExibidindo dados");
        System.out.printf("Soma de todos os valores: %d%n", soma);
    }
}
