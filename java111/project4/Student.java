/**
* The Student class describes a type of person -- a type of person who has
* grades and a GPA, maybe takes part in extracurrics, and has a homeroom Teacher.
*
*/
public abstract class Student extends Person {
    protected String gpa;
    protected String extracurricularActivities;
    protected String homeroomTeacher;
    /**
    * setGpa makes the private GPA publicly-modifiable
    * @param GPA
    */
    public void setGpa(String gpa) {
        this.gpa = gpa;
    }
    /**
    * getGpa makes the private GPA publicly-viewable
    * @return GPA
    */
    public String getGpa() {
        return gpa;
    }
    /**
    * setExtracurricularActivities makes the private extracurrics publicly-modifiable
    * @param extracurriculars
    *
    */
    public void setExtracurricularActivities(String extracurricularActivities) {
        this.extracurricularActivities = extracurricularActivities;
    }
    /**
    * getExtracurricularActivities makes the private extracurrics publicly-viewable
    * @return extracurriculars
    */
    public String getExtracurricularActivities() {
        return extracurricularActivities;
    }
    /**
    * setHomeroomTeacher makes the private homeroom teacher publicly-modifiable
    * @param teacher
    */
    public void setHomeroomTeacher(String homeroomTeacher) {
        this.homeroomTeacher = homeroomTeacher;
    }
    /**
    * getHomeRoomTeacher makes the private homeroom teacher publicly-viewable
    * @return teacher
    */
    public String getHomeRoomTeacher() {
        return homeroomTeacher;
    }
    /**
    * This abstract string will display a progress report customized to each type
    * of student. 
    */
    public abstract String displayProgressReport();



}
