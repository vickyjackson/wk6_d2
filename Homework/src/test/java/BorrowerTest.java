import org.junit.*;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    // declare variables
    private Library library1;
    private Book book1;
    private Book book2;
    private Borrower borrower1;

    // create test data
    @Before
    public void before(){

        ArrayList<Book> fictionBooks = new ArrayList<>();

        // create new instances
        library1 = new Library(20, fictionBooks);
        book1 = new Book("The Lion, the Witch and the Wardrobe", Genre.ADVENTURE);
        book2 = new Book("Harry Potter and the Chamber of Secrets", Genre.FANTASY);
        borrower1 = new Borrower();
    }

    @Test
    public void collectionStartsEmpty(){
        assertEquals(0, borrower1.countBooks());
    }

    @Test
    public void canTakeBook(){
        library1.addBook(book1);
        library1.addBook(book2);
        assertEquals(0, borrower1.countBooks());
        assertEquals(2, library1.countBooks());
        borrower1.takeBook(book1, library1);
        assertEquals(1, borrower1.countBooks());
        assertEquals(1, library1.countBooks());
    }
}
