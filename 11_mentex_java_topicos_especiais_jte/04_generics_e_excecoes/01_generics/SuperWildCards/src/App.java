import java.util.ArrayList;
import java.util.List;

import classes.Person;
import classes.Teacher;

public class App {
    public static void main(String[] args) throws Exception {

        // wildcards - tipos
        System.out.println("\n3 - Super Wildcard");

        List<Teacher> teachers_list = new ArrayList<Teacher>();
        List<Person> persons_list = new ArrayList<Person>();

        Teacher teacher_1 = new Teacher("Professor 1", "Departamento 1");
        Teacher teacher_2 = new Teacher("Professor 2", "Departamento 2");

        Person person_1 = new Person("Pessoa 1");
        Person person_2 = new Person("Pessoa 2");

        teachers_list.add(teacher_1);
        teachers_list.add(teacher_2);

        persons_list.add(person_1);
        persons_list.add(person_2);

        processSuperTeacher(teachers_list);
        processSuperTeacher(persons_list);
    }

    /*
     * methods
     */
    private static void processSuperTeacher(List<? super Teacher> superTeachers) {
        for (Object object : superTeachers) {
            System.out.println(object.toString());
        }
    }
}
