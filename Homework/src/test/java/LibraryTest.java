import org.junit.*;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    // declare variables
    private Library library1;
    private Library library2;
    private Book book1;
    private Book book2;

    // create test data
    @Before
    public void before(){

        // create new variable of type ArrayList<Book>
        // assign a new instance of ArrayList to the variable
        ArrayList<Book> fictionBooks = new ArrayList<>();

        // create new Library and Book instances
        library1 = new Library(20, fictionBooks);
        library2 = new Library(1, fictionBooks);
        book1 = new Book("The Lion, the Witch and the Wardrobe");
        book2 = new Book("Harry Potter and the Chamber of Secrets");
    }

    @Test
    public void startsEmpty(){
        assertEquals(0, library1.countBooks());
    }

    @Test
    public void canAddBook(){
        library1.addBook(book1);
        assertEquals(1, library1.countBooks());
    }

    @Test
    public void cantAddBookStockFull(){
        library2.addBook(book1);
        library2.addBook(book2);
        assertEquals(1, library1.countBooks());
    }

}
