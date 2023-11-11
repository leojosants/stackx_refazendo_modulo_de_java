import java.util.ArrayList;
import java.util.List;

import classes.School19;
import classes.Teacher19;

public class App {
    public static void main(String[] args) throws Exception {
        // wildcards - tipos
        System.out.println("\n1 - Unkown Wildcard");

        List<Teacher19> teacher_list = new ArrayList<Teacher19>();
        List<School19> school_list = new ArrayList<School19>();

        Teacher19 teacher_1 = new Teacher19("Leo", "Informática");
        School19 school_1 = new School19("Maria Teresa");

        teacher_list.add(teacher_1);
        school_list.add(school_1);

        processElements(teacher_list);
        processElements(school_list);
    }

    /*
     * methods
     */
    private static void processElements(List<?> elements) {
        for (Object object : elements) {
            System.out.println(object);
        }
    }
}
