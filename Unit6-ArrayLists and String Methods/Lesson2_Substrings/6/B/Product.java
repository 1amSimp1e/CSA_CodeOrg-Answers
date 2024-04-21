/*
 * Represents a product
 */
public class Product {

  private String label;    // The label on a product formatted as "Apple: $9.99"

  /*
   * Sets label to the specified label
   */
  public Product(String label) {
    this.label = label;
  }

  /*
   * Returns the label on the product
   */
  public String getLabel() {
    return label;
  }

  /*
   * Returns a substring containing the price from label
   */
  public String getPrice() {
    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Use the substring() method to return a substring containing the price
     * from the instance label variable. For example, if the label is "Apple: $9.99",
     * the method should return "$9.99".
     * -----------------------------------------------------------------------------
     */

    return getLabel().substring(11);
  }
  
}
