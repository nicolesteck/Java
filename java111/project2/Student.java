/**
* @author Nicole Steck 
*
* The purpose of the Student class is to create the building blocks of each
* individual Student object -- to create a structure allowing the program
* to assign and view specific traits of each Student object
*/

public class Student {
    private String studentName;
    private int studentId = 99999;
    private int creditHours = 45;
    private int gradePoints = 100;
    
    /**
    * The setStudentName method makes the private instance variable publicly
    * modifiable
    */
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
    /**
    * The setStudentId method makes the private instance variable publicly
    * modifiable
    */
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    /**
    * The setCreditHours method makes the private instance variable publicly
    * modifiable
    */
    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }
    
    /**
    * The setGradePoints method makes the private instance variable publicly
    * modifiable
    */    
    public void setGradePoints(int gradePoints) {
        this.gradePoints = gradePoints;
    }
    
    /**
    * The getStudentName method makes the private instance variable publicly
    * viewable
    */    
    public String getStudentName() {
        return studentName;
    }
    
    /**
    * The getStudentId method makes the private instance variable publicly
    * viewable
    */        
    public int getStudentId() {
        return studentId;
    }
    
    /**
    * The getCreditHours method makes the private instance variable publicly
    * viewable
    */      
    public int getCreditHours() {
        return creditHours;
    }
    
    /**
    * The getGradePoints method makes the private instance variable publicly
    * viewable
    */          
    public int getGradePoints() {
        return gradePoints;
    }
    
    /**
    * The averageGradePoint method calculates the average GPA for that specific
    * Student object
    */ 
    public double averageGradePoint() {
        double averageGrade;
        
        averageGrade = (double)gradePoints / (double)creditHours;
        
        return averageGrade;
    }
    
    /**
    * The display method concatenates all the instance variables and 
    * calculated values into a single variable that can be returned
    * elsewhere in the program to easily show all relevant information
    * about a single Student object.
    */ 
    public String display() {
        String localDisplay = "Student name: " + studentName
                           + "\nStudent ID: " 
                           + studentId + "\nCredit hours: " + creditHours
                           + "\nGrade points: " + gradePoints
                           + "\nGPA: " + averageGradePoint();
        
        return localDisplay;
    }
}