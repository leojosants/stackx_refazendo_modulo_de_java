import classes.Cat;
import classes.Dog;
import classes.Horse;
import classes.Parrot;

public class App {
    public static void main(String[] args) throws Exception {

        Cat cat_1 = new Cat();
        cat_1.setName("Gato 1");
        cat_1.setRace("indefinida");
        cat_1.printCat();
        cat_1.breastfeed();
        cat_1.makeSound();
        cat_1.takeItToTheVet();
        cat_1.toFeed();
        cat_1.toPlay();
        cat_1.takeAWalk();

        System.out.println();

        Parrot parrot_1 = new Parrot();
        parrot_1.setName("Papagaio 1");
        parrot_1.printParrot();
        parrot_1.toFly();
        parrot_1.makeSound();

        System.out.println();

        Dog dog_1 = new Dog();
        dog_1.setName("Cachorro 1");
        dog_1.setRace("indefinida");
        dog_1.setSize(3);
        dog_1.printDod();
        dog_1.toFeed();
        dog_1.makeSound();
        dog_1.takeItToTheVet();
        dog_1.breastfeed();
        dog_1.toPlay();
        dog_1.takeAWalk();

        System.out.println();

        Horse horse_1 = new Horse();
        horse_1.setName("Cavalo 1");
        horse_1.prinHorse();
        horse_1.breastfeed();
        horse_1.makeSound();
        horse_1.takeItToTheVet();
        horse_1.toFeed();
    }
}
