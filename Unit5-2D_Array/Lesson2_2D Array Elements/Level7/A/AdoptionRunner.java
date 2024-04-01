public class AdoptionRunner {
  public static void main(String[] args) {

    // Creates a 2D array of Pet objects
    Pet[][] pets = { {new Pet("Dog", 2), new Pet("Dog", 5), new Pet("Dog", 8)},
                     {new Pet("Hamster", 1), new Pet("Hamster", 2), new Pet("Hamster", 3)},
                     {new Pet("Bird", 5), new Pet("Bird", 7), new Pet("Bird", 12)} };

    // Creates an Adoption object
    Adoption petAdoptions = new Adoption(pets);

    // Prints the Adoption object
    System.out.println(petAdoptions);

    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Call the reversePets() method, then print the Adoption object.
     * -----------------------------------------------------------------------------
     */

    petAdoptions.reversePets(2);
    System.out.println(petAdoptions);



    
    
  }
}
