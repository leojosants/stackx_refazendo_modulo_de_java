package classes;

public class Financing {
    /*
     * attributes
     */
    public Double amount;
    public Double entry;
    public Integer installments;

    /*
     * constructor
     */
    public Financing(Double amount, Double entry, Integer installments) {
     
        if (entry < amount * 0.2) {
            throw new RuntimeException("-> a entrada deve ser 20% do valor total");

        } else if (installments < 6) {
            throw new RuntimeException("-> o número de mínimo de parcelas deve ser 6");
        }

        this.setAmount(amount);
        this.setEntry(entry);
        this.setInstallments(installments);
    }

    /*
     * getters and setters
     */
    public Double getAmount() {
        return this.amount;
    }

    private void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getEntry() {
        return this.entry;
    }

    private void setEntry(Double entry) {
        this.entry = entry;
    }

    public Integer getInstallments() {
        return this.installments;
    }

    private void setInstallments(Integer installments) {
        this.installments = installments;
    }

    /*
     * methods
     */
    public double valueOfTheInstallment() {
        return (this.getAmount() - this.getEntry()) / this.getInstallments();
    }
}
