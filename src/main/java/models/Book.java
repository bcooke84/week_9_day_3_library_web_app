package models;

import java.util.HashSet;

public class Book {

    private String title;
    private Library library;
    private Borrower borrower;

    public Book() {
    }

    public Book(String title, Library library, Borrower borrower) {
        this.title = title;
        this.library = library;
        this.borrower = borrower;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public Borrower getBorrower() {
        return borrower;
    }

    public void setBorrower(Borrower borrower) {
        this.borrower = borrower;
    }
}
