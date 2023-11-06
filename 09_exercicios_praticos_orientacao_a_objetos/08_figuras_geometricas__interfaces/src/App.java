import classes.Circle2;
import classes.Rectangle2;
import classes.Square2;
import classes.Triangle2;

public class App {
    public static void main(String[] args) throws Exception {

        Square2 square_1 = new Square2();
        square_1.setSideMeasurement(4);

        Rectangle2 rectangle_1 = new Rectangle2();
        rectangle_1.setBase(3.5);
        rectangle_1.setHeight(6.3);

        Triangle2 triangle_1 = new Triangle2();
        triangle_1.setBase(2.5);
        triangle_1.setHeight(7.9);

        Circle2 circle_1 = new Circle2();
        circle_1.setRay(15);

        System.out.printf("Area do quadrado:  %.2fcm² %n", square_1.calculateArea());
        System.out.printf("Area do retângulo: %.2fcm² %n", rectangle_1.calculateArea());
        System.out.printf("Area do triângulo: %.2fcm² %n", triangle_1.calculateArea());
        System.out.printf("Area do círculo:   %.2fcm² %n", circle_1.calculateArea());
    }
}
