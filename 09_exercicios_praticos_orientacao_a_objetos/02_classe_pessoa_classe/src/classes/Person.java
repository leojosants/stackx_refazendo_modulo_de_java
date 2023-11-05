package classes;

public class Person {

    /* attributes */
    private String name;
    private int age;
    private double height;

    /* constructor */
    public Person(String name, int age, double height) {
        setName(name);
        setAge(age);
        setHeigth(height);
    }

    /* getters and setters */
    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public double getHeigth() {
        return this.height;
    }

    private void setHeigth(double height) {
        this.height = height;
    }

    /* methods */
    public void haveBirthday() {
        int increaseAge = 0;
        increaseAge += (getAge() + 1);
        setAge(increaseAge);
        System.out.println("-> Feito aniversário [+]");
    }

    public void displayData() {
        System.out.println("\nExibindo dados");
        System.out.printf("Nome:   %s%n", getName());
        System.out.printf("Idade:  %d [anos] %n", getAge());
        System.out.printf("Altura: %.2f [m] %n", getHeigth());
    }
}
