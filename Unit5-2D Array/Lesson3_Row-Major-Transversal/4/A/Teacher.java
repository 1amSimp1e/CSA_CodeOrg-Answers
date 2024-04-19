/*
 * Represents a teacher
 */
public class Teacher {

  private int[][] testScores;    // The 2D array of test scores for several students

  /*
   * Initializes testScores to the specified 2D array of test scores
   */
  public Teacher(int[][] testScores) {
    this.testScores = testScores;
  }

  /*
   * Returns the 2D array testScores
   */
  public int[][] getTestScores() {
    return testScores;
  }

  /*
   * Returns the average of all test scores
   */
  public double calcAverageScores() {
    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Traverse the 2D array testScores in row-major order. Calculate and return
     * the average of all the values in testScores by dividing the total by the
     * number of rows times the number of columns.
     * -----------------------------------------------------------------------------
     */

    // transerse 2d array + add the sum 
    int sum = 0;

    for(int i = 0; i < testScores.length; i++){
      for(int index = 0; index < testScores[0].length; index++){
        sum += testScores[i][index];
      }
    }
    
    // Number of rows times the number of columns
    double rowsAndColumns = testScores.length * testScores[0].length;
    double average = sum / rowsAndColumns;
    
    
    return average;
  }
  
}
