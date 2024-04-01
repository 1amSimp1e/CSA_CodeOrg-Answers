public class StreamingRunner {
  public static void main(String[] args) {

    // Creates a 2D array of number of ratings received for several movies
    int[][] dailyRatings = { {43, 68, 112, 29},
                             {85, 76, 91, 54},
                             {39, 121, 72, 93},
                             {56, 81, 98, 65} };

    // Creates a Streaming object
    Streaming movies = new Streaming(dailyRatings);

    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Call the calcTotalRatings() method and print the result.
     * -----------------------------------------------------------------------------
     */
    System.out.println(movies.calcTotalRatings()); 
  }
}
