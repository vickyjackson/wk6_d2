import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    // declare the variables
    private int capacity;
    public ArrayList<Book> books;
    public HashMap<Genre, Integer> genreHash;
    private int current_stock;

    // constructor (takes two args)
    public Library(int capacity, ArrayList<Book> listofBooks){
        // assign arguments to variables
        this.capacity = capacity;
        this.books = listofBooks;
        this. genreHash = new HashMap<>();
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

    // for each book in books
    // if HashMap genreHash already contains a key equal to that book's genre
    // get the value of that key and add 1 to it
    // else put a key value pair of that book's genre => 1 into the genreHash
    public int countBooksByGenre(Genre genre){
        for (int i = 0; i < this.books.size(); i++){
            Book book = books.get(i);
            if (genreHash.containsKey(book.getGenre())){
                genreHash.put(book.getGenre(), genreHash.get(book.getGenre()) + 1);
            }
            else {
                genreHash.put(book.getGenre(), 1);
            }

        }
        return genreHash.get(genre);
    }

}
