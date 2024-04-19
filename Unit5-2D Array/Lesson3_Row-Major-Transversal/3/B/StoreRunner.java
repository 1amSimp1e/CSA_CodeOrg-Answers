public class StoreRunner {
  public static void main(String[] args) {

    // Creates a 2D array of the sales for multiple departments each day
    double[][] salesData = { {1500.50, 1600.75, 1200.25, 1400.90, 1700.25, 1800.50, 1900.75},
                             {1000.25, 900.50, 1100.75, 1200.90, 1000.25, 800.75, 900.50},
                             {800.90, 700.25, 600.50, 500.75, 400.25, 300.90, 200.50},
                             {2000.75, 1900.50, 1800.25, 1700.90, 2000.50, 2100.75, 2200.25},
                             {3500.25, 3200.90, 2800.50, 3100.75, 4000.25, 4200.50, 4500.75} };

    // Creates a Store object
    Store deptStore = new Store(salesData);

    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Call the calcTotalSales() method and print the result.
     * -----------------------------------------------------------------------------
     */

    System.out.println(deptStore.calcTotalSales());



    
    
  }
}
