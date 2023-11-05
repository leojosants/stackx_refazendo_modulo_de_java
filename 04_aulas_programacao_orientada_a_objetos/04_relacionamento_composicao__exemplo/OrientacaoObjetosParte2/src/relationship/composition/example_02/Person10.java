package example_02;

public class Person10 {
    /*
     * attributes
     */
    private Job job;
	   
    /*
     * constructor
     */
    public Person10() {
        this.job = new Job();
        job.setSalary(1000.00);
    }
	 
    /*
     * methods
     */
	public double getSalary() {
	    return job.getSalary();
	}
}
