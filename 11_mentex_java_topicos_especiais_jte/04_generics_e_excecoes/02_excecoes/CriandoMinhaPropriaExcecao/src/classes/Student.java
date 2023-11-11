package classes;

public class Student {
    /*
     * attribute
     */
    private String name;
    private int age;
    private long registration;

    /*
     * constructor
     */
    public Student(String name, long registration) {
        this.setName(name);
        this.setRegistration(registration);
    }

    /*
     * getters and setters
     */
    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidAgeException {
        if (age > 4) {
            System.out.println("Idade válida");
            this.age = age;

        } else {
            throw new InvalidAgeException("Idade inválida! Não é permitido idade menor que '5 anos'", age);
        }
    }

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
                String.format("Idade:     %s%n", this.getAge()) +
                String.format("Matrícula: %s%n", this.getRegistration());
    }
}
