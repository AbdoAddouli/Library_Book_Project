public class Main {
    public static void main(String[] args) throws Exception {
        Library library = new Library();

        //add some Books
        library.addBook(new Book("George Orwell","1984", "9780451524935"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "9780060935467"));
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565"));

        //Display books
        library.displayBooks();
        
    }
}
