package example_01;

public class Book {
    /*
     * attributes
     */
    public String title;
    public String author;

    /*
     * constructor
     */
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    /*
     * methods
     */
    @Override
    public String toString() {
        return title + " - " + author;
    }
}
