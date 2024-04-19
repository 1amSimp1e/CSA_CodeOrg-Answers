public class ResearchRunner {
  public static void main(String[] args) {

    // Creates a Researcher object
    Researcher analyst = new Researcher();

    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Create a 2D array to store the array returned from calling the
     * setupData() method, then print the contents of the 2D array using the
     * dataToString() method in the Researcher class.
     * -----------------------------------------------------------------------------
     */

    double[][] anotherTable = analyst.setupData();

    // Print out
    System.out.println(analyst.dataToString(anotherTable));




    
    
  }
}
