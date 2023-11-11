import java.util.ArrayList;
import java.util.List;

import classes.School18;
import classes.Teacher18;

public class App {
    public static void main(String[] args) throws Exception {

        // exampleWithoutGenerics();
        // exampleWithGenerics();
    }

    /*
     * methods
     */
    private static void exampleWithoutGenerics() {
        /*
         * exemplo sem generics
         */
        List things_list = new ArrayList();

        Teacher18 teacher_1 = new Teacher18();
        School18 school_1 = new School18();

        things_list.add(teacher_1);
        things_list.add(school_1);

        Teacher18 obtained_teacher = (Teacher18) things_list.get(0);
        System.out.println(obtained_teacher);

        School18 obtained_scholl = (School18) things_list.get(0); // erro em tempo de execução
        System.out.println(obtained_scholl);
    }

    private static void exampleWithGenerics() {
        /*
         * exemplo com generics
         */
        List<Teacher18> teacher_list = new ArrayList<Teacher18>();
        Teacher18 teacher_1 = new Teacher18();
        teacher_list.add(teacher_1);

        List<School18> school_list = new ArrayList<School18>();
        School18 school_1 = new School18();
        school_list.add(school_1);

        Teacher18 obtained_teacher_1 = teacher_list.get(0);
        // School18 obtained_scholl = (School18) teacher_list.get(0); // erro em tempo de
        // compilação
        System.out.println(obtained_teacher_1);

        School18 obtained_scholl_1 = school_list.get(0);
        // Teacher18 obtained_teacher_2 = (Teacher18) school_list.get(0); // erro em
        // tempo de compilação
        System.out.println(obtained_scholl_1);
    }
}
