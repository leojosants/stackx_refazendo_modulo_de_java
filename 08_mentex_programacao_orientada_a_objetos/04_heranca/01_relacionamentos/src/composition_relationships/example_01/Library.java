package composition_relationships.example_01;

import java.util.ArrayList;
import java.util.List;

public class Library {
    /*
     * attribute
     */
    private String name;
    private List<Book> booksList;

    /*
     * constructor
     */
    public Library(String name, List<Book> booksList) {
        setName(name);
        setBooksList(booksList);
    }

    /*
     * getters and setters
     */
    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public List<String> getBooksList() {
        List<String> booksList = new ArrayList<String>();

        for (Book book : this.booksList) {
            booksList.add(book.getTitle());
            booksList.add(book.getAuthor());
        }

        return booksList;
    }

    private void setBooksList(List<Book> booksList) {
        this.booksList = booksList;
    }
}
