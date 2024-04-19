/*
 * Represents a literary work
 */
public class Literature {

  private String[][] authorWritings;    // The 2D array containing sentences from multiple works

  /*
   * Initializes writings to the specified 2D array
   * containing sentences from multiple works
   */
  public Literature(String[][] authorWritings) {
    this.authorWritings = authorWritings;
  }

  /*
   * Returns the 2D array authorWritings
   */
  public String[][] getAuthorWritings() {
    return authorWritings;
  }

  /*
   * Returns the number of words that start with targetLetter
   */
  public int countNumWords(String targetLetter) {
    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Counts and returns the number of words in authorWritings that start
     * with the parameter targetLetter.
     * -----------------------------------------------------------------------------
     */
    // count variable declaration
    int result = 0;
    for(String[] row : authorWritings){
      for(String col : row){
        // If it the index of target number is 0 (begin of the word is at index 0)
        if(col.indexOf(targetLetter) == 0){
          result++;
        }
      }
    }

    
    // returning the result
    return result;
  }
  
}
