package classes;

public class Client {
    /*
     * attribute
     */
    private String name;
    private String address;

    /*
     * constructor
     */
    public Client() {
    }

    /*
     * getters and setters
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /*
     * method
     */
    @Override
    public String toString() {
        return "Nome: " + getName() + "\nEndereço: " + getAddress();
    }
}
