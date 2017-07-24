/**
* Person is the most generic/general base class. It holds information
* that is applicable to all of the various sorts of humans referenced elsewhere
* in the application.
*/
public class Person {
    private String name;
    private int id;
    private String schoolName;
    /**
    * setName makes the private name variable publicly-modifiable
    * @param name of person
    */
    public void setName(String name) {
        this.name = name;
    }
    /**
    * getName makes the private name variable publicly-viewable
    *  @return name of the person
    */
    public String getName() {
        return name;
    }
    /**
    * setId makes the private ID variable publicly-modifiable
    * @param id
    */
    public void setId(int id) {
        this.id = id;
    }
    /**
    * getId makes the private ID variable publicly-viewable
    * @return id
    */
    public int getId() {
        return id;
    }
    /**
    * setSchoolName makes the private school name publicly-modifiable
    * @param school name
    */
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
    /**
    * getSchoolName makes the private school name publicly-visible
    * @return school name
    */
    public String getSchoolName() {
        return schoolName;
    }
}
