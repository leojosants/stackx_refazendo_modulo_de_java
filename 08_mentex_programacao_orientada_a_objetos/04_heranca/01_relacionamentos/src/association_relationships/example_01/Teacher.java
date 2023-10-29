package association_relationships.example_01;

public class Teacher {
    /* attribute */
    private String name;

    /* constructor */
    public Teacher(String name) {
        setName(name);
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }
}
