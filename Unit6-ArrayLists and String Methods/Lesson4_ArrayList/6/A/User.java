import java.util.ArrayList;

/*
 * Represents a User
 */
public class User {

  /* ----------------------------------- TO DO -----------------------------------
   * ✅ Write an instance variable to represent a list of Friend objects and a
   * no-argument constructor that initializes the list to an empty list.
   * -----------------------------------------------------------------------------
   */
  // instance variable to represents a list of Friend object
  private ArrayList<Friend> friends;

  public User(){
    // Initialize the List to an empty list
    friends = new ArrayList<Friend>();
  }



  /*
   * Returns the list of friends
   */
  public ArrayList<Friend> getFriends() {
    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Return the list of Friend objects.
     * -----------------------------------------------------------------------------
     */

    return friends;
  }
  
}
