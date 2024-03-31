/*
 * Manages data about users on social media services
*/

public class SocialMedia {

  private int[][] numUsers;    // The 2D array containing the number of users for each service

  /*
   * Uses the setupData() method to initialize the 2D array numUsers
   */
  public SocialMedia() {
    this.numUsers = setupData();
  }

  /*
   * Returns the 2D array containing the number
   * of users for each social media service
   */
  public int[][] getNumUsers() {
    return numUsers;
  }

  /*
   * Declares, initializes, and returns a 2D int array
   */
  public int[][] setupData() {
    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Create and return a 2D array that has 3 columns and 4 rows.
     * -----------------------------------------------------------------------------
     */
    int[][] bob = new int[4][3];
        
    return bob;
  }

  /*
   * Returns a String containing the contents of the 2D array data
   */
  public String dataToString(int[][] data) {
    String result = "";

    for (int row = 0; row < data.length; row++) {
      for (int col = 0; col < data[0].length; col++) {
        result += data[row][col] + " ";
      }

      result += "\n";
    }

    return result;
  }
}
