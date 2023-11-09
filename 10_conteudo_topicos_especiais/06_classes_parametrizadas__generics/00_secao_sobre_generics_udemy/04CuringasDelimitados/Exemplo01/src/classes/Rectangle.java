package classes;

import interfaces.Shape;

public class Rectangle implements Shape {
    /*
     * attributes
     */
    private double width;
    private double height;

    /*
     * constructor
     */
    public Rectangle(double width, double height) {
        this.setWidth(width);
        this.setHeight(height);
    }

    /*
     * getters and setters
     */
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    /*
     * methods
     */
    @Override
    public double area() {
        return this.getWidth() * this.getHeight();
    }

}
