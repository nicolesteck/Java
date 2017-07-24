/**
* MiddleSchoolStudent is a type of student, and the variables and methods
* within relate specifically to a student in the middle school
*/
public class MiddleSchoolStudent extends Student implements Badgeable {
    private boolean takenPSAT;
    /**
    * setTakenPSAT makes the private boolean regarding whether the PSAT has been
    * taken yet publicly-modifiable
    * @param whether the PSAT has been taken
    */
    public void setTakenPSAT(boolean takenPSAT) {
        this.takenPSAT = takenPSAT;
    }
    /**
    * getTakenPSAT makes the private boolean regarding whether the PSAT has been
    *  taken yet publicly-visible
    * @return whether the PSAT has been taken
    */
    public boolean getTakenPSAT() {
        return takenPSAT;
    }
    /**
    * displayProgressReport takes the individual pieces of data collected thus
    * far and puts them into a nicely-formatted concatenated string report.
    * @return the progress report
    *
    */
    public String displayProgressReport() {
        return "\nName: " + getName()
                + "\nID: " + getId()
                + "\nSchool: " + getSchoolName()
                + "\nGPA: " + gpa
                + "\nExtracurriculars: " + extracurricularActivities
                + "\nHomeroom Teacher: " + homeroomTeacher
                + "\nHas taken PSAT? " + takenPSAT;
    }
    /**
    * allowEntry determines where the student will be allowed, based on his or
    * her status as middle-schooler
    * @param location being entered
    * @return whether the student is allowed
    */
    public boolean allowEntry(String location) {
        if (location == "middleSchool") {
            return true;
        } else {
            return false;
        }
    }

}
