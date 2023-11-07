package classes;

import java.util.Comparator;

public class ComparesStudent implements Comparator<Student13>{
    /*
     * method
     */
    @Override
    public int compare(Student13 student_1, Student13 student_2) {
        return student_1.getName().compareTo(student_2.getName());
    }
   
}
