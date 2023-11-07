import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

import classes.Student16;

public class StudentMap {
    public static void main(String[] args) throws Exception {

        Map<String, Student16> students_map = new TreeMap<String, Student16>();

        Student16 student_1 = new Student16("João da Silva", "Linux básico", 0);
        Student16 student_2 = new Student16("Antonio Sousa", "OpenOffice", 0);
        Student16 student_3 = new Student16("Lúcia Ferreira", "Internet", 0);
        Student16 student_4 = new Student16("Benedito Silva", "OpenOffice", 0);

        students_map.put("João da Silva", student_1);
        students_map.put("Antonio Sousa", student_2);
        students_map.put("Lúcia Ferreira", student_3);
        students_map.put("Benedito Silva", student_4);

        System.out.println(students_map);
        System.out.println(students_map.get("Lúcia Ferreira"));

        Collection<Student16> students = students_map.values();

        for (Student16 e : students) {
            System.out.println(e);
        }
    }
}
