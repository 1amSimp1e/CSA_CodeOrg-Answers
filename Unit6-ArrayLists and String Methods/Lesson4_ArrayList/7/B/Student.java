import java.util.ArrayList;

/*
 * Represents a student
 */
public class Student {

  /* ----------------------------------- TO DO -----------------------------------
   * ✅ Write an instance variable to represent a list of College objects, then
   * write a no-argument constructor that initializes the list to an empty list.
   * -----------------------------------------------------------------------------
   */
  private ArrayList<College> bob; 

  public Student(){
    bob = new ArrayList<College>();
  }

  
  
  /*
   * Returns the list of colleges
   */
  public ArrayList<College> getColleges() {
    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Return the list of College objects.
     * -----------------------------------------------------------------------------
     */
    
    return bob;
  }

  /*
   * Adds a college to the list of colleges
   */
  public void addCollege(College newCollege) {
    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Add the parameter newCollege to the list of College objects.
     * -----------------------------------------------------------------------------
     */
      bob.add(newCollege);
    
  }
  
}
