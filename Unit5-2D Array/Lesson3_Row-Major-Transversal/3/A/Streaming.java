/*
 * Represents a movie streaming platform
 */
public class Streaming {

  private int[][] ratings;      // The 2D array of the number of ratings received for several movies

  /*
   * Initializes ratings to the specified 2D array of the number of ratings received
   */
  public Streaming(int[][] ratings) {
    this.ratings = ratings;
  }

  /*
   * Returns the 2D array ratings
   */
  public int[][] getRatings() {
    return ratings;
  }

  /*
   * Returns the total ratings received
   */
  public int calcTotalRatings() {
    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Traverse the 2D array ratings in row-major order. Calculate and return
     * the sum of all the values in ratings.
     * -----------------------------------------------------------------------------
     */

    int sum = 0;
    for(int i = 0; i < ratings.length; i++){
      for(int index = 0; index < ratings[0].length; index++){
        sum += ratings[i][index];
      }
    }
    return sum;
  }
  
}
