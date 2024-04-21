import java.util.ArrayList;

public class AddressBookRunner {
  public static void main(String[] args) {

    // Creates an ArrayList of Contact objects
    ArrayList<Contact> contacts = new ArrayList<Contact>();
    contacts.add(new Contact("Emily Johnson", "(555) 123-4567"));
    contacts.add(new Contact("Michael Rodriguez", "(555) 234-5678"));
    contacts.add(new Contact("Sarah Davis", "(555) 345-6789"));
    contacts.add(new Contact("Jason Lee", "(555) 456-7890"));
    contacts.add(new Contact("Madison Turner", "(555) 567-8901"));

    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Instantiate an AddressBook object. Call the getContact() method and print
     * the Contact object that is returned. Then call the editContact() method and
     * print the updated AddressBook object.
     * -----------------------------------------------------------------------------
     */
    AddressBook bob = new AddressBook(contacts);
    System.out.println(bob);
    bob.getContact(2);
    bob.editContact(2, "Bob", "33333-33333-3333");
    System.out.println(bob);

    
    
  }
}
