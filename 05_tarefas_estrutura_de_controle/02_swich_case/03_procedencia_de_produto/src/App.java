import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        double precoProduto = 0.0;
        int codigoOrigemProduto = 0;
        String procedenciaProduto = "";

        System.out.println("\nENTRE COM OS DADOS DO PRODUTO");
        System.out.print("Preço do produto: R$ ");
        precoProduto = leitor.nextDouble();

        System.out.print("Código de origem do produto: ");
        codigoOrigemProduto = leitor.nextInt();

        switch (codigoOrigemProduto) {
            case 1:
                procedenciaProduto = "Sul";
                break;

            case 2:
                procedenciaProduto = "Norte";
                break;

            case 3:
                procedenciaProduto = "Leste";
                break;

            case 4:
                procedenciaProduto = "Oeste";
                break;

            case 5:
            case 6:
                procedenciaProduto = "Nordeste";
                break;

            case 7:
            case 8:
            case 9:
                procedenciaProduto = "Sudeste";
                break;

            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                procedenciaProduto = "Centro-Oeste";
                break;

            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
                procedenciaProduto = "Noroeste";
                break;

            default:
                procedenciaProduto = "Sem procedência";
                break;
        }

        System.out.println("\nEXIBIÇÃO DE DADOS");
        System.out.printf("Código de origem do produto: %d%n", codigoOrigemProduto);
        System.out.printf("Preço do produto: R$ %.2f%n", precoProduto);
        System.out.printf("Procedência do produto: %s%n%n", procedenciaProduto);

        leitor.close();
    }
}
