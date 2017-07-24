/**
* ElementarySchoolStudent is a type of student, and for each student it is
* important to know whether that student is literate, as well as his or her
* overall progress report.
*/
public class ElementarySchoolStudent extends Student {
    private boolean isLiterate;
    /**
    * setIsLiterate makes the private isLiterate boolean publicly-modifiable
    * @param whether the student is literate
    */
    public void setIsLiterate(boolean isLiterate) {
        this.isLiterate = isLiterate;
    }
    /**
    * getIsLiterate makes the private isLiterate boolean publicly-viewable
    * @return whether the student is literate
    */
    public boolean getIsLiterate() {
        return isLiterate;
    }
    /**
    * displayProgressReport will take all of the data collected so far and
    * concatenate them into one pretty report.
    * @return a report of this kid's progress 
    */
    public String displayProgressReport() {
        return "\nName: " + getName()
                + "\nID: " + getId()
                + "\nSchool: " + getSchoolName()
                + "\nGPA: " + gpa
                + "\nExtracurriculars: " + extracurricularActivities
                + "\nHomeroom Teacher: " + homeroomTeacher
                + "\nReading at an age appropriate level? " + isLiterate;
    }

}
