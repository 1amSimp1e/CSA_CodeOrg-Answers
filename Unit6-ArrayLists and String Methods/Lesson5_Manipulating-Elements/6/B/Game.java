import java.util.ArrayList;

/*
 * Represents a game
 */
public class Game {

  private ArrayList<Character> characters;    // The list of characters in a game

  /*
   * Initializes characters to the specified list of characters
   */
  public Game(ArrayList<Character> characters) {
    this.characters = characters;
  }

  /*
   * Returns the list of characters
   */
  public ArrayList<Character> getCharacters() {
    return characters;
  }

  /*
   * Returns the character at the specified index from characters
   */
  public Character getCharacter(int index) {
    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Use the get() method to return the character at the specified index.
     * -----------------------------------------------------------------------------
     */
    
    return characters.get(index);
  }

  /*
   * Replaces the Character at the specified index 
   * with the new specified Character
   */
  public void editCharacter(int index, String name, boolean isHero) {
    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Use the set() method to set the character at the specified index to a new
     * Character with the specified name and isHero status.
     * -----------------------------------------------------------------------------
     */
    characters.set(index, new Character(name, isHero));


    
  }

  /*
   * Returns a String containing each character in the list of characters
   */
  public String toString() {
    String result = "";

    for (int index = 0; index < characters.size(); index++) {
      result += characters.get(index) + "\n";
    }

    return result;
  }
  
}
