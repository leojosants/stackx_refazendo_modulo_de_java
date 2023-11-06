package classes;

public abstract class Animal2 {
    /*
     * attributes
     */
    protected double weight;
    protected int age;
    protected int members;

    /*
     * getters and setters
     */
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMembers() {
        return members;
    }

    public void setMembers(int members) {
        this.members = members;
    }

    /*
     * methods
     */
    public abstract void move();

    public abstract void toFeed();

    public abstract void makeSound();
}
