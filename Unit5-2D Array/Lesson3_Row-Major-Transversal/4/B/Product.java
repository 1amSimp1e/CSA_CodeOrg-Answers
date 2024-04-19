/*
 * Represents a product
 */
public class Product {

  private int[][] ratings;    // The 2D array of customer satisfaction ratings

  /*
   * Initializes ratings to the specified 2D array of customer satisfaction ratings
   */
  public Product(int[][] ratings) {
    this.ratings = ratings;
  }

  /*
   * Returns the 2D array ratings
   */
  public int[][] getRatings() {
    return ratings;
  }

  /*
   * Returns the average of all customer satisfaction ratings
   */
  public double calcAverageRating() {
    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Traverse the 2D array ratings in row-major order. Calculate and return
     * the average of all the values in ratings by dividing the total by the
     * number of rows times the number of columns.
     * -----------------------------------------------------------------------------
     */
    int sum = 0;
    for(int i = 0; i < ratings.length; i++){
      for(int index = 0; index < ratings[0].length; index++){
        sum += ratings[i][index];
      }
    }
    double rowsAndColumns = ratings.length * ratings[0].length;
    double average = sum / rowsAndColumns;
    
    return average;
  }
  
}
