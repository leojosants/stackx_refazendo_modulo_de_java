package classes;

public class Bird2 extends Animal2 {
    /*
     * attributes
     */
    private String feather_color;

    /*
     * getters and setters
     */
    public String getFeather_color() {
        return feather_color;
    }

    public void setFeather_color(String feather_color) {
        this.feather_color = feather_color;
    }

    /*
     * methods
     */
    @Override
    public void move() {
        System.out.println("-> voando...");
    }

    @Override
    public void toFeed() {
        System.out.println("-> comendo frutas...");
    }

    @Override
    public void makeSound() {
        System.out.println("-> emitindo som de ave...");
    }

    public void makeANest() {
        System.out.println("-> fazendo um ninho");
    }

    public void printBird() {
        System.out.println("\nExibindo dados da Ave");
        System.out.printf("Cor da pena: %s%n", this.getFeather_color());
        System.out.printf("Peso:        %.2fkg %n", this.getWeight());
        System.out.printf("Idade:       %d%n", this.getAge());
        System.out.printf("Membros:     %d%n", this.getMembers());
    }

}
