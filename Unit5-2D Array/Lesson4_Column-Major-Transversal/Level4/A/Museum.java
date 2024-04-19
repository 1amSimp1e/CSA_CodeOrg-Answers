/*
 * Represents a museum
 */
public class Museum {

  private int[][] visitors;    // The 2D array of visitors to a museum

  /*
   * Initializes visitors to the specified 2D
   * array of visitors to the museum
   */
  public Museum(int[][] visitors) {
    this.visitors = visitors;
  }

  /*
   * Returns the 2D array visitors
   */
  public int[][] getVisitors() {
    return visitors;
  }

  /*
   * Returns the day with the highest number of
   * total visitors across all exhibits
   */
  public int getMaxVisitors() {
    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Traverse the visitors array in column-major order and find the sum of
     * visitors for each day (column). Return the column index that has the largest
     * total visitors for a day (column).
     * -----------------------------------------------------------------------------
     */

    // Create a array contains visitors each day (columns)
    int[] sumVisitors = new int[visitors[0].length];
    int index = 0; // Create an index number

    // Loop through visitor data and calculate the sum of each day 
    for(int c = 0; c < visitors[0].length; c++){
      int sum = 0;
      for(int r = 0; r < visitors.length; r++){
        sum += visitors[r][c];
      }
      // Set the total of visitor each day to a list
      sumVisitors[c] = sum; 
    }

    // Finding the maxium number and find the index of the largest number
    int largestVisitor = sumVisitors[0];
    for(int i = 0; i < sumVisitors.length; i++){
      if(sumVisitors[i] > largestVisitor){
        largestVisitor = sumVisitors[i];
        index = i;
      }
  }
   return index;
  }
}
