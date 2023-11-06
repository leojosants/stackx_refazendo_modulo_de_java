import classes.Dog3;
import classes.Mammal3;
import classes.Wolf3;

public class App3 {
    public static void main(String[] args) throws Exception {

        Mammal3 mammal_1 = new Mammal3();
        mammal_1.setFur_color("Preto");
        mammal_1.setWeight(85.3);
        mammal_1.setAge(10);
        mammal_1.setMembers(4);
        mammal_1.printMamma();
        mammal_1.move();
        mammal_1.toFeed();
        mammal_1.makeSound();

        Dog3 dog_1 = new Dog3();
        dog_1.setFur_color("Branco");
        dog_1.setWeight(45.3);
        dog_1.setAge(6);
        dog_1.setMembers(4);
        dog_1.printDog();
        dog_1.toFeed();
        dog_1.makeSound();
        dog_1.move();
        dog_1.buryBone();
        dog_1.wagYourTail();
        dog_1.toReact("deita");

        Wolf3 wolf_1 = new Wolf3();
        wolf_1.setFur_color("Branco Neve");
        wolf_1.setWeight(45.3);
        wolf_1.setAge(5);
        wolf_1.setMembers(4);
        wolf_1.printWolf();
        wolf_1.move();
        wolf_1.toFeed();
        wolf_1.makeSound();
    }
}
