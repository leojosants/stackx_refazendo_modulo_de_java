package classes;

public class Kangaroo2 extends Mammal2 {
    /*
     * methods
     */
    public void wearBag() {
        System.out.println("-> usando bolsa");
    }

    @Override
    public void move(){
        System.out.println("-> saltando...");
    }

    public void printKangaroo() {
        System.out.println("\nExibindo dados do Canguru");
        System.out.printf("Cor do pelo: %s%n", this.getFur_color());
        System.out.printf("Peso:        %.2fkg %n", this.getWeight());
        System.out.printf("Idade:       %d%n", this.getAge());
        System.out.printf("Membros:     %d%n", this.getMembers());
    }
}
