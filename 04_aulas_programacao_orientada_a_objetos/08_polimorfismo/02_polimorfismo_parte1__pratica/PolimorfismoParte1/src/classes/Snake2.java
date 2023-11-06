package classes;

public class Snake2 extends Reptil2 {
    /*
     * methods
     */
    public void printSnake() {
        System.out.println("\nExibindo dados da Cobra");
        System.out.printf("Cor da escama: %s%n", this.getScale_color());
        System.out.printf("Peso:          %.2fkg %n", this.getWeight());
        System.out.printf("Idade:         %d%n", this.getAge());
        System.out.printf("Membros:       %d%n", this.getMembers());
    }
}
