import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner readerScanner = new Scanner(System.in);

        double formulaIdealWeightForMen;
        double formulaIdealWeightForWomen;
        double height;

        String sexString = "";

        int genderSex;

        System.out.println("\nEntre com os dados solicitados abaixo");

        do {
            System.out.print("Digite a altura [cm]: ");
            height = readerScanner.nextDouble();
        } while (height <= 0);

        do {
            System.out.println("Escolha o sexo digitando o valor correspondente: ");
            System.out.println("[1] - Feminino");
            System.out.println("[2] - Masculino");
            System.out.print("Digite a sua opção: ");
            genderSex = readerScanner.nextInt();
        } while ((genderSex != 1) && (genderSex != 2));

        System.out.println("\nExibindo dados");

        if (genderSex == 1) {
            formulaIdealWeightForWomen = (62.1 * height) - 44;
            sexString = "feminino";
            System.out.printf("O peso ideal para o sexo %s com altura de %.2fcm é: %.2fkg%n", sexString, height,
                    formulaIdealWeightForWomen);

        } else if (genderSex == 2) {
            formulaIdealWeightForMen = (72.7 * height) - 58;
            sexString = "masculino";
            System.out.printf("O peso ideal para o sexo %s com altura de %.2fcm é: %.2fkg%n", sexString, height,
                    formulaIdealWeightForMen);
        }

        readerScanner.close();
    }
}
