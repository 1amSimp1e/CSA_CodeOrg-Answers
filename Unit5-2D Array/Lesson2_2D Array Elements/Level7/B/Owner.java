/*
 * Represents an owner of a food truck
 */
public class Owner {

  private double[][] profits;     // The 2D array containing the daily profits each week

  /*
   * Initializes profits to the specified 2D array of daily profits
   */
  public Owner(double[][] profits) {
    this.profits = profits;
  }

  /*
   * Returns the 2D array of daily profits
   */
  public double[][] getProfits() {
    return profits;
  }

  /*
   * Returns the difference between the total profits the
   * first week and the total profits the second week
   */
  public double calcDifference() {
    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Calculate the sum of the elements in the first row and the sum of the
     * elements in the second row, and return the difference between the two.
     * -----------------------------------------------------------------------------
     */
    // Sum of first row
    double sumFirstRow = 0.0;
    for(int i = 0; i < profits[0].length; i++){
      sumFirstRow += profits[0][i];
    }
    // SUm of second row
    double sumSecondRow = 0.0;
    for(int i = 0; i < profits[0].length; i++){
      sumSecondRow += profits[1][i];
    }
   
    return sumFirstRow - sumSecondRow;
  }
  
}
