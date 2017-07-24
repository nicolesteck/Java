/**
* The purpose of the ProcessStudents class is to create the Student objects,
* then display them. 
* 
* @author Nicole Steck
*/ 

public class ProcessStudents {
    Student[] studentsArray;
    
    /**
    * runStudentProcessing is the method in ProcessStudents that calls the
    * two more specific methods within one method. 
    */
    public void runStudentProcessing() {
        Student someStudent = new Student();
        createStudents();
        displayStudents();
    }
    
    /**
    * createStudents instantiates three Student objects, puts them in the
    * array for Student objects, and assigns values to them
    */ 
    public Student[] createStudents() {
        studentsArray = new Student[3];
        Student studentOne = new Student();
        Student studentTwo = new Student();
        Student studentThree = new Student();
        
        studentsArray[0] = studentOne;
        studentsArray[1] = studentTwo;
        studentsArray[2] = studentThree;
        
        studentOne.setStudentName("John Smith");
        
        studentTwo.setStudentName("Jane Doe");
        studentTwo.setStudentId(91988);
        studentTwo.setCreditHours(40);
        studentTwo.setGradePoints(90);
        
        studentThree.setStudentName("Joe Riggles");
        studentThree.setStudentId(93244);
        studentThree.setCreditHours(50);
        studentThree.setGradePoints(98);
        
        return studentsArray;
        
    }
    
    /**
    * displayStudents will iterate through the array and run the display
    * method (created in the Student class) for each object in the array
    */ 
    public void displayStudents() {
        int arrayLength = createStudents().length;      
        
        for (int loopIt = 0; loopIt < arrayLength; ++loopIt) {
            System.out.println(studentsArray[loopIt].display());
        }
    }
}