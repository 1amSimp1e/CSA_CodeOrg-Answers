public class MuseumRunner {
  public static void main(String[] args) {

    // Creates a 2D array of visitors to several exhibits each day
    int[][] visitorData = { {120, 125, 130, 135, 140, 150, 155},
                            {100, 95, 105, 110, 115, 120, 130},
                            {70, 80, 85, 90, 95, 100, 110},
                            {50, 60, 70, 80, 90, 100, 110},
                            {200, 220, 240, 260, 280, 300, 320}};

    // Creates a Museum object
    Museum history = new Museum(visitorData);

    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Call the getMaxVisitors() method and print the result.
     * -----------------------------------------------------------------------------
     */
    System.out.println(history.getMaxVisitors());
    
    
  }
}
