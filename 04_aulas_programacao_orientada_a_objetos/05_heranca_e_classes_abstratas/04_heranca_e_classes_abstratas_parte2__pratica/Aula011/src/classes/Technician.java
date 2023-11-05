package classes;

public final class Technician extends Student12 {
    /*
     * attribute
     */
    private String professional_record;

    /*
     * constructor
     */
    public Technician() {
    }

    /*
     * getters and setters
     */
    public String getProfessionalRecord() {
        return professional_record;
    }

    public void setProfessionalRecord(String professional_record) {
        this.professional_record = professional_record;
    }

    /*
     * methods
     */
    public final void toPractice() {
        System.out.printf("-> técnico '%s' está praticando", this.getName());
    }

    @Override
    public final void payMonthlyFee() {
        System.out.printf("-> pagando mensalidade do aluno técnico '%s'%n", this.getName());
    }

    public final void imprimirTecnico() {
        System.out.printf("Registro profissional: %s%n", this.getProfessionalRecord());
        System.out.printf("Matrícula: %s%n", this.getRegistration());
        System.out.printf("Curso:     %s%n", this.getCourse());
    }
}
