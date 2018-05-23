package models;

import javax.persistence.*;

@Entity
@Table(name="books")
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

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    @ManyToOne
    @JoinColumn(name = "library_id", nullable = false)
    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    @ManyToOne
    @JoinColumn(name = "borrower_id", nullable = false)
    public Borrower getBorrower() {
        return borrower;
    }

    public void setBorrower(Borrower borrower) {
        this.borrower = borrower;
    }
}
