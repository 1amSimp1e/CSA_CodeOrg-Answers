public class FoodTruckRunner {
  public static void main(String[] args) {

    // Creates a 2D array of daily profits
    double[][] profits = { {234.50, 1567.80, -350.25, 890.10},
                           {2345.67, -1200.00, 450.50, 1234.56} };

    // Creates an Owner object
    Owner foodTruck = new Owner(profits);

    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Call the calcDifference() method and print the result.
     * -----------------------------------------------------------------------------
     */
    System.out.println(foodTruck.calcDifference());
    




    
    
  }
}
