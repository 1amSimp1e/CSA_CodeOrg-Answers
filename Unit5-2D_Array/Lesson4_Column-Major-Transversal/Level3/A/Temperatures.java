/*
 * Analyzes temperature data for several cities and dates
 */
public class Temperatures {

  private String[] dates;         // The 1D array of dates
  private double[][] cityTemps;   // The 2D array of temperatures for several cities

  /*
   * Initializes dates to the specified 1D array containing the dates
   * for each column of cityTemps and initializes cityTemps to the
   * specified 2D array of temperatures for several cities
   */
  public Temperatures(String[] dates, double[][] cityTemps) {
    this.dates = dates;
    this.cityTemps = cityTemps;
  }

  /*
   * Returns the 1D array of dates
   */
  public String[] getDates() {
    return dates;
  }

  /*
   * Returns the 2D array of temperatures
   */
  public double[][] getCityTemps() {
    return cityTemps;
  }

  /*
   * Returns the average temperature for each day in cityTemps
   */
  public String dailyAverages() {
    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Traverse the cityTemps array and calculate the average of each column.
     * Return a String containing each date and the average temperature on that day.
     * Use the getDate() method to get the date for each column.
     * -----------------------------------------------------------------------------
     */

    String result = "";

    /*
      Go through all the columns (5 columns)
      -> Start with columns 0 
      -> Need to get the average of each columns (date)
      -> Add them all up to get an average
    */
    for(int col = 0; col < cityTemps[0].length; col++){
      double sum = 0;
      // Go through row with the length of 4
      for(int row = 0; row < cityTemps.length; row++){
        sum += cityTemps[row][col]; // add up each collumns
      }
      double average = sum / cityTemps.length; // Take the sum / amount of numbers (How many rows they are))
      result += dates[col] + " Average: " + average + "\n";
    }
    
    return result;
  }
  /*
   * Returns the date for a given column
   */
  public String getDate(int column) {
    if (column < dates.length) {
      return dates[column];
    }
    else {
      return "Unknown";
    }
  }
  
}
