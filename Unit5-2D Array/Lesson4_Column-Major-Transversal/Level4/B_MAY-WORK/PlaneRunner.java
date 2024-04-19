public class PlaneRunner {
  public static void main(String[] args) {

    // Creates a 2D array of seats on a plane
    boolean[][] seats = { {false, false, false},
                          {false, true, true},
                          {true, false, false},
                          {true, true, true},
                          {true, false, true},
                          {false, true, true} };

    // Creates a Plane object
    Plane toSeattle = new Plane(seats);

    // Prints the Plane object
    System.out.println(toSeattle);

    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Call the upgradeMiddleSeat() method and print the updated Plane object.
     * -----------------------------------------------------------------------------
     */
    toSeattle.upgradeMiddleSeat();
    System.out.println(toSeattle);


    
    
  }
}
