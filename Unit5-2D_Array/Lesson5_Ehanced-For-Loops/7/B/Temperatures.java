/*
 * Analyzes data about daily temperatures in cities
 */
public class Temperatures {

  private double[][] dailyTemps;  // The 2D array of daily temperatures

  /*
   * Initializes dailyTemps to the specified
   * 2D array of daily temperatures
   */
  public Temperatures(double[][] dailyTemps) {
    this.dailyTemps = dailyTemps;
  }

  /*
   * Returns the 2D array dailyTemps
   */
  public double[][] getDailyTemps() {
    return dailyTemps;
  }

  /*
   * Returns the overall average of all temperatures
   */
  public double calcAverage() {
    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Calculate and return the overall average temperature.
     * -----------------------------------------------------------------------------
     */
    double sum = 0;
    for(double[] row : dailyTemps){
      for(double col : row){
        sum += col;
      }
    }
    
    // Calculate the length by # of columns * # of rows
    int length = dailyTemps[0].length * dailyTemps.length;
    // Return the average
    return sum / length;
  }
  
}
