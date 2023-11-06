package classes;

public class Reptil2 extends Animal2 {
    /*
     * attributes
     */
    private String scale_color;

    /*
     * getters and setters
     */
    public String getScale_color() {
        return scale_color;
    }

    public void setScale_color(String scale_color) {
        this.scale_color = scale_color;
    }

    /*
     * methods
     */
    @Override
    public void move() {
        System.out.println("-> rastejando...");
    }

    @Override
    public void toFeed() {
        System.out.println("-> comendo vegetais...");
    }

    @Override
    public void makeSound() {
        System.out.println("-> emitindo som de reptil...");
    }

    public void printReptil() {
        System.out.println("\nExibindo dados do Réptil");
        System.out.printf("Cor da escama: %s%n", this.getScale_color());
        System.out.printf("Peso:          %.2fkg %n", this.getWeight());
        System.out.printf("Idade:         %d%n", this.getAge());
        System.out.printf("Membros:       %d%n", this.getMembers());
    }
}
