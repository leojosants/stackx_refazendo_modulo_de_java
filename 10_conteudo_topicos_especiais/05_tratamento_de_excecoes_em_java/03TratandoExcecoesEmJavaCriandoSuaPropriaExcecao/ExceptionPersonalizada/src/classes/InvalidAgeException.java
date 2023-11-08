package classes;

public class InvalidAgeException extends Exception {
    /*
     * attributes
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
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

}
