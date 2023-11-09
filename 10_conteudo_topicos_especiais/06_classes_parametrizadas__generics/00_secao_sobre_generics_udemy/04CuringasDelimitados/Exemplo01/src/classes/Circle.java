package classes;

import interfaces.Shape;

public class Circle implements Shape {
    /*
     * attributes
     */
    private double radius;

    /*
     * constructor
     */
    public Circle(double radius) {
        this.setRadius(radius);
    }

    /*
     * getters and setters
     */
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /*
     * methods
     */
    @Override
    public double area() {
        return Math.PI * this.getRadius() * this.getRadius();
    }
}
