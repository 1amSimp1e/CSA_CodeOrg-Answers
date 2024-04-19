public class ReviewRunner {
  public static void main(String[] args) {

    // Reads the data from the text files into 1D arrays for each week
    String[] weekOneReviews = FileReader.toStringArray("weekOne.txt");
    String[] weekTwoReviews = FileReader.toStringArray("weekTwo.txt");
    String[] weekThreeReviews = FileReader.toStringArray("weekThree.txt");

    // Creates a 2D array of reviews submitted each week
    String[][] productReviews = {weekOneReviews, weekTwoReviews, weekThreeReviews};

    // Creates a Review object
    Review review = new Review(productReviews);

    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Call the countTimes() method and print the result.
     * -----------------------------------------------------------------------------
     */

    System.out.println(review.countTimes("easy"));


    
    
  }
}
