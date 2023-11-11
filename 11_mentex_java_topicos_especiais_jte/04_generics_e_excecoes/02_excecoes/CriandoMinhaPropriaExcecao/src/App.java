import classes.InvalidAgeException;
import classes.Student;

public class App {
    public static void main(String[] args) {

        Student student_1 = new Student("Aluno 1", 436);

        try {
            student_1.setAge(2);

        } catch (InvalidAgeException e) {
            System.out.printf("-> erro: %s%n", e.getMessage());
            System.out.printf("-> idade inválida informada: %d%n", e.getAge());

        } finally {
            System.out.println("-> programa finalizado");
        }
    }
}
