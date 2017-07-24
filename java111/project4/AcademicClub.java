/**
*  The AcademicClub class is a type of extracurricular activity, and holds
*  instance variables and data specific to an academic-type club.
*
*/
public class AcademicClub extends ExtraCurricularActivity {
    private boolean accrueCollegeCredits;

    /**
    *  setCollegeCreditAccrual is the setter to make the private
    *  data about whether the club accrues college credits publicly-modifiable
    *  @param whether the club accrues college credit
    */
    public void setCollegeCreditAccrual(boolean accrueCollegeCredits) {
        this.accrueCollegeCredits = accrueCollegeCredits;
    }

    /**
    *  getCollegeCreditAccrual is the setter to make the private
    *  data about whether the club accrues college credits publicly-visible
    *  @return whether the club accrues college credit
    */
    public boolean getCollegeCreditAccrual() {
        return accrueCollegeCredits;
    }
}
