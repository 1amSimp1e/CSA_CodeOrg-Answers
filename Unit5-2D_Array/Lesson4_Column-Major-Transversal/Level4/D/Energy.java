public class Energy {

  private double[][] dailyEnergy;     // The 2D array of energy consumption for several apartments

   /* Initializes dailyEnergy to the specified 2D array
   * of energy consumption for several apartments
   */
  public Energy(double[][] dailyEnergy) {
    this.dailyEnergy = dailyEnergy;
  }

  /*
   * Returns the 2D array dailyEnergy
   */
  public double[][] getDailyEnergy() {
    return dailyEnergy;
  }

  /*
   * Returns the day with the lowest total energy consumption
   */
  public int findMinEnergy() {
    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Traverse the 2D array dailyEnergy and find the sum of each column. Return
     * the column index that has the lowest total energy consumption.
     * -----------------------------------------------------------------------------
     */
    
    // Create Array storing each columns sum total
    double[] array = new double[dailyEnergy[0].length];

    // Loop through 2D arary with columns: 
    for(int c = 0; c < dailyEnergy[0].length; c++){
      double sum = 0;
      // Calculating the sum of total elements in that row
      for(int r = 0; r < dailyEnergy.length;r++){
          sum += dailyEnergy[r][c];
      }
      array[c] = sum; // Set each columns sum to an array
    }

    // Finding the minium in that array
    double minIndex = array[0];
    int index = 0;
    for(int i = 0; i < array.length; i++){
      if(minIndex > array[i]){
        minIndex = array[i];
        index = i;
      }
    }
    
    return index;
  }

  /*
   * Returns the day with the highest total energy consumption
   */
  public int findMaxEnergy() {
    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Traverse the 2D array dailyEnergy and find the sum of each column. Return
     * the column index that has the highest total energy consumption.
     * -----------------------------------------------------------------------------
     */
    
    // Create Array storing each columns sum total
    double[] array = new double[dailyEnergy[0].length];

    // Loop through 2D arary with columns: 
    for(int c = 0; c < dailyEnergy[0].length; c++){
      double sum = 0;
      // Calculating the sum of total elements in that row
      for(int r = 0; r < dailyEnergy.length;r++){
          sum += dailyEnergy[r][c];
      }
      array[c] = sum; // Set each columns sum to an array
    }

    /* 
      Finding the max in that array
    */
    double maxIndex = array[0];
    int index = 0;
    for(int i = 0; i < array.length; i++){
      // if the current index less than the elements in the array 
      if(maxIndex < array[i]){
        maxIndex = array[i];
        index = i;
      }
    }
    
    return index;
    

  }
  
}
