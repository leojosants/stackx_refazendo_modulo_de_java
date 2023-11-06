import classes.Book;
import classes.Loan;
import classes.Person2;

public class App {
    public static void main(String[] args) throws Exception {

        Person2 person_1 = new Person2("Leonardo", 39);
        Book book_1 = new Book("Tecnologia", "Autor A");

        Loan loan = new Loan();
        loan.rentBook(person_1, book_1, 2, 04, 2024);
        loan.returnBook(person_1, book_1, 12, 04, 2024);
        loan.printLoanList();
    }
}
