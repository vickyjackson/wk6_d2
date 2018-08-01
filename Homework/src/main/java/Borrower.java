import java.util.ArrayList;

public class Borrower {

    // declare variables
    ArrayList<Book> collection;

    // constructor
    public Borrower(){
        this.collection = new ArrayList<>();
    }

    public int countBooks(){
        // count the number of elements in the ArrayList collection
        return this.collection.size();
    }

    // add a book to the collection
    public void takeBook(Book book, Library library){
        this.collection.add(book);
        library.removeBook(book);
    }
}
