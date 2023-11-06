import classes.Circle;
import classes.Rectangle;
import classes.Square;
import classes.Triangle;

public class App {
    public static void main(String[] args) throws Exception {

        Square square_1 = new Square();
        square_1.setSide_measurement(4);

        Rectangle rectangle_1 = new Rectangle();
        rectangle_1.setBase(3.5);
        rectangle_1.setHeight(6.3);

        Triangle triangle_1 = new Triangle();
        triangle_1.setBase(2.5);
        triangle_1.setHeight(7.9);

        Circle circle_1 = new Circle();
        circle_1.setRay(15);

        System.out.printf("Area do quadrado:  %.2fcm² %n", square_1.calculateArea());
        System.out.printf("Area do retângulo: %.2fcm² %n", rectangle_1.calculateArea());
        System.out.printf("Area do triângulo: %.2fcm² %n", triangle_1.calculateArea());
        System.out.printf("Area do círculo:   %.2fcm² %n", circle_1.calculateArea());
    }
}
