public class CommunityRunner {
  public static void main(String[] args) {

    // Creates a 2D array containing the number of floors for each land plot
    int[][] floors = {{1, 2, 2},
                      {2, 5, 1},
                      {3, 1, 2}};

    // Creates a Community object
    Community downtown = new Community(floors);

    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Call the swapFloors() method, and print the updated 2D array using the
     * landToString() method in the Community class. Then call the setCommunityCenter()
     * method and print the updated 2D array using the landToString() method.
     * -----------------------------------------------------------------------------
     */

    // SwapFloors
    downtown.swapFloors();
    System.out.println(downtown.landToString());

    // Set Community Center 
    downtown.setCommunityCenter();
    System.out.println(downtown.landToString());



    
    
  }
}
