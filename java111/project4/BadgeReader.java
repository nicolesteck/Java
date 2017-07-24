/**
*  BadgeReader looks at each individual Badge, based on which type would have
*  been assigned as a result of the individual's role in the school, and
*  determines whether that Badgeable should allow entry to the location
*  it references.
*
*/
public class BadgeReader {
    /**
    *  The swipe method evaluates whether a badge can be admitted into a
    *  location that the Badgeable brings in with it.
    *  @param location where entry is being attempted
    *  @param the badge type attempting entry
    *  @return whether the attempt should be successful or not (admit or no)
    */
    public boolean swipe(String location, Badgeable badge) {
        if (badge.allowEntry(location) == true) {
            return true;
        }

        return false;
    }
}
