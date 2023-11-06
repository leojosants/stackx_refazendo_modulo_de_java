package classes;

public class Wolf3 extends Mammal3 {
    /*
     * methods
     */
    @Override
    public void makeSound() {
        System.out.println("-> uivando");
    }

    public void printWolf() {
        System.out.println("\nExibindo dados do Lobo");
        System.out.printf("Cor do pelo: %s%n", this.getFur_color());
        System.out.printf("Peso:        %.2fkg %n", this.getWeight());
        System.out.printf("Idade:       %d%n", this.getAge());
        System.out.printf("Membros:     %d%n", this.getMembers());
    }
}
