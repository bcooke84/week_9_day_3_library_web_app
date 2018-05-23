package models;

import java.util.HashSet;
import java.util.Set;

public class Library {

    private String name;
    private Set<Book> books;
    private Set<Borrower> borrowers;

    public Library() {
    }

    public Library(String name) {
        this.name = name;
        this.books = new HashSet<Book>();
        this.borrowers = new HashSet<Borrower>();
    }



}
