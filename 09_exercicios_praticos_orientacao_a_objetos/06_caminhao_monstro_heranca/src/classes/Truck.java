package classes;

public class Truck extends Car {
    public void m1() {
        System.out.println("caminhao 1");
    }

    public void m2() {
        super.m1();
    }

    public String toString() {
        return super.toString() + super.toString();
    }
}
