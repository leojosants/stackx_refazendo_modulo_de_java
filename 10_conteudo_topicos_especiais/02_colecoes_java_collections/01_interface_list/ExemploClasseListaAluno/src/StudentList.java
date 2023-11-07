import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import classes.Student13;

public class StudentList {
    public static void main(String[] args) throws Exception {

        List<Student13> list_of_students = new ArrayList<Student13>();

        Student13 student_1 = new Student13("João da Silva", "Linux", 0.0);
        Student13 student_2 = new Student13("Antonio Sousa", "Java", 0.0);
        Student13 student_3 = new Student13("Lúcia Ferreira", "Banco de Dados", 0.0);

        list_of_students.add(student_1);
        list_of_students.add(student_2);
        list_of_students.add(student_3);

        System.out.println(list_of_students);

    }
}
