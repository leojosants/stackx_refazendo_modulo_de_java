package classes;

public class Dog2 extends Mammal2 {
    /*
     * methods
     */
    @Override
    public void makeSound() {
        System.out.println("-> latindo");
    }

    public void buryBone() {
        System.out.println("-> enterrando osso...");
    }

    public void wagYourTail() {
        System.out.println("-> abanando o rabo...");
    }

    public void printDog() {
        System.out.println("\nExibindo dados do Cachorro");
        System.out.printf("Cor do pelo: %s%n", this.getFur_color());
        System.out.printf("Peso:        %.2fkg %n", this.getWeight());
        System.out.printf("Idade:       %d%n", this.getAge());
        System.out.printf("Membros:     %d%n", this.getMembers());
    }
}
