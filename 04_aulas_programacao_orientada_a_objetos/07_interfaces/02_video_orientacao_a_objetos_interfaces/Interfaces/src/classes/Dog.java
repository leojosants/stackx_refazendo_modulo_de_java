package classes;

public class Dog extends Mammal implements DomesticatedAnimal, Pet {
    /*
     * attribute
     */
    private int size;
    private String race;

    /*
     * getters and setters
     */
    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getRace() {
        return this.race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    /*
     * methods
     */
    @Override
    public void toFeed() {
        System.out.println("cahorro está alimentando...");
    }

    @Override
    public void printName() {
        System.out.printf("Nome do cachorro: %s%n", this.getName());
    }

    @Override
    public void makeSound() {
        System.out.println("cahorro está emitindo som...");
    }

    @Override
    public void takeItToTheVet() {
        System.out.println("cahorro está sendo levado ao veterinário...");
    }

    @Override
    public void breastfeed() {
        System.out.println("cahorro está sendo amamentado...");
    }

    @Override
    public void toPlay() {
        System.out.println("cahorro está brincando...");
    }

    @Override
    public void takeAWalk() {
        System.out.println("cahorro está sendo levado para caminhar...");
    }

    public final void printDod() {
        this.printName();
        System.out.printf("Raça do cachorro: %s%n",this.getRace());
        System.out.printf("Tamanho do cachorro: %d%n",this.getSize());
    }
}
