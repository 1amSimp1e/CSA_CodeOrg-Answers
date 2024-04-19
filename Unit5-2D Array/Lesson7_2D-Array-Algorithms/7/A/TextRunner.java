public class TextRunner {
  public static void main(String[] args) {

    // Creates a 2D array of sentences
    String[][] sentences = { {"The", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"},
                             {"She", "sells", "seashells", "by", "the", "seashore"},
                             {"The", "cat", "in", "the", "hat", "went", "to", "the", "mat"},
                             {"To", "be", "or", "not", "to", "be", "that", "is", "the", "question"} };

    // Creates a TextProcessor object
    TextProcessor document = new TextProcessor(sentences);

    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Call the countNumWords() method and print the result.
     * -----------------------------------------------------------------------------
     */
    System.out.println(document.countNumWords(3,"The"));

    

    
    
  }
}
