import java.util.ArrayList;
import java.util.List;

import classes.Circle;
import classes.Rectangle;
import interfaces.Shape;

public class App {
    public static void main(String[] args) throws Exception {

        List<Shape> my_shapes = new ArrayList<>();
        my_shapes.add(new Rectangle(3.0, 2.0));
        my_shapes.add(new Circle(2.0));

        List<Circle> my_circles = new ArrayList<>();
        my_circles.add(new Circle(2.0));
        my_circles.add(new Circle(3.0));

        System.out.println("Area total: " + totalArea(my_shapes));
        System.out.println("Area total: " + totalArea(my_circles));
    }

    /*
     * methods
     */
    private static double totalArea(List<? extends Shape> list) {
        double sum = 0.0;

        for (Shape shape : list) {
            sum += shape.area();
        }

        return sum;
    }
}
