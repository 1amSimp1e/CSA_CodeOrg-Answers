public class ProductRunner {
  public static void main(String[] args) {

    // Creates a 2D array of customer satisfaction ratings for several products
    int[][] ratingsData = { {4, 5, 3, 4, 5, 4, 5, 3, 5, 4, 5, 3, 5, 4, 5, 3, 4, 5, 4, 5},
                            {3, 4, 5, 4, 3, 4, 5, 4, 3, 4, 5, 4, 3, 4, 5, 4, 3, 4, 5, 4},
                            {5, 4, 5, 4, 5, 4, 5, 4, 5, 4, 5, 4, 5, 4, 5, 4, 5, 4, 5, 4},
                            {4, 5, 4, 5, 4, 5, 4, 5, 4, 5, 4, 5, 4, 5, 4, 5, 4, 5, 4, 5},
                            {3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4} };

    // Creates a Product object
    Product electronics = new Product(ratingsData);

    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Call the calcAverageRating() method and print the result.
     * -----------------------------------------------------------------------------
     */
    System.out.println(electronics.calcAverageRating());



    
    
  }
}
