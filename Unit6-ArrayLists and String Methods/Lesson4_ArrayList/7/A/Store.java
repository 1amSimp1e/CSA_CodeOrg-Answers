import java.util.ArrayList;

/*
 * Represents a store
 */
public class Store {

  /* ----------------------------------- TO DO -----------------------------------
   * ✅ Write an instance variable to represent a list of Product objects, then
   * write a no-argument constructor that initializes the list to an empty list.
   * -----------------------------------------------------------------------------
   */
  // instance variable represent a list of Product objects
  private ArrayList<Product> bob;
  public Store(){
    // Initialize the list to an empty list
    bob = new ArrayList<Product>();
  }


  
  
  /*
   * Returns the list of products
   */
  public ArrayList<Product> getProducts() {
    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Return the list of Product objects.
     * -----------------------------------------------------------------------------
     */
    

    return bob;
  }

  /*
   * Adds a product to the list of products
   */
  public void addProduct(Product newProduct) {
    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Add the parameter newProduct to the list of Product objects.
     * -----------------------------------------------------------------------------
     */
    bob.add(newProduct);

    
  }
  
}
