public class WeatherRunner {
  public static void main(String[] args) {

    // Creates a 2D array containing the daily temperatures for several cities
    double[][] cityTemps = {{37.27, 40.66, 53.53, 52.36, 48.87},
                            {62.2, 61.47, 60.31, 62.42, 62.38},
                            {81.5, 80.04, 81.61, 85.91, 85.69},
                            {56.41, 48.6, 51.67, 48.72, 52.65}};

    // Creates a Temperatures object
    Temperatures cities = new Temperatures(cityTemps);

    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Call the calcAverage() method and print the result.
     * -----------------------------------------------------------------------------
     */
    System.out.println(cities.calcAverage());


    
    
  }
}
