package classes;

public class Product implements Comparable<Product>{
    /*
     * attribute
     */
    private String name;
    private Double price;

    /*
     * constructor
     */
    public Product(String name, Double price) {
        this.setName(name);
        this.setPrice(price);
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    /*
     * methods
     */
    @Override
    public String toString() {
        return this.getName() + ", " + String.format("%.2f", this.getPrice());
    }

    @Override
    public int compareTo(Product other) {
        return this.getPrice().compareTo(other.getPrice());
    }

}
