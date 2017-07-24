/**
*  Contacts.java
*  Works within mainline MyName function 
*
* @author npsteck
*/

/**
*   Class introduces the instance variables within each contact
*/

public class Contacts {
    public String firstName;
    public String lastName;
    public String address;
    public String phone;
    public String email;

    /**
    * The display function outputs the contact information for the current
    * contact record.
    */ 
    
    public void display() {
        System.out.println("This is " + firstName + ". ");
        System.out.println(firstName + "'s information follows:");
        System.out.println(firstName + " " + lastName);
        System.out.println(address);
        System.out.println(phone + ", " + email);
        System.out.println(" ");
    }
}