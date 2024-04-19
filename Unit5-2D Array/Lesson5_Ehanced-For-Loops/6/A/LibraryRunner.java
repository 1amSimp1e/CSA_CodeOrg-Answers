public class LibraryRunner {
  public static void main(String[] args) {

    // Creates a 2D array containing the number of times books have been borred
    int[][] bookBorrowCount = { 
                                  {3, 5, 2}, 
                                  {1, 4, 6}, 
                                  {2, 5, 3} 
    };

    // Creates a Library object
    Library library = new Library(bookBorrowCount);

    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Call the getMostBorrowed() method and print the result.
     * -----------------------------------------------------------------------------
     */
    System.out.println(library.getMostBorrowed());
  }
}
