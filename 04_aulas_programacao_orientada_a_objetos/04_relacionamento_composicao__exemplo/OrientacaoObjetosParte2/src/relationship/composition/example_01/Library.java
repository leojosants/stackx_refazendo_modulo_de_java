package example_01;

import java.util.List;

public class Library {
    /*
     * attributes
     */
    private String name;
    private List<Book> booksList;

    /*
     * constructor
     */
    public Library(String name, List<Book> booksList) {
        super();
        this.name = name;
        this.booksList = booksList;
    }

    /*
     * getters and setters
     */
    public String getName() {
        return this.name;
    }

    public List<Book> getBooksList() {
        return this.booksList;
    }
}
