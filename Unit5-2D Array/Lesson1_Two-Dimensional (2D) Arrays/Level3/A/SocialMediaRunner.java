public class SocialMediaRunner {
  public static void main(String[] args) {

    // Creates a SocialMedia object
    SocialMedia analyst = new SocialMedia();

    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Create a 2D array to store the array returned from calling the
     * setupData() method, then print the contents of the 2D array using the
     * dataToString() method in the SocialMedia class.
     * -----------------------------------------------------------------------------
     */

    // print contents of the 2D array
    System.out.println(analyst.dataToString(analyst.setupData()));

  }
}
