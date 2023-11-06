package classes;

public class Mammal3 extends Animal3 {
    /*
     * attribute
     */
    private String fur_color;

    /*
     * getters and setters
     */
    public String getFur_color() {
        return fur_color;
    }

    public void setFur_color(String fur_color) {
        this.fur_color = fur_color;
    }

    /*
     * methods
     */
    @Override
    public void move() {
        System.out.println("-> correndo");
    }

    @Override
    public void toFeed() {
        System.out.println("-> mamando");
    }

    @Override
    public void makeSound() {
        System.out.println("-> emitindo som de mamífero");
    }

    public void printMamma() {
        System.out.println("\nExibindo dados do Mamífero");
        System.out.printf("Cor do pelo: %s%n", this.getFur_color());
        System.out.printf("Peso:        %.2fkg %n",this.getWeight());
        System.out.printf("Idade:       %d%n",this.getAge());
        System.out.printf("Membros:     %d%n",this.getMembers());
    }
}
