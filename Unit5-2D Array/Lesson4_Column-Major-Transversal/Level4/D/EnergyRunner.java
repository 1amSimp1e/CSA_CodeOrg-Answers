public class EnergyRunner {
  public static void main(String[] args) {

    // Creates a 2D array containing the daily energy consumption for several apartments
    double[][] energyConsumption = { {10.5, 8.2, 7.1, 12.0, 9.3, 11.1, 13.2},
                                     {5.3, 6.0, 7.9, 8.1, 9.2, 10.0, 11.6},
                                     {9.1, 11.0, 8.4, 7.3, 10.2, 12.1, 6.5},
                                     {8.9, 7.5, 6.6, 5.8, 9.1, 10.5, 11.9} };

    // Creates an Energy object
    Energy apts = new Energy(energyConsumption);

    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Call the findMinEnergy() and findMaxEnergy() methods and print the results.
     * -----------------------------------------------------------------------------
     */

    System.out.println(apts.findMinEnergy());
    System.out.println(apts.findMaxEnergy());


    

  }
}
