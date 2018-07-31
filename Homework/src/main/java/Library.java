import java.util.ArrayList;

public class Library {

    // declare the variables
    private int capacity;
    public ArrayList<Book> books;
    private int current_stock;

    // constructor (takes two args)
    public Library(int capacity, ArrayList<Book> listofBooks){
        // assign arguments to variables
        this.capacity = capacity;
        this.books = listofBooks;
    }

    public int countBooks(){
        // count the number of elements in the ArrayList books
        return this.books.size();
    }

    public boolean isStockFull(){
        // assign size of ArrayList books to a variable
        current_stock = this.books.size();
        // check if current_stock is greater than or equal to capacity
        // return true if it is
        // return false if it isn't
        if (current_stock >= capacity){
            return true;
        }
        else {
            return false;
        }
    }

    // add a book to books only if isStockFull returns false
    // otherwise return a string to the console
    public String addBook(Book book){
        if (!isStockFull()){
            this.books.add(book);
            return "The book was added!";
        }
        else {
            return "There's not enough room so the book wasn't added";
        }
    }

}
