import org.code.theater.*;

/*
 * Creates a scene based on which books have at least 10,000 reviews
 */
public class BookScene extends Scene {

  private Book[][] bestsellers;      // The 2D array of Book objects

  /*
   * Initializes bestsellers to the specified 2D array of Book objects
   */
  public BookScene(Book[][] bestsellers) {
    this.bestsellers = bestsellers;
  }

  /*
   * Returns a 1D array of Book objects containing
   * the books that had the most reviews each year
   */
  public Book[] findMostReviews() {
    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Traverse the bestsellers array to find all Book objects with the most
     * reviews each year. Add each Book object with the most reviews to a 1D array
     * of Book objects that is the same length as the number of columns in 
     * bestsellers and return the 1D array.
     * -----------------------------------------------------------------------------
     */

    Book[] reviewBooks = new Book[bestsellers[0].length ]; // 1D array same length as the # of collumns of best sellers. 
    for(int c = 0; c < bestsellers[0].length; c++){
      int maxReviews = bestsellers[0][0].getNumReviews();
      for(int r = 0; r < bestsellers.length; r++){
        if(bestsellers[r][c].getNumReviews() > maxReviews){
          maxReviews = bestsellers[r][c].getNumReviews();
          reviewBooks[c] = bestsellers[r][c];
        }
      }      
    }
    

    return reviewBooks;
  }

  /*
   * Creates a scene that draws the book cover for
   * each book that had the most reviews each year
   */
  public void createScene(Book[] results) {
    for (int index = 0; index < results.length; index++) {
      drawImage(results[index].getBookCover(), 50, 50, 250);
      pause(0.5);
      clear("white");
    }
  }

  public void test(){
    Book[] reviewBooks = new Book[bestsellers[0].length]; // 1D array same length as the # of collumns of best sellers. 
    int maxReviews = bestsellers[0][0].getNumReviews();
    for(int c = 0; c < bestsellers[0].length; c++){
      for(int r = 0; r < bestsellers.length; r++){
        if(bestsellers[r][c].getNumReviews() > maxReviews){
          // maxReviews = bestsellers[r][c].getNumReviews();
          reviewBooks[c] = bestsellers[r][c];
        }
      }      
      
    }

    for(int i = 0; i < reviewBooks.length; i++){
      System.out.println(reviewBooks[i]);
    }
  }
  
}
