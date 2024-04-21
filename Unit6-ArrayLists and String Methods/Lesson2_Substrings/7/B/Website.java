/*
 * Represents a website
 */
public class Website {
  
  private String url;    // The website address

  /*
   * Sets url to the specified website address
   */
  public Website(String url) {
    this.url = url;
  }

  /*
   * Returns the website address
   */
  public String getURL() {
    return url;
  }

  /*
   * Returns a substring containing the domain name from url
   */
  public String getDomainName() {
    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Use the substring() method to return a substring that contains the domain
     * name from the instance variable url.
     * -----------------------------------------------------------------------------
     */

    
    return getURL().substring(11,17);
  }
  
}
