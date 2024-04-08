 private int[][] animalCount;     // The 2D array containing the number of animals spotted during several tours

  /*
   * Initializes animalCount to the specified 2D array containing
   * the number of animals spotted during several tours
   */
  public WildlifeTour(int[][] animalCount) {
    this.animalCount = animalCount;
  }

  /*
   * Returns the 2D array animalCount
   */
  public int[][] getAnimalCount() {
    return animalCount;
  }

  /*
   * Returns the total number of animals spotted during all tours
   */
  public int getTotalAnimals() {
    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Calculate and return the total of all values in the 2D array animalCount.
     * -----------------------------------------------------------------------------
     */
    int sum = 0;
    for(int[] row : animalCount){
      for(int col : row){
        sum += col;
      }
    }
    
    
    
    return sum;
  }
  
}
