import java.util.ArrayList;

public class ElectionRunner {
  public static void main(String[] args) {

    // Creates an ArrayList of voters
    ArrayList<Voter> voters = new ArrayList<Voter>();
    voters.add(new Voter(false));
    voters.add(new Voter(true));
    voters.add(new Voter(false));
    voters.add(new Voter(false));
    voters.add(new Voter(true));
    
    // Creates an Election object
    Election studentCouncil = new Election(voters);

    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Call the countVotes() method and print the result.
     * -----------------------------------------------------------------------------
     */
      System.out.println(studentCouncil.countVotes());

    
    
  }
}
