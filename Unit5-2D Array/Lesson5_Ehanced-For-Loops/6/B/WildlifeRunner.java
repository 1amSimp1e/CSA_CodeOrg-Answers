public class WildlifeRunner {
  public static void main(String[] args) {

    // Creates a 2D array containing the number of animals spotted on each tour
    int[][] animalCount = {{3, 5, 2}, {1, 4, 6}, {2, 5, 3}, {6, 2, 1}};

    // Creates a WildlifeTour object
    WildlifeTour wildlifeTour = new WildlifeTour(animalCount);

    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Call the getTotalAnimals() method and print the result.
     * -----------------------------------------------------------------------------
     */
    System.out.println(wildlifeTour.getTotalAnimals());



    
    
  }
}
