package classes;

public class InvalidAgeException extends Exception {
    /*
     * attribute
     */
    private int age;

    /*
     * constructor
     */
    public InvalidAgeException(String message, int age) {
        super(message);
        this.setAge(age);
    }

    /*
     * getters and setters
     */
    public int getAge() {
        return this.age;
    }

    private void setAge(int age) {
        this.age = age;
    }
}
