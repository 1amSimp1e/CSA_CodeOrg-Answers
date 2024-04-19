/*
 * Manages data about the cost of living in countries
 */
public class Researcher {

  private double[][] livingCost;    // The 2D array containing the cost of living index for each country

  /*
   * Uses the setupData() method to initialize the 2D array happiness
   */
  public Researcher() {
    this.livingCost = setupData();
  }

  /*
   * Returns the 2D array containing the cost
   * of living index for each country
   */
  public double[][] getLivingCost() {
    return livingCost;
  }

  /*
   * Declares, initializes, and returns a 2D double array
   */
  public double[][] setupData() {
    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Create and return a 2D array containing the values for each country.
     * -----------------------------------------------------------------------------
     */
    
    // Creating table
    double[][] table = {{77.75, 36.84, 77.44, 72.95}, // row 1
                        {33.24, 8.27, 28.16, 25.24}, // row 2
                        {70.22, 34.33, 70.01, 67.86}, // row 3
                        {74.13, 25.33, 73.64, 71.84}, // row 4
                        {70.13, 42.07, 70.37, 70.07} // row 5 
                       };

    return table;
  }

  /*
   * Returns a String containing the contents of the 2D array data
   */
  public String dataToString(double[][] data) {
    String result = "";

    for (int row = 0; row < data.length; row++) {
      for (int col = 0; col < data[0].length; col++) {
        result += String.format("%-8.2f", data[row][col]);
      }

      result += "\n";
    }

    return result;
  }
  
}
