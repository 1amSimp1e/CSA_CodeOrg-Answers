public class GameRunner {
  public static void main(String[] args) {

    // Creates a 1D array of integers to represent a board
    int[][] numbers = { {5, 9, 3, 1},
                        {7, 2, 8, 6},
                        {4, 0, 1, 9},
                        {3, 5, 2, 8} };

    // Creates a Game object
    Game boardGame = new Game(numbers);

    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Call the calcScore() method and print the result.
     * -----------------------------------------------------------------------------
     */
    System.out.println(boardGame.calcScore());


    
    
  }
}
