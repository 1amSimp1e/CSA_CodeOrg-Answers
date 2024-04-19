/*
 * Manages data about the inventory for each food truck
 */
public class Owner {

  private int[][] inventories;    // The 2D array containing the inventory for each food truck

  /*
   * Uses the setupData() method to initialize the 2D array happiness
   */
  public Owner() {
    this.inventories = setupData();
  }

  /*
   * Returns the 2D array containing
   * inventories for each food truck
   */
  public int[][] getInventories() {
    return inventories;
  }

  /*
   * Declares, initializes, and returns a 2D int array
   */
  public int[][] setupData() {
    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Create and return a 2D array containing the values for each food truck.
     * -----------------------------------------------------------------------------
     */

    int[][] foodTrucks = {{25, 17, 22},
                          {18, 12, 15},
                          {21, 29, 27},
                          {30, 10, 23}
                         };

    
    return foodTrucks;
  }

  /*
   * Returns a String containing the contents of the 2D array data
   */
  public String dataToString(int[][] data) {
    String result = "";

    for (int row = 0; row < data.length; row++) {
      for (int col = 0; col < data[0].length; col++) {
        result += String.format("%-4d", data[row][col]);
      }

      result += "\n";
    }

    return result;
  }
}
