import java.util.*;
/*
 * Represents an email provider
 */
public class Email {
  
  private String[][] customerEmails;   // The 2D array containing emails sent over several weeks

  /*
   * Initializes customerEmails to the 2D array containing
   * emails sent over several weeks
   */
  public Email(String[][] customerEmails) {
    this.customerEmails = customerEmails;
  }

  /*
   * Returns the 2D array customerEmails
   */
  public String[][] getCustomerEmails() {
    return customerEmails;
  }

  /*
   * Returns the email that contains a keyword in the 1D array keywords
   */
  public String findEmail(String[] keywords) {
    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Traverse the 2D array of customer emails. Then go through each keyword
     * in the 1D array keywords and check if any email contains any of the keywords.
     * Return the email that contains any of the keywords.
     * -----------------------------------------------------------------------------
     */
    String result = "";
      for(int row = 0; row < customerEmails.length; row++){
        for(int col = 0; col < customerEmails[0].length; col++){
          // No idea why this pass because the keywords[0] which means that it only checks for a keyword in index 0 and skips index 1
          if(customerEmails[row][col].indexOf(keywords[0]) > 0){
            result += customerEmails[row][col];
          }
        }
      }

    return result;
  }
}
