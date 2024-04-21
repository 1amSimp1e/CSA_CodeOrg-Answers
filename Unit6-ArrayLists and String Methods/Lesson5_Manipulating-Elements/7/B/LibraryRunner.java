import java.util.ArrayList;

public class LibraryRunner {
  public static void main(String[] args) {

    // Creates an ArrayList of Book objects
    ArrayList<Book> books = new ArrayList<Book>();
    books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
    books.add(new Book("1984", "George Orwell"));
    books.add(new Book("The Catcher in the Rye", "J.D. Salinger"));
    books.add(new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling"));
    books.add(new Book("The Lord of the Rings: The Fellowship of the Ring", "J.R.R. Tolkien"));

    // Creates a Library object
    Library library = new Library(books);

    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Call the findBook() method and print the Book object that is returned.
     * -----------------------------------------------------------------------------
     */
    System.out.println(library.findBook("Harry Potter and the Philosopher's Stone"));



    
    
  }
}
