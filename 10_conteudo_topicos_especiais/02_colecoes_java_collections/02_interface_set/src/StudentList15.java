import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import classes.Student15;

public class StudentList15 {
    public static void main(String[] args) throws Exception {

        Set<Student15> set_of_students = new HashSet<Student15>();

        Student15 student_1 = new Student15("João da Silva", "Linux", 0.0);
        Student15 student_2 = new Student15("Antonio Sousa", "Java", 0.0);
        Student15 student_3 = new Student15("Lúcia Ferreira", "Banco de Dados", 0.0);
        Student15 student_4 = new Student15("Antonio Sousa", "Java", 0.0);

        set_of_students.add(student_1);
        set_of_students.add(student_2);
        set_of_students.add(student_3);
        set_of_students.add(student_4);
        
        System.out.println(set_of_students);
    }
}
