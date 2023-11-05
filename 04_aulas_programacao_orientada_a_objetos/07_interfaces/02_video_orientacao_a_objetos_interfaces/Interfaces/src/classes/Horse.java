package classes;

public class Horse extends Mammal implements DomesticatedAnimal {
    /*
     * methods
     */
    @Override
    public void breastfeed() {
        System.out.println("cavalo está sendo amamentado...");
    }

    @Override
    public void makeSound() {
        System.out.println("cavalo está emitindo som...");
    }

    @Override
    public void takeItToTheVet() {
        System.out.println("cavalo está sendo levado ao veterinário...");
    }

    @Override
    public void toFeed() {
        System.out.println("cavalo está sendo alimentado...");
    }

    @Override
    public void printName() {
        System.out.printf("Nome do cavalo: %s%n", this.getName());
    }

    public final void prinHorse() {
        this.printName();
    }
}
