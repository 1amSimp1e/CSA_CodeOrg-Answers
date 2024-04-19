public class TeacherRunner {
  public static void main(String[] args) {

    // Creates a Teacher object
    Teacher msCook = new Teacher();

    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Create a 2D array to store the array returned from calling the
     * setupData() method, then print the contents of the 2D array using the
     * dataToString() method in the Teacher class.
     * -----------------------------------------------------------------------------
     */
    int[][] newTables = msCook.setupData();
    System.out.println(msCook.dataToString(newTables));
    




    
    
  }
}
