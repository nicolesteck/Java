/**
*  The Badgeable interface will allow only certain users to be assigned the
*  ability to even have a Badge.
*/

public interface Badgeable {
    public abstract boolean allowEntry(String location);
}
