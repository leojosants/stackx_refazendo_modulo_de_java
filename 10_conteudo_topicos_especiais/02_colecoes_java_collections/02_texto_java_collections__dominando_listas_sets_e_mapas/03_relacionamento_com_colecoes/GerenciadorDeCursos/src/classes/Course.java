package classes;



import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import br.com.alura.classes.Classs;

public class Course {
    /*
     * attributes
     */
    private String name;
    private String instructor;
    private List<Classs> class_list = new LinkedList<Classs>();

    /*
     * constructor
     */
    public Course(String name, String instructor) {
        this.setName(name);
        this.setInstructor(instructor);
    }

    /*
     * getters and setters
     */
    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getInstructor() {
        return this.instructor;
    }

    private void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public List<classes.Classs> getClass_list() {
        return Collections.unmodifiableList(class_list);
    }

    public void toAdd(Classs classs) {
        this.getClass_list().add(classs);
    }
}
