import java.util.*;
public class Test {
  public static void main(String[] args) {
    ArrayList<Integer> bob = new ArrayList<Integer>();

    bob.add(12);
    bob.add(3);
    bob.add(5);
    bob.add(6);

    System.out.println(bob);
    for(Integer i : bob){
      if(i > 12){
        bob.add(0,i);
      }
    }
    System.out.println(bob);
    
  } 
}
