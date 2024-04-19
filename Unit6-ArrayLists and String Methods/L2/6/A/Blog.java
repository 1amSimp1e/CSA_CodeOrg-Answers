/*
 * Represents a blog post
 */
public class Blog {

  private String title;   // The title of a blog post
  private String date;    // The date a blog post was published formatted as MM/DD/YYYY

  /*
   * Sets title to the specified title of the
   * blog post and date to the specified date
   */
  public Blog(String title, String date) {
    this.title = title;
    this.date = date;
  }

  /*
   * Returns the title of the blog post
   */
  public String getTitle() {
    return title;
  }

  /*
   * Returns the date the blog post was published
   */
  public String getDate() {
    return date;
  }

  /*
   * Returns a substring containing the year from the date
   */
  public String getYear() {
    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Use the substring() method to obtain and return the year portion of the date.
     * -----------------------------------------------------------------------------
     */
    

    

    return getDate().substring(6);
  }

  /*
   * Returns a String containing the title of the blog
   * post and the date it was published
   */
  public String toString() {
    return "[" + date + "] " + title;
  }
  
}
