import java.util.ArrayList;

/*
 * Represents an election
 */
public class Election {

  private ArrayList<Voter> voters;   // The list of voters

  /*
   * Initializes voters to the specified list of voters
   */
  public Election(ArrayList<Voter> voters) {
    this.voters = voters;
  }

  /*
   * Returns the list of voters
   */
  public ArrayList<Voter> getVoters() {
    return voters;
  }

  /*
   * Returns the number of voters that have voted
   */
  public int countVotes() {
    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Traverse the voters list and count the number of times hasVoted is true
     * for each Voter object.
     * -----------------------------------------------------------------------------
     */
    int count = 0;
    for(Voter bob : voters){
      if(bob.getHasVoted()){
        count++;
      }
    }

    

    return count;
  }
  
}
