/*
 * Represents a community
 */
public class Community {

  private int[][] landPlots;     // The 2D array containing the number of floors at each land plot

  /*
   * Initializes landPlots to the specified 2D array of land plots
   */
  public Community(int[][] landPlots) {
    this.landPlots = landPlots;
  }

  /*
   * Returns the 2D array of land plots
   */
  public int[][] getLandPlots() {
    return landPlots;
  }

  /*
   * Swaps the values in the first and last positions of
   * the first row in the 2D array landPlots
   */
  public void swapFloors() {
    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Swap the first and last elements of the first row in landPlots.
     * -----------------------------------------------------------------------------
     */
    // Temporary Variables
    int foo = landPlots[0][0];
    landPlots[0][0] = landPlots[0][landPlots[0].length - 1];
    landPlots[0][landPlots[0].length - 1] = foo;

    
  }

  /*
   * Gets the sum of the first building in the first row and
   * the last building in the last row and assigns the result
   * to the center position of the 2D array landPlots
   */
  public void setCommunityCenter() {
    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Set the center element in landPlots to the sum of the first element in
     * the first row and the last element in the last row.
     * -----------------------------------------------------------------------------
     */
    // Center index
    landPlots[landPlots.length / 2][landPlots[0].length / 2] = landPlots[0][0] + landPlots[landPlots.length - 1][landPlots[0].length - 1];


    
  }

  /*
   * Returns a String containing the number of floors for each
   * land plot in the 2D array landPlots
   */
  public String landToString() {
    String result = "";

    for (int row = 0; row < landPlots.length; row++) {
      for (int col = 0; col < landPlots[0].length; col++) {
        result += String.format("%-4d", landPlots[row][col]);
      }

      result += "\n";
    }

    return result;
  }
  
}
