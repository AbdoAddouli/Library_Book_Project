public class Book {
    //attributes
    private String author;
    private tring title;
    public String isbn;
    public boolean isBorrowed;

    //constructor
    public Book(String author, String title, String isbn) {}

    //methods
    public void borrowBook() {
        isBorrowed = true;
    }

    public void returnBook() {
        isBorrowed = false;
    }



}
