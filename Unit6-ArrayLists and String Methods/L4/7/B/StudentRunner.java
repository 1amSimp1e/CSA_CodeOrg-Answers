public class StudentRunner {
  public static void main(String[] args) {

    // Creates a College object
    College college = new College("CC");

    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Instantiate a Student object, then call the addCollege() method to add
     * a College object to the list. Call the accessor method and print the result.
     * -----------------------------------------------------------------------------
     */
    Student bob = new Student();
    bob.addCollege(college);
    System.out.println(bob.getColleges());



    
    
  }
}
