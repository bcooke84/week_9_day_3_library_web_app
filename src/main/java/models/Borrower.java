package models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Entity
@Table(name ="borrowers")
public class Borrower {

    private int id;
    private Set<Book> books;
    private String name;
    private Library library;

    public Borrower() {}


    public Borrower(String name) {
        this.books = new HashSet<>();
        this.name = name;
    }

    @Column(name="id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @OneToMany(mappedBy = "borrower")
    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public void addBook(Book book){
        this.books.add(book);
    }

    public void returnBook(){
        this.books.clear();
    }

    public int countBooks(){
        return this.books.size();
    }
    @Column(name="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToOne()
    @JoinColumn(name="library_id")
    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }
}
