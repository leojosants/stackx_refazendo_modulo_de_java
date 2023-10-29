package association_relationships.example_01;

public class Department {
    /* attrubite */
    private String name;
    private Teacher[] teacher_vector;

    /* constructor */
    public Department(String name) {
        setName(name);
    }

    /* getters and setters */
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher[] getTeacher_vector() {
        return this.teacher_vector;
    }

    public void setTeacher_vector(Teacher[] teacher_vector) {
        this.teacher_vector = teacher_vector;
    }

    /* methods */
    public void displayTeachers() {
        System.out.printf("Departamento: %s%n",getName());
        for (int i = 0; i < teacher_vector.length; i++) {
            System.out.printf("Professor: %s%n",teacher_vector[i].getName());
        }
    }
}
