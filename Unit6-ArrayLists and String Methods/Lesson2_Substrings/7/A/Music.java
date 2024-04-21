/*
 * Represents a musical chord
 */
public class Music {
  
  private String chord;    // The musical chord formatted as "note1/note2/note3"

  /*
   * Sets chord to the specified musical chord
   */
  public Music(String chord) {
      this.chord = chord;
  }

  /*
   * Returns the musical chord
   */
  public String getChord() {
    return chord;
  }

  /*
   * Returns a substring containing the first note in chord
   */
  public String getFirstNote() {
  /* ----------------------------------- TO DO -----------------------------------
   * ✅ Use the substring() method to return a substring containing the first
   * note in the instance variable chord.
   * -----------------------------------------------------------------------------
   */

    return getChord().substring(0,1);
  }
}
