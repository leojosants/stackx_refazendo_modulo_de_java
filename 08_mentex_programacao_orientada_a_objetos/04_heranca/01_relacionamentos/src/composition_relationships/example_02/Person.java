package composition_relationships.example_02;

public class Person {
    /*
     * attributes
     */
    private Job job;

    /*
     * constructor
     */
    public Person() {
        setJob(new Job());
        job.setSalary(1000.00);
    }

    /*
     * getters and setters
     */
    public double getSalary() {
        return this.job.getSalary();
    }

    private void setJob(Job job) {
        this.job = job;
    }

}
