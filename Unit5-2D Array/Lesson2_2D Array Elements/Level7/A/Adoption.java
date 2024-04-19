/*
 * Represents a pet adoption center
 */
public class Adoption {

  private Pet[][] pets;      // The 2D array of Pet objects

  /*
   * Initializes pets to the specified 2D array of Pet objects
   */
  public Adoption(Pet[][] pets) {
    this.pets = pets;
  }

  /*
   * Returns the 2D array of Pet objects
   */
  public Pet[][] getPets() {
    return pets;
  }

  /*
   * Reverses the row located at index by swapping the first
   * and last elements in the row
   */
  public void reversePets(int index) {
    /* ----------------------------------------- TO DO -----------------------------------------
     * ✅ Reverse the row located at the parameter index by swapping the first and last elements.
     * -----------------------------------------------------------------------------------------
     */

    // first elements from the index row  
    pets[index][0] = pets[index][pets[0].length - 1];
    


    
  }

  /*
   * Returns a String containing the information for
   * each Pet object in the 2D array pets
   */
  public String toString() {
    String result = "";

    for (int row = 0; row < pets.length; row++) {
      for (int col = 0; col < pets[0].length; col++) {
        result += pets[row][col] + " ";
      }

      result += "\n";
    }

    return result;
  }
  
}
