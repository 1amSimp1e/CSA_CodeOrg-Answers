public class TemperaturesRunner {
  public static void main(String[] args) {

    // Creates a 1D array of dates
    String[] dates = {"March 29th", "March 30th", "March 31st", "April 1st", "April 2nd"};

    // Creates a 2D array containing the daily temperatures for several cities

    //                     "March 29th", "March 30th", "March 31st", "April 1st", "April 2nd"
    double[][] cityTemps = {
                            {37.27, 40.66, 53.53, 52.36, 48.87},
                            {62.2, 61.47, 60.31, 62.42, 62.38},
                            {81.5, 80.04, 81.61, 85.91, 85.69},
                            {56.41, 48.6, 51.67, 48.72, 52.65}
    };

    // Creates a Temperatures object
    Temperatures cities = new Temperatures(dates, cityTemps);

    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Call the dailyAverages() method and print the result.
     * -----------------------------------------------------------------------------
     */
    System.out.println(cities.dailyAverages());


    
    
  }
}
