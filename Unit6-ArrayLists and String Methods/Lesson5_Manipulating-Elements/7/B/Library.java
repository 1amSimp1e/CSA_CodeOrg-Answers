import java.util.ArrayList;

/*
 * Represents a library
 */
public class Library {

  private ArrayList<Book> books;   // The list of books in a library

  /*
   * Initializes books to the specified list of books
   */
  public Library(ArrayList<Book> books) {
    this.books = books;
  }

  /*
   * Returns the list of books in the library
   */
  public ArrayList<Book> getBooks() {
    return books;
  }

  /*
   * Returns the Book object that matches the parameter titleToFind
   */
  public Book findBook(String titleToFind) {
    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Traverse the books list and check if each Book object's title matches
     * titleToFind. If so, return the Book object. If no match is found, return null.
     * -----------------------------------------------------------------------------
     */

    for(Book bob : books){
      if(bob.getTitle().equals(titleToFind)){
         return bob;
      }
    }
    return null;

  }
  
}
