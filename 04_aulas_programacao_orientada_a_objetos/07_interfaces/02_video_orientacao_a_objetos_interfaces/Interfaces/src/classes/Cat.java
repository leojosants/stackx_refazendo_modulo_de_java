package classes;

public class Cat extends Mammal implements DomesticatedAnimal, Pet {
    /*
     * attributes
     */
    private String race;

    /*
     * getters and setters
     */
    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    /*
     * methods
     */
    @Override
    public void breastfeed() {
        System.out.println("gato está amamentando...");
    }

    @Override
    public void makeSound() {
        System.out.println("gato está emitindo som...");
    }

    @Override
    public void takeItToTheVet() {
        System.out.println("gato está sendo levado no veterinário...");
    }

    @Override
    public void toFeed() {
        System.out.println("gato está sendo alimentado...");
    }

    @Override
    public void printName() {
        System.out.printf("Nome do gato: %s%n", this.getName());
    }

    @Override
    public void toPlay() {
        System.out.println("gato está brincando");
    }

    @Override
    public void takeAWalk() {
        System.out.println("gato está sendo levado para caminhar");
    }

    public final void printCat() {
        printName();
        System.out.printf("Raça: %s%n", this.getRace());
    }
}
