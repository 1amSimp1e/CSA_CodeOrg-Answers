public class EmailRunner {
  public static void main(String[] args) {

    // Creates several 1D arrays containing the emails from the text files
    String[] firstWeek = FileReader.toStringArray("weekOne.txt");
    String[] secondWeek = FileReader.toStringArray("weekTwo.txt");
    String[] thirdWeek = FileReader.toStringArray("weekThree.txt");

    // Creates a 2D array of emails sent for several weeks
    String[][] customerEmails = {firstWeek, secondWeek, thirdWeek};

    // Creates an Email object
    Email email = new Email(customerEmails);

    // Creates a 1D array of keywords to search for
    String[] keywords = {"order", "confirmation"};

    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Call the findEmail() method and print the result.
     * -----------------------------------------------------------------------------
     */

    email.findEmail(keywords);

    

  }
}
