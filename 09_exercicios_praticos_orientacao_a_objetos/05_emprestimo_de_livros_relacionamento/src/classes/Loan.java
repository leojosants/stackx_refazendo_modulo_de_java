package classes;

public class Loan {
    /*
     * attributes
     */
    private int id;
    private int rentalDay;
    private int rentalMonth;
    private int rentalYear;
    private int returnDay;
    private int returnMonth;
    private int returnYear;
    private boolean isRented = false;
    private Person2 person;
    private Book book;

    /*
     * constructor
     */
    public Loan() {
        this.id = 0;
        this.rentalDay = 0;
        this.rentalMonth = 0;
        this.rentalYear = 0;
        this.returnDay = 0;
        this.returnMonth = 0;
        this.returnYear = 0;
        this.isRented = false;
    }

    /*
     * getters and setters
     */
    public int getId() {
        return this.id = (int) (Math.random() * 1000);
    }

    private void setId(int value) {
        this.id = value;
    }

    public int getRentalDay() {
        return this.rentalDay;
    }

    private void setRentalDay(int rentalDay) {
        this.rentalDay = rentalDay;
    }

    public int getRentalMonth() {
        return this.rentalMonth;
    }

    private void setRentalMonth(int rentalMonth) {
        this.rentalMonth = rentalMonth;
    }

    public int getRentalYear() {
        return this.rentalYear;
    }

    private void setRentalYear(int rentalYear) {
        this.rentalYear = rentalYear;
    }

    public int getReturnDay() {
        return this.returnDay;
    }

    private void setReturnDay(int returnDay) {
        this.returnDay = returnDay;
    }

    public int getReturnMonth() {
        return this.returnMonth;
    }

    private void setReturnMonth(int returnMonth) {
        this.returnMonth = returnMonth;
    }

    public int getReturnYear() {
        return this.returnYear;
    }

    private void setReturnYear(int returnYear) {
        this.returnYear = returnYear;
    }

    public Person2 getPerson() {
        return this.person;
    }

    private void setPerson(Person2 person) {
        this.person = person;
    }

    public Book getBook() {
        return this.book;
    }

    private void setBook(Book book) {
        this.book = book;
    }

    public boolean getIsRented() {
        return this.isRented;
    }

    private void setIsRented(boolean situation) {
        this.isRented = situation;
    }

    /*
     * methods
     */
    public void rentBook(Person2 person, Book book, int day, int month, int year) {
        if (getIsRented() == false) {
            if ((day < 0) || (day > 31)) {
                System.out.println("-> value incorreto para data [01 - 31]");
                setIsRented(false);
                return;
            }

            if ((month < 0) || (month > 12)) {
                System.out.println("-> value incorreto para mês [01 - 12]");
                setIsRented(false);
                return;
            }

            if (year != 2024) {
                System.out.println("-> value incorreto para year [2024]");
                setIsRented(false);
                return;
            }

            setRentalDay(day);
            setRentalMonth(month);
            setRentalYear(year);
            setPerson(person);
            setBook(book);
            setIsRented(true);
            System.out.println("-> locação realizada com sucesso");

        } else {
            setIsRented(false);
            System.out.println("-> locação não realizada");
        }
    }

    public void returnBook(Person2 person, Book book, int day, int month, int year) {
        if ((day < 0) || (day > 31)) {
            System.out.println("-> value incorreto para data [01 - 31]");
            setIsRented(true);
            return;
        }

        if ((month < 0) || (month > 12)) {
            System.out.println("-> value incorreto para mês [01 - 12]");
            setIsRented(true);
            return;
        }

        if (year != 2024) {
            System.out.println("-> value incorreto para year [2024]");
            setIsRented(true);
            return;
        }

        setReturnDay(day);
        setReturnMonth(month);
        setReturnYear(year);
        setPerson(person);
        setBook(book);
        setIsRented(false);
        System.out.println("-> devolucao realizada com sucesso");
    }

    public void printLoanList() {
        System.out.println("\nExibindo dados da locação");
        System.out.printf("ID de controle: %d%n", getId());
        System.out.printf("Nome do livro: %s%n", getBook().getName());
        System.out.printf("Autor do livro: %s%n", getBook().getAuthor());
        System.out.printf("ID do livro: %d%n", getBook().getId());
        System.out.printf("Data da locação: %d/%d/%d%n", getRentalDay(), getRentalMonth(), getRentalYear());

        if (getIsRented() == false) {
            System.out.printf("Data da devolução: %d/%d/%d%n", getReturnDay(), getReturnMonth(),
                    getReturnYear());

        } else {
            System.out.println("Data da devolução: não devolvido");
        }

        System.out.printf("Nome do cliente:  %s%n", person.getName());
        System.out.printf("Idade do cliente: %d%n", person.getAge());
    }
}
