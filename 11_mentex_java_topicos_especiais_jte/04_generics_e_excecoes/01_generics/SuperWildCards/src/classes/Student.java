package classes;

public class Student extends Person {
    /*
     * attribute
     */
    private long registration;

    /*
     * constructor
     */
    public Student(String name, long registration) {
        super(name);
        this.setRegistration(registration);
    }

    /*
     * getters and setters
     */
    public long getRegistration() {
        return this.registration;
    }

    private void setRegistration(long registration) {
        this.registration = registration;
    }

    /*
     * methods
     */
    @Override
    public String toString() {
        return String.format("Dados do Aluno\n") +
                String.format("Nome:      %s%n", this.getName()) +
                String.format("Matrícula: %s%n", this.getRegistration());
    }
}
