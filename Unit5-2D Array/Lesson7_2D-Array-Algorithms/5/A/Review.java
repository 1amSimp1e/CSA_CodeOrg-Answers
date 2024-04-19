/*
 * Analyzes customer reviews
 */
public class Review {
  
  private String[][] productReviews;     // The 2D array containing the reviews submitted each week

  /*
   * Initializes productReviews to the specified 2D array
   * containing the reviews submitted each week
   */
  public Review(String[][] productReviews) {
    this.productReviews = productReviews;
  }

  /*
   * Returns the 2D array of product reviews
   */
  public String[][] getProductReviews() {
    return productReviews;
  }

  /*
   * Counts and returns the number of times the
   * targetWord appears in all product reviews
   */
  public int countTimes(String targetWord) {
    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Traverse the 2D array productReviews and count the number of times
     * targetWord appears in each review.
     * -----------------------------------------------------------------------------
     */


    // setting the count variable
    int count = 0;

    // Looping through 2D array
    for(int r = 0; r < productReviews.length; r++){
      for(int c = 0; c < productReviews[0].length; c++){
          // If the index of target word occur first in the list is > than 0 
          // => count +1; 
          if(productReviews[r][c].indexOf(targetWord) > 0){
            count++;
          }
      }
    }
    
    // Return the count
    return count;
  }


}
