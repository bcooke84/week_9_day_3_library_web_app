package db;

import models.Book;
import models.Borrower;
import models.Library;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBLibrary {

    private static Session session;

    public static List<Book> getBooks(Library library) {
        session = HibernateUtil.getSessionFactory().openSession();
        List<Book> books = null;

        try {
            Criteria cr = session.createCriteria(Book.class);
            cr.add(Restrictions.eq("library", library));
            books = cr.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close()
        }
        return books;
    }

    public static List<Borrower> getBorrowers(Library library) {
        session = HibernateUtil.getSessionFactory().openSession();
        List<Borrower> borrowers = null;

        try {
            Criteria cr = session.createCriteria(Borrower.class);
            cr.add(Restrictions.eq("library", library));
            borrowers = cr.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return borrowers;
    }


}


