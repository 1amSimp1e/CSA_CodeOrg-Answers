import java.util.ArrayList;

/*
 * Represents a Team
 */
public class Team {

  /* ----------------------------------- TO DO -----------------------------------
   * ✅ Write an instance variable to represent a list of Player objects, then
   * write a no-argument constructor that initializes the list to an empty list.
   * -----------------------------------------------------------------------------
   */
  private ArrayList<Player> bob; 
  public Team(){
    bob = new ArrayList<Player>();
  }

  

  /*
   * Returns the list of players
   */
  public ArrayList<Player> getPlayers() {
    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Return the list of Player objects.
     * -----------------------------------------------------------------------------
     */
    
    return bob;
  }
  
}
