public class Book {

    // declare variables
    private String title;
    private Genre genre;

    // constructor (takes one arg)
    public Book(String title, Genre genre){
        this.title = title;
        this.genre = genre;
    }

    // return the title
    public String getTitle(){
        return this.title;
    }

    public Genre getGenre(){
        return this.genre;
    }

}
