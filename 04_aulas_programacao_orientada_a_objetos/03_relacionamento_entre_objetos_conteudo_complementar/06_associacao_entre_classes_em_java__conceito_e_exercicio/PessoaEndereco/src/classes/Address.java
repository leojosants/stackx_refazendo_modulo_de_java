package classes;

public class Address {
    /*
     * attributes
     */
    private String public_place;
    private String complement;
    private String cep;
    private int number;

    /*
     * getters and setters
     */
    public String getPublicPlace() {
        return this.public_place;
    }

    public void setPublicPlace(String public_place) {
        this.public_place = public_place;
    }

    public String getComplement() {
        return this.complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getCep() {
        return this.cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    /*
     * methods
     */
    public void printData() {
        System.out.printf("Logradouro:  %s%n",this.getPublicPlace());
        System.out.printf("Número:      %d%n",this.getNumber());
        System.out.printf("Complemento: %s%n",this.getComplement());
        System.out.printf("CEP:         %s%n",this.getCep());
    }
}
