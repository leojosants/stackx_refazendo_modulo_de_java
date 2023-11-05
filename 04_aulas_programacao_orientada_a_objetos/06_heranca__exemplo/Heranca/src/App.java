import classes.Coordinator;
import classes.Person13;
import classes.Teacher13;

public class App {
    public static void main(String[] args) throws Exception {
        Person13 person_1 = new Person13("Amanda", 12);
        System.out.println(person_1.getName());
        System.out.println(person_1.getRegistration());

        System.out.println();

        Teacher13 teacher_1 = new Teacher13("Ricardo", 13, "Matem�tica");
        System.out.println(teacher_1.getName());
        System.out.println(teacher_1.getRegistration());
        System.out.println(teacher_1.getDepartment());

        System.out.println();

        // Teacher13 rafael = new Person13("Rafael", 18); // erro de compila��o

        Person13 rafael = new Teacher13("Rafael", 18, "Ciencias");
        System.out.println(rafael.getName());
        System.out.println(rafael.getRegistration());
        System.out.println(((Teacher13) rafael).getDepartment()); // cast

        System.out.println();

        Coordinator patricia = new Coordinator("Patricia", 200, "Biologia");
        System.out.println(patricia.getName());
        System.out.println(patricia.getRegistration());
        System.out.println(patricia.getCoordinatingCourse());
    }
}
