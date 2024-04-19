/*
 * Represents a department store
 */
public class Store {

  private double[][] sales;       // The 2D array containing the sales for each department in a week

  /*
   * Initializes sales to the specified 2D array of sales
   */
  public Store(double[][] sales) {
    this.sales = sales;
  }

  /*
   * Returns the 2D array sales
   */
  public double[][] getSales() {
    return sales;
  }

  /*
   * Returns the total sales
   */
  public double calcTotalSales() {
    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Traverse the 2D array sales in row-major order. Calculate and return
     * the sum of all the values in sales.
     * -----------------------------------------------------------------------------
     */

    double sum = 0.0;
    
    for(int i = 0; i < sales.length; i++){
      for(int index = 0; index < sales[0].length; index++){
          sum += sales[i][index];
      }
    }

    

    return sum;
  }
  
}
