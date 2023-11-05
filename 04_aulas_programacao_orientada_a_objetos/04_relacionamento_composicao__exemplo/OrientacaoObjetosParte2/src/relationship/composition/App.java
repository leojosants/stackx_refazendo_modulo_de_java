import java.util.ArrayList;
import java.util.List;

import example_01.Library;
import example_01.Book;
import example_02.Person10;

public class App {

	public static void main(String[] args) {
		
		exampleOne();
		exampleTwo();
	}

	private static void exampleOne() {
		Book book_1 = new Book("The Book", "Albert Y");
		Book book_2 = new Book("Casabranca", "Ramirez P.");
		Book book_3 = new Book("The Love", "Pamela T.");
		
		List<Book> booksList = new ArrayList<Book>();
		booksList.add(book_1);
		booksList.add(book_2);
		booksList.add(book_3);
		
		Library library = new Library("Cora C.", booksList);
		
		System.out.println(library.getBooksList());
	}
	
	private static void exampleTwo() {
		Person10 person_1 = new Person10();
        double salario = person_1.getSalary();
        
        System.out.println(salario);
	}
}
