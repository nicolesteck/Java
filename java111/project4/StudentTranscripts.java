import java.util.*;
/**
* StudentTranscripts pulls together a list of all the students' progress reports
* to create a single report of all transcripts.
*/
public class StudentTranscripts {
    ArrayList<Student> theStudents = new ArrayList<Student>();
    /**
    * addStudent takes an individual student and adds them to the arraylist
    * housing all of the students.
    * @param a student
    */
    public void addStudent(Student theStudent) {
        theStudents.add(theStudent);
    }
    /**
    * printTranscripts takes all of the individual students, iterates through,
    *  and displays the progress report of that specific student. 
    */
    public void printTranscripts() {
        System.out.println("\n\n\nStudent Transcripts:\n\n");
        for (Student someStudent : theStudents) {
            String progressReport = someStudent.displayProgressReport();
            System.out.println(progressReport);
        }
    }
}
