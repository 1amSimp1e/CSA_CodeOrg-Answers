/*
 * Represents an owner of a food truck business
 */
public class Owner {

  private int[][] inventories;   // The 2D array of dessert inventories

  /*
   * Initializes inventories to the specified 2D
   * array of dessert inventories
   */
  public Owner(int[][] inventories) {
    this.inventories = inventories;
  }

  /*
   * Returns the 2D array inventories
   */
  public int[][] getInventories() {
    return inventories;
  }

  /*
   * Returns true if any food truck has a quantity of
   * desserts that are more than minValue
   */
  public boolean hasMinimum(int minValue) {
    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Traverse the inventories array and return true if any food truck has a
     * quantity of desserts more than minValue. Otherwise, return false.
     * -----------------------------------------------------------------------------
     */
    for(int[] row : inventories){
      for(int col : row){
        if(col > minValue){
          return true;
        }
      }
    }

    

    return false;
  }
  
}
