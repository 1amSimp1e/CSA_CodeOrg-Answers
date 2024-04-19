public class ProductRunner {
  public static void main(String[] args) {

    // Creates a customer feedback
    String customer = "The product has exceeded my expectations and I will definitely be a returning customer.";

    // Creates a ProductData object
    ProductData feedback = new ProductData(customer);

    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Call the textToWords() method and print the result.
     * -----------------------------------------------------------------------------
     */
    System.out.println(feedback.textToWords());


    
    
  }
}
