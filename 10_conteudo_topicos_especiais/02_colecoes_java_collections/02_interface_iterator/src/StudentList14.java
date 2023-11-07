import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import classes.Student14;

public class StudentList14 {
    public static void main(String[] args) throws Exception {

        List<Student14> list_of_students = new ArrayList<Student14>();

        Student14 student_1 = new Student14("João da Silva", "Linux", 0.0);
        Student14 student_2 = new Student14("Antonio Sousa", "Java", 0.0);
        Student14 student_3 = new Student14("Lúcia Ferreira", "Banco de Dados", 0.0);

        list_of_students.add(student_1);
        list_of_students.add(student_2);
        list_of_students.add(student_3);

        System.out.println(list_of_students);

        Student14 student_4;
        Iterator<Student14> iterator = list_of_students.iterator();

        while (iterator.hasNext()) {
            student_4 = iterator.next();
            System.out.printf("Nome: %s%n", student_4.getName());
        }
    }
}
