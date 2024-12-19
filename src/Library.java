import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    //add a book to the Library

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully: " + book.getTitle());

    }
    //remove a book from the Library by isbn
    public void removeBook(String isbn) {
    Book bookToRemove = null;
    for (Book book : books) {
        if (book.getIsbn().equals(isbn)) {
            bookToRemove = book;
            break;
        }
    }
    if (bookToRemove != null) {
        books.remove(bookToRemove);
        System.out.println("Book removed successfully: " + bookToRemove.getTitle());
    }else{
        System.out.println("No book found with ISBN: " + isbn);
    }
    }
     // Search for a book by title or author
    public void searchBook(String query){
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(query.toLowerCase()) || book.getAuthor().toLowerCase().contains(query.toLowerCase())) {
                System.out.println(book.getTitle() + " by " + book.getAuthor());
            }
        }
        System.out.println("No book found matching the query: " + query);

    }
    public void displayBooks(){
        System.out.println("Library Books:");
        if(books.isEmpty()){
            System.out.println("No books available.");
        }else{
            for (Book book : books) {
                System.out.println(book.getTitle() + " by " + book.getAuthor());
            }
        }
    }


}
