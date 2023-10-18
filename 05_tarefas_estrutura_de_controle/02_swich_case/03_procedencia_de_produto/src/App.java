import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        double priceProduct = 0.0;
        int codeOrigemProduct = 0;
        String originProduct = "";

        System.out.println("\nENTRE COM OS DADOS DO PRODUTO");
        System.out.print("Preço do produto: R$ ");
        priceProduct = reader.nextDouble();

        System.out.print("Código de origem do produto: ");
        codeOrigemProduct = reader.nextInt();

        switch (codeOrigemProduct) {
            case 1:
                originProduct = "Sul";
                break;

            case 2:
                originProduct = "Norte";
                break;

            case 3:
                originProduct = "Leste";
                break;

            case 4:
                originProduct = "Oeste";
                break;

            case 5:
            case 6:
                originProduct = "Nordeste";
                break;

            case 7:
            case 8:
            case 9:
                originProduct = "Sudeste";
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
                originProduct = "Centro-Oeste";
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
                originProduct = "Noroeste";
                break;

            default:
                originProduct = "Sem procedência";
                break;
        }

        System.out.println("\nEXIBIÇÃO DE DADOS");
        System.out.printf("Código de origem do produto: %d%n", codeOrigemProduct);
        System.out.printf("Preço do produto: R$ %.2f%n", priceProduct);
        System.out.printf("Procedência do produto: %s%n%n", originProduct);

        reader.close();
    }
}
