/**
*  Instantiate objects of the Contacts class, assign them values,
*  and then test those values by outputting them to the page. 
*/

public class ContactsTestDrive {
/**
*  This is the entry point method
*/
    public static void main(String[] args) {
        Contacts joeBob = new Contacts();
        joeBob.firstName = "Joe-Bob";
        joeBob.lastName = "Thomas";
        joeBob.address = "123 Main Street";
        joeBob.phone = "555-6000";
        joeBob.email = "joeBob@joesConspiracyTheories.org";

        joeBob.display();

        Contacts donny = new Contacts();
        donny.firstName = "Donald";
        donny.lastName = "Duckbrain";
        donny.address = "1600 Pennsylvania Avenue, Washington, DC";
        donny.phone = "202-456-1111";
        donny.email = "djtduck@whitehouse.gov";

        donny.display();
    }
}
