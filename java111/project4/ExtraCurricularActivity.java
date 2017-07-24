/**
* The ExtraCurricularActivity class generally covers all of the possible
* varieties of extracurrics, and has the basic variables covered.
*/
public class ExtraCurricularActivity{
    private String name;
    private String lead;
    private int numberOfStudents;

    /**
    * setName makes the private name publicly-modifiable
    * @param name of the activity
    */
    public void setName(String name) {
        this.name = name;
    }
    /**
    *  getName makes the private name publicly-viewable
    * @return name of the activity
    */
    public String getName() {
        return name;
    }
    /**
    * setLead makes the private lead's name publicly-modifiable
    * @param lead's name
    */
    public void setLead(String lead) {
        this.lead = lead;
    }
    /**
    * getLead makes the private lead name publicly-viewable
    * @return lead's name
    */
    public String getLead() {
        return lead;
    }
    /**
    * setNumberOfStudents makes the private number of students value publicly-modifiable
    * @param number of students
    */
    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }
    /**
    * getNumberOfStudents makes the private number of students publicly-viewable
    * @return number of students
    */
    public int getNumberOfStudents() {
        return numberOfStudents;
    }
    /**
    * toString() replaces the default/basic value
    * @return a string describing the activity name 
    */
    public String toString() {
        return "\n\nActivity name: " + this.name
        + "\nLead: " + this.lead
        + "\nNumber of students: " + this.numberOfStudents;
    }
}
