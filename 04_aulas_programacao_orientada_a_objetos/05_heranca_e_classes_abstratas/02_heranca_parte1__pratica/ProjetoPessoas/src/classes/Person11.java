package classes;

public class Person11 {
    /*
     * attributes
     */
    private String name;
    private int age;
    private char gender;

    /*
     * constructor
     */
    public Person11() {
    }

    /*
     * getters and setters
     */
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return this.gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    /*
     * methods
     */
    public void haveABirthday() {
        this.setAge(this.getAge() + 1);
    }

    public void printPerson() {
        System.out.printf("Nome:  %s%n",this.getName());
        System.out.printf("Idade: %d%n",this.getAge());
        System.out.printf("Sexo:  %s%n",this.getGender());
    }
}
