import org.junit.*;

import static org.junit.Assert.assertEquals;

public class BookTest {

    // declare variables
    private Book book1;
    private Book book2;

    // create test data
    @Before
    public void before(){
        // create new Book instances
        book1 = new Book("Alice in Wonderland", Genre.FANTASY);
        book2 = new Book("The Cat in the Hat", Genre.ADVENTURE);

    }

    @Test
    public void hasName1(){
        assertEquals("Alice in Wonderland", book1.getTitle());
    }

    @Test
    public void hasName2(){
        assertEquals("The Cat in the Hat", book2.getTitle());
    }

    @Test
    public void hasGenre1(){
        assertEquals( Genre.FANTASY, book1.getGenre());
    }
}
