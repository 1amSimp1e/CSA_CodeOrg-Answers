/*
 * Analyzes document text
 */
public class TextProcessor {
  
  private String[][] documentText;     // The 2D array containing the sentences of a document

  /*
   * Initializes documentText to the specified 2D array
   * containing the sentences of a document
   */
  public TextProcessor(String[][] documentText) {
    this.documentText = documentText;
  }

  /*
   * Returns the 2D array documentText
   */
  public String[][] getDocumentText() {
    return documentText;
  }

  /*
   * Returns the number of words in the document text that have the
   * same length as targetLength and start with the letter startsWith
   */
  public int countNumWords(int targetLength, String startsWith) {
    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Traverse the 2D array documentText. Count and return the number of
     * words in documentText that have the same length as targetLength and where
     * the location of startsWith is at index 0 in the String.
     * -----------------------------------------------------------------------------
     */

    // Setting the count variable 
    int count = 0;
    // loop through 2D array
    for(String[] row : documentText){
      for(String col : row){
        /* 
          if the length of words in the array same as target Length word 
          and the first letters starts width.
        */
        if(col.length() == targetLength && col.indexOf(startsWith) == 0){
          count++;
        }
      }
    }
  
    return count;
  }
  
}
