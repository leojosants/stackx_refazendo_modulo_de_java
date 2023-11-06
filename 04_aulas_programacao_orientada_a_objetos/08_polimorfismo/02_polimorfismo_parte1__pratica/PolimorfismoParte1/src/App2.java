import classes.Bird2;
import classes.Dog2;
import classes.Fish2;
import classes.GoldenFish2;
import classes.Kangaroo2;
import classes.Mammal2;
import classes.Reptil2;
import classes.Snake2;
import classes.Turtle2;

public class App2 {
    public static void main(String[] args) throws Exception {

        Mammal2 mammal_1 = new Mammal2();
        mammal_1.setFur_color("Preto");
        mammal_1.setWeight(85.3);
        mammal_1.setAge(10);
        mammal_1.setMembers(4);
        mammal_1.printMamma();
        mammal_1.move();
        mammal_1.toFeed();
        mammal_1.makeSound();

        Reptil2 reptil_1 = new Reptil2();
        reptil_1.setScale_color("Marrom");
        reptil_1.setWeight(20);
        reptil_1.setAge(30);
        reptil_1.setMembers(5);
        reptil_1.printReptil();
        reptil_1.move();
        reptil_1.toFeed();
        reptil_1.makeSound();

        Fish2 fish_1 = new Fish2();
        fish_1.setScale_color("Dourada");
        fish_1.setWeight(2);
        fish_1.setAge(4);
        fish_1.setMembers(0);
        fish_1.printFish();
        fish_1.move();
        fish_1.toFeed();
        fish_1.makeSound();
        fish_1.blowBubbles();

        Bird2 bird_1 = new Bird2();
        bird_1.setFeather_color("Amarela");
        bird_1.setWeight(0.5);
        bird_1.setAge(2);
        bird_1.setMembers(2);
        bird_1.printBird();
        bird_1.move();
        bird_1.toFeed();
        bird_1.makeSound();
        bird_1.makeANest();

        Kangaroo2 kangaroo_1 = new Kangaroo2();
        kangaroo_1.setFur_color("Bege");
        kangaroo_1.setWeight(185.3);
        kangaroo_1.setAge(20);
        kangaroo_1.setMembers(4);
        kangaroo_1.printKangaroo();
        kangaroo_1.toFeed();
        kangaroo_1.makeSound();
        kangaroo_1.wearBag();
        kangaroo_1.move();

        Dog2 dog_1 = new Dog2();
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

        Snake2 snake_1 = new Snake2();
        snake_1.setScale_color("Cinza");
        snake_1.setWeight(5);
        snake_1.setAge(4);
        snake_1.setMembers(0);
        snake_1.printSnake();
        snake_1.move();
        snake_1.toFeed();
        snake_1.makeSound();

        Turtle2 turtle_1 = new Turtle2();
        turtle_1.setScale_color("Verde escuro");
        turtle_1.setWeight(85);
        turtle_1.setAge(29);
        turtle_1.setMembers(4);
        turtle_1.printTurtle();
        turtle_1.move();
        turtle_1.toFeed();
        turtle_1.makeSound();

        GoldenFish2 goldenFish_1 = new GoldenFish2();
        goldenFish_1.setScale_color("Dourada");
        goldenFish_1.setWeight(12);
        goldenFish_1.setAge(3);
        goldenFish_1.setMembers(0);
        goldenFish_1.printGoldenFish();
        goldenFish_1.move();
        goldenFish_1.toFeed();
        goldenFish_1.makeSound();
        goldenFish_1.blowBubbles();
    }
}
