import java.util.ArrayList;

/*
 * Represents an address book
 */
public class AddressBook {

  private ArrayList<Contact> contacts;   // The list of contacts in an address book

  /*
   * Initializes contacts to the provided list of contacts
   */
  public AddressBook(ArrayList<Contact> contacts) {
    this.contacts = contacts;
  }

  /*
   * Returns the list of contacts
   */
  public ArrayList<Contact> getContacts() {
    return contacts;
  }

  /*
   * Returns the contact at the specified index
   */
  public Contact getContact(int index) {
    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Use the get() method to return the contact at the specified index.
     * -----------------------------------------------------------------------------
     */

    return contacts.get(index);
  }

  /*
   * Replaces the Contact at the specified index 
   * with the new specified Contact
   */
  public void editContact(int index, String name, String phone) {
    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Use the set() method to set the contact at the specified index to a new
     * Contact with the specified name and phone number.
     * -----------------------------------------------------------------------------
     */
    
    contacts.set(index, new Contact(name,phone));
    

    
  }

  /*
   * Returns a String containing each contact in the list of contacts
   */
  public String toString() {
    String result = "";

    for (int index = 0; index < contacts.size(); index++) {
      result += contacts.get(index) + "\n";
    }

    return result;
  }
  
}
