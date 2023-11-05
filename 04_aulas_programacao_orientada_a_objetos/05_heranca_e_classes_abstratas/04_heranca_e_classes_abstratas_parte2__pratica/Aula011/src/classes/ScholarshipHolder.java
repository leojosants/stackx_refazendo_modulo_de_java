package classes;

public final class ScholarshipHolder extends Student12 {
    /*
     * attributes
     */
    private float scholarship;

    /*
     * constructor
     */
    public ScholarshipHolder() {
    }

    /*
     * getters and setters
     */
    public float getScholarship() {
        return scholarship;
    }

    public void setScholarship(float scholarship) {
        this.scholarship = scholarship;
    }

    /*
     * methods
     */
    public final void renewScholarship() {
        System.out.printf("-> renovando bolsa de '%s'%n", this.getName());
    }
    
    @Override
    public final void payMonthlyFee() {
        System.out.printf("-> pagamento facilitado '%s' é bolsita %n", this.getName());
    }
    
    public final void printScholarship() {
        System.out.printf("Bolsa:     R$%.2f%n", this.getScholarship());
        System.out.printf("Matricula: %s%n",this.getRegistration());
        System.out.printf("Curso:     %s%n",this.getCourse());
    }
}
