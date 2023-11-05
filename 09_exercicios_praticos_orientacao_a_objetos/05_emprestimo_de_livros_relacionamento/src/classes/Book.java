package classes;

public class Book {
    /*
     * attributes
     */
    private int id;
    private String name;
    private String author;

    /*
     * constructor
     */
    public Book(String name, String author) {
        this.id = 0;
        this.name = name;
        this.author = author;
    }

    /*
     * getters and setters
     */
    public int getId() {
        return this.id=(int) (Math.random() * 1000);
    }

    private void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return this.author;
    }

    private void setAuthor(String author) {
        this.author = author;
    }
}
