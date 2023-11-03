import classes.Book;
import classes.Loan;
import classes.Person;

public class App {
    public static void main(String[] args) throws Exception {

        Person person_1 = new Person("Leonardo", 39);
        Book book_1 = new Book("Tecnologia", "Autor A");

        Loan loan = new Loan();
        loan.rentBook(person_1, book_1, 2, 04, 2024);
        loan.returnBook(person_1, book_1, 12, 04, 2024);
        loan.printLoanList();
    }
}
