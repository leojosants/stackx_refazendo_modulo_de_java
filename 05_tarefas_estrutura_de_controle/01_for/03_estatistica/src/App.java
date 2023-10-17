import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        int codigo;
        int numeroVeiculos;
        int numeroAcidentes;
        int maiorIndiceAcidente = 0;
        int menorIndiceAcidente = 100000000;
        int codigoCidadeMaiorIndiceAcidente = 0;
        int codigoCidadeMenorIndiceAcidente = 0;
        int totalVeiculos = 0;
        int totalAcidentesCidadesMenos2000 = 0;
        int contadorCidadesMenos2000 = 0;
        double mediaTodosVeiculos = 0.0;
        double mediaAcidentesCidadesMenos2000 = 0.0;

        for (int i = 1; i <= 5; i++) {
            System.out.printf("\nDADOS DA %dª CIDADE%n", i);
            System.out.print("Código da cidade: ");
            codigo = leitor.nextInt();

            System.out.print("Número de veículos de passeio: ");
            numeroVeiculos = leitor.nextInt();

            System.out.print("Número de acidentes de trânsito com vítimas: ");
            numeroAcidentes = leitor.nextInt();

            totalVeiculos += numeroVeiculos;

            if (numeroAcidentes > maiorIndiceAcidente) {
                maiorIndiceAcidente = numeroAcidentes;
                codigoCidadeMaiorIndiceAcidente = codigo;
            }

            if (numeroAcidentes < menorIndiceAcidente) {
                menorIndiceAcidente = numeroAcidentes;
                codigoCidadeMenorIndiceAcidente = codigo;
            }

            if (numeroAcidentes < 2_000) {
                totalAcidentesCidadesMenos2000 += numeroAcidentes;
                contadorCidadesMenos2000++;
                mediaAcidentesCidadesMenos2000 = totalAcidentesCidadesMenos2000 / contadorCidadesMenos2000;
            }
        }

        mediaTodosVeiculos = totalVeiculos / 5;

        System.out.printf("\nMaior índice de acidentes de trânsito é %d e pertence a cidade código %d%n",
                maiorIndiceAcidente, codigoCidadeMaiorIndiceAcidente);

        System.out.printf("Menor índice de acidentes de trânsito é %d e pertence a cidade código %d%n",
                menorIndiceAcidente, codigoCidadeMenorIndiceAcidente);

        System.out.printf("Média de veículos nas cinco cidades juntas é: %.2f%n", mediaTodosVeiculos);
        System.out.printf("Média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio é: %.2f%n",
                mediaAcidentesCidadesMenos2000);

        leitor.close();
    }
}
