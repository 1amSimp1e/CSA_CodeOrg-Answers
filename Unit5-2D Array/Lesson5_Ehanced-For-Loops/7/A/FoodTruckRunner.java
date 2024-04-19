public class FoodTruckRunner {
  public static void main(String[] args) {

    // Creates a 2D array containing each food truck inventory
    int[][] inventories = {{25, 17, 22}, {18, 12, 15}, {21, 19, 27}, {30, 10, 23}};

    // Creates an Owner object
    Owner jessie = new Owner(inventories);

    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Call the hasMinimum() method and print the result.
     * -----------------------------------------------------------------------------
     */
    System.out.println(jessie.hasMinimum(10));

    
    
  }
}
