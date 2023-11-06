package classes;

public class Fish2 extends Animal2 {
    /*
     * attribute
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
        System.out.println("-> nadando");
    }

    @Override
    public void toFeed() {
        System.out.println("-> comendo substâncias");
    }

    @Override
    public void makeSound() {
        System.out.println("-> peixe não emite som");
    }

    public void blowBubbles() {
        System.out.println("-> soltando bolha");
    }

    public void printFish() {
        System.out.println("\nExibindo dados do Peixe");
        System.out.printf("Cor da escama: %s%n", this.getScale_color());
        System.out.printf("Peso:        %.2fkg %n", this.getWeight());
        System.out.printf("Idade:       %d%n", this.getAge());
        System.out.printf("Membros:     %d%n", this.getMembers());
    }
}
