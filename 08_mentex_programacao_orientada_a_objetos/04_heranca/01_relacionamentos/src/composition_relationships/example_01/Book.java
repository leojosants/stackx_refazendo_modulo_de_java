package composition_relationships.example_01;

public class Book {
    /*
     * attribute
     */
    private String title;
    private String author;

    /*
     * constructor
     */
    public Book(String title, String author) {
        setTitle(title);
       setAuthor(author);
    }

    /*
     * getters and setters
     */
    public String getTitle() {
        return this.title;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    private void setAuthor(String author) {
        this.author = author;
    }


     
}
