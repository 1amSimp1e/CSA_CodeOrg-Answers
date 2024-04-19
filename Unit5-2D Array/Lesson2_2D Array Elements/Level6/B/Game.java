/*
 * Represents a board game
 */
public class Game {

  private int[][] board;    // The 2D array of integers that represent the board

  /*
   * Initializes board to the specified 2D array of integers
   */
  public Game(int[][] board) {
    this.board = board;
  }

  /*
   * Returns the 2D array board
   */
  public int[][] getBoard() {
    return board;
  }

  /*
   * Calculates and returns the sum of all four corners of the board
   */
  public int calcScore() {
    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Calculate and return the sum of the four corners of the board.
     * -----------------------------------------------------------------------------
     */
    // row = r & column = c
    //        First r & c +  first r & last e of that r   + last c & first r           + last c & last r
    int sum = board[0][0] + board[0][board[0].length - 1] + board[board.length - 1][0] + board[board.length - 1][board[0].length - 1];
    
    return sum;
  }
  
}
