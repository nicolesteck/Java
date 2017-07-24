/**
* Principal is a specific type of person, and it is one who, vitally, has
* badged entry to any location.
*/
public class Principal extends Person implements Badgeable {
    /**
    * allowEntry determines where the principal is allowed (everywhere)
    * @param location being entered
    * @return whether he can enter (he can)
    */
    public boolean allowEntry(String location) {
            // The principal should be allowed in any building
            // or location.
            return true;
    }
}
