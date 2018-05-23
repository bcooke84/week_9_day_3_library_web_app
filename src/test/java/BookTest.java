import models.Book;
import models.Library;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book1;
    Library library;

    @Before
    public void before() {
        library = new Library();
        book1 = new Book("1984", library);
    }

    @Test
    public void name() {
        assertEquals(true, book1.isAvailableToBorrow());
    }


}
