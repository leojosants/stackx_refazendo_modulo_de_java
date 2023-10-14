package classes;

public class Person {
    private String name;
    public int age;
    protected String CPF;

    public Person(String name, int age, String CPF) {
        this.name = name;
        this.age = age;
        this.CPF = CPF;
        this.IntroduceYourself();
    }

    public void ChangeName(String new_name) {
        this.name = new_name;
    }

    public void IntroduceYourself() {
        System.out.println("Olá, me chamo " + this.name + " e tenho " + this.age + " anos.");
    }
}