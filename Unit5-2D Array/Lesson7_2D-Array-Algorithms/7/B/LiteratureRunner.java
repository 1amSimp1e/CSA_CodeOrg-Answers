public class LiteratureRunner {
  public static void main(String[] args) {

    // Creates a 2D array containing sentences by an author
    String[][] writings = {{"I", "know", "why", "the", "caged", "bird", "sings"},
                           {"You", "may", "write", "me", "down", "in", "history"},
                           {"I", "mean", "precisely", "the", "opposite", "of", "that"}};

    // Creates a Literature object
    Literature author = new Literature(writings);

    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Call the countNumWords() method and prints the result.
     * -----------------------------------------------------------------------------
     */
    System.out.println(author.countNumWords("k"));


    
    
  }
}
