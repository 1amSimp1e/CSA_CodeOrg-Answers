public class FoodTruckRunner {
  public static void main(String[] args) {

    // Creates an Owner object
    Owner foodTruck = new Owner();

    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Create a 2D array to store the array returned from calling the
     * setupData() method, then print the contents of the 2D array using the
     * dataToString() method in the Owner class.
     * -----------------------------------------------------------------------------
     */
    int[][] bob = foodTruck.setupData();
    System.out.println(foodTruck.dataToString(bob));




    
    
  }
}
