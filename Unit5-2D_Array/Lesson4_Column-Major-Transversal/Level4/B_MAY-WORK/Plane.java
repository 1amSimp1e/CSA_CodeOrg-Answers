/*
 * Represents a plane
 */
public class Plane {

  private boolean[][] seats;    // The 2D array of seats on a plane

  /*
   * Initializes seats to the specified 2D array of seats
   */
  public Plane(boolean[][] seats) {
    this.seats = seats;
  }

  /*
   * Returns the 2D array of seats
   */
  public boolean[][] getSeats() {
    return seats;
  }

  /*
   * Upgrades the first occupied middle seat to a
   * window seat if one is available
   */
  public void upgradeMiddleSeat() {
    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Find the first occupied middle seat (column 1) and upgrade it to the first
     * available window seat.
     * -----------------------------------------------------------------------------
     */

    // Transverse 2D array seats in column-major order.
    for(int c = 0; c < seats[0].length; c++){
      for(int r = 0; r < seats.length; r++){
        if(seats[r][1] == true && seats[getAvailableWindowSeat()][0] == false){
          seats[r][0] = true;
          seats[r][1] = false;
        }
      }
    }
    System.out.println(getAvailableWindowSeat());
    
    
  }

  /*
   * Returns the row with the first available window seat
   */
  public int getAvailableWindowSeat() {
    int availableSeat = -1;
    
    for (int row = 0; row < seats.length; row++) {
      if (!seats[row][0]) {
        return row;
      }
    }

    return availableSeat;
  }

  /*
   * Returns a String containing the status of each seat on the plane
   */
  public String toString() {
    String result = "";

    for (int row = 0; row < seats.length; row++) {
      result += "Row #" + (row + 1) + ": ";
      
      for (int col = 0; col < seats[0].length; col++) {
        if (col == 0) {
          result += "[W] ";
        }
        else if (col == 1) {
          result += "[M] ";
        }
        else {
          result += "[A] ";
        }

        result += String.format("%-6s", seats[row][col]);
      }

      result += "\n";
    }

    return result;
  }
  
}
