/**
*  HighSchoolStudent is a type of student, and the variables and methods relate
*  specifically to a student in high school.
*/
public class HighSchoolStudent extends Student implements Badgeable {
    private boolean hasVarsityLetter;
    /**
    * setHasVarsityLetter takes the private hasVarsityLetter boolean and
    * makes it publicly-modifiable
    *  @param varsity lettered status
    */
    public void setHasVarsityLetter(boolean hasVarsityLetter) {
        this.hasVarsityLetter = hasVarsityLetter;
    }
    /**
    * getHasVarsityLetter takes the private hasVarsityLetter boolean and
    * makes it publicly-viewable
    * @return varsity lettered status
    */
    public boolean getHasVarsityLetter() {
        return hasVarsityLetter;
    }
    /**
    * displayProgressReport takes all of the values gathered thus far and
    * concatenates them into a pretty,easy to read format (theoretically)
    * @return string of each high schooler's progress report.
    */
    public String displayProgressReport() {
        return "\nName: " + getName()
                + "\nID: " + getId()
                + "\nSchool: " + getSchoolName()
                + "\nGPA: " + gpa
                + "\nExtracurriculars: " + extracurricularActivities
                + "\nHomeroom Teacher: " + homeroomTeacher
                + "\nVarsity Lettered? " + hasVarsityLetter;
    }
    /**
    * allowEntry determines where a badged high schooler can get in
    * @param location being entered
    * @return whether it's allowed
    */
    public boolean allowEntry(String location) {
        if (location == "highSchool" || location =="footballField") {
            return true;
        } else {
            return false;
        }
    }

}
