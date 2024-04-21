import java.util.ArrayList;

public class GameRunner {
  public static void main(String[] args) {

    // Creates an ArrayList of Character objects
    ArrayList<Character> characters = new ArrayList<Character>();
    characters.add(new Character("Mario", true));
    characters.add(new Character("Bowser", false));
    characters.add(new Character("Zelda", true));
    characters.add(new Character("Ganondorf", false));
    characters.add(new Character("Sonic", true));

    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Instantiate a Game object. Call the getCharacter() method and print
     * the Character object that is returned. Then call the editCharacter() method
     * and print the updated Game object.
     * -----------------------------------------------------------------------------
     */

    Game bob = new Game(characters);
    System.out.println(bob.getCharacter(3));
    System.out.println(bob);
    bob.editCharacter(0,"Bob", false);
    System.out.println(bob);

    
    
  }
}
