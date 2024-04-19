public class TeacherRunner {
  public static void main(String[] args) {

    // Creates a 2D array of student test scores
    int[][] testScores = { {85, 90, 80, 70},
                           {90, 80, 75, 85},
                           {70, 75, 80, 90},
                           {80, 90, 85, 75},
                           {75, 70, 80, 85} };

    // Creates a Teacher object
    Teacher msSanchez = new Teacher(testScores);

    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Call the .calcAverageScores() method and print the result.
     * -----------------------------------------------------------------------------
     */
    System.out.println(msSanchez.calcAverageScores());



    

  }
}
