package classes;

public class Parrot extends Bird {
    /*
     * methods
     */
    @Override
    public void toFly() {
        System.out.println("papagaio está voando...");
    }

    @Override
    public void makeSound() {
        System.out.println("papagaio está emitindo som...");
    }

    public final void printParrot() {
        System.out.printf("Nome do papagaio: %s%n", this.getName());
    }
}
