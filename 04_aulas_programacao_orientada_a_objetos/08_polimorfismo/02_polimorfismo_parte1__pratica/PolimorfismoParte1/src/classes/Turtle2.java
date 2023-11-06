package classes;

public class Turtle2 extends Reptil2 {
    /*
     * methods
     */
    @Override
    public void move() {
        System.out.println("-> andando bem devagar...");
    }

    public void printTurtle() {
        System.out.println("\nExibindo dados da Tartaruga");
        System.out.printf("Cor da escama: %s%n", this.getScale_color());
        System.out.printf("Peso:          %.2fkg %n", this.getWeight());
        System.out.printf("Idade:         %d%n", this.getAge());
        System.out.printf("Membros:       %d%n", this.getMembers());
    }
}
