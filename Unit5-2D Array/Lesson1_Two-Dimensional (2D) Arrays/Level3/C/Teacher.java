/*
 * Manages data about student test scores
 */
public class Teacher {

  private int[][] scores;    // The 2D array containing test scores

  /*
   * Uses the setupData() method to initialize the 2D array scores
   */
  public Teacher() {
    this.scores = setupData();
  }

  /*
   * Returns the 2D array containing the test scores
   */
  public int[][] getScores() {
    return scores;
  }

  /*
   * Declares, initializes, and returns a 2D int array
   */
  public int[][] setupData() {
    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Create and return a 2D array that has 3 columns and 5 rows.
     * -----------------------------------------------------------------------------
     */
    int[][] tables = new int[5][3];

    
    return tables;
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
