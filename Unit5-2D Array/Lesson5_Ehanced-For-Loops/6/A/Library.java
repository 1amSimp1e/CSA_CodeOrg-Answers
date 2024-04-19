/*
 * Represents a library
 */
public class Library {

  private int[][] bookCount;      // The 2D array containing the number of times books have been borrowed

  /*
   * Initializes bookCount to the specified 2D array containing
   * the number of times books have been borrowed
   */
  public Library(int[][] bookCount) {
    this.bookCount = bookCount;
  }

  /*
   * Returns the 2D array bookCount
   */
  public int[][] getBookCount() {
    return bookCount;
  }

  /*
   * Returns the most number of times a book has been borrowed
   */
  public int getMostBorrowed() {
    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Find and return the value in the 2D array bookCount that is the highest.
     * -----------------------------------------------------------------------------
     */
    int maxBook = bookCount[0][0];
    for(int[] row : bookCount){
      for(int col : row){
        if(col > maxBook){
          maxBook = col; 
        }
      }
    }
    
    
    return maxBook;
  }
  
}
