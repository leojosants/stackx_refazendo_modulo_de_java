package classes;

public class GoldenFish2 extends Fish2 {
    /*
     * methods
     */
    public void printGoldenFish() {
        System.out.println("\nExibindo dados do Peixe Dourado");
        System.out.printf("Cor da escama: %s%n", this.getScale_color());
        System.out.printf("Peso:        %.2fkg %n", this.getWeight());
        System.out.printf("Idade:       %d%n", this.getAge());
        System.out.printf("Membros:     %d%n", this.getMembers());
    }
}
