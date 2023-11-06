package classes;

public class Dog3 extends Mammal3 {
    /*
     * methods
     */
    @Override
    public void makeSound() {
        System.out.println("-> latindo...");
    }

    public void buryBone() {
        System.out.println("-> enterrando osso...");
    }

    public void wagYourTail() {
        System.out.println("-> abanando o rabo...");
    }

    public void toReact(String phrase) {
        if ((phrase == "toma comida") || (phrase == "ola")) {
            System.out.println("-> abanando o rabo e latindo...");

        } else {
            System.out.println("-> rosnando...");
        }
    }

    public void toReact(int hours) {
        if (hours < 12) {
            System.out.println("-> abanando o rabo...");

        } else if (hours >= 18) {
            System.out.println("-> ignorando...");

        } else {
            System.out.println("-> abanando o rabo e latindo...");
        }
    }

    public void toReact(boolean is_the_owner) {
        if (is_the_owner) {
            System.out.println("-> abanando o rabo...");

        } else {
            System.out.println("-> rosnando e latindo...");
        }
    }

    public void toReact(int age, double weight) {
        if (age < 5) {
            if (weight < 10) {
                System.out.println("-> abanando o rabo");

            } else {
                System.out.println("-> latindo");

            }
        } else {
            if (weight < 10) {
                System.out.println("-> rosnando");

            } else {
                System.out.println("-> ignorando");
            }
        }
    }

    public void printDog() {
        System.out.println("\nExibindo dados do Cachorro");
        System.out.printf("Cor do pelo: %s%n", this.getFur_color());
        System.out.printf("Peso:        %.2fkg %n", this.getWeight());
        System.out.printf("Idade:       %d%n", this.getAge());
        System.out.printf("Membros:     %d%n", this.getMembers());
    }
}
