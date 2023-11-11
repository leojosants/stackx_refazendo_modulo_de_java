import java.util.ArrayList;
import java.util.List;

import classes.Person;
import classes.School;
import classes.Student;
import classes.Teacher;

public class App {
    public static void main(String[] args) throws Exception {

        // wildcards - tipos
        System.out.println("\n2 - Extends Wildcard");

        List<Teacher> teacher_list = new ArrayList<Teacher>();
        List<School> school_list = new ArrayList<School>();
        List<Student> student_list = new ArrayList<Student>();

        Teacher teacher_1 = new Teacher("Professor 1", "Departamento 1");
        Teacher teacher_2 = new Teacher("Professor 2", "Departamento 2");

        School school_1 = new School("Escola 1");
        School school_2 = new School("Escola 2");

        Student student_1 = new Student("Aluno 1", 11111);
        Student student_2 = new Student("Aluno 2", 11115);

        teacher_list.add(teacher_1);
        teacher_list.add(teacher_2);

        school_list.add(school_1);
        school_list.add(school_2);

        student_list.add(student_1);
        student_list.add(student_2);

        processPersons(teacher_list);
        // processPersons(student_list);
    }

    /*
     * methods
     */
    private static void processPersons(List<? extends Person> persons) {
        for (Person person : persons) {
            System.out.println(person.toString());
        }
    }
}
