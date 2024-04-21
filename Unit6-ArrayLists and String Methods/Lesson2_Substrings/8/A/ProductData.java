/*
 * Represents feedback for a product
 */
public class ProductData {

  private String feedback;    // The feedback for a product

  /*
   * Sets feedback to the specified customer feedback
   */
  public ProductData(String feedback) {
    this.feedback = feedback;
  }

  /*
   * Returns the customer feedback
   */
  public String getFeedback() {
    return feedback;
  }

  /*
   * Returns a String containing each word in feedback on separate lines
   */
  public String textToWords() {
    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Use the indexOf() and substring() methods in the String class to obtain
     * each word in feedback and concatenating it to a new String on a new line.
     * -----------------------------------------------------------------------------
     */

        String words = "";
        int startIndex = 0;
        int endIndex = 0;

        while (endIndex < feedback.length()) {

            // endIndex find the space " " position from the startIndex 
            endIndex = feedback.indexOf(" ", startIndex);

            // if don't find the endIndex is equal to the length of the word
            if (endIndex == -1) {
                endIndex = feedback.length();
            }

            // variable word get the word from the start index to the end index
            String word = feedback.substring(startIndex, endIndex);
            words += word + "\n";

            // start index is the end index from which the space occured
            startIndex = endIndex + 1;
        }

    
        return words.substring(0, words.length() - 1);
  }
}
  