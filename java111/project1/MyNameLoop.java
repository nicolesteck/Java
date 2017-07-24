/**
*  This class will assign the instance variables that will be used in 
*   the test drive class. 
*/ 

public class MyNameLoop {
    private String fullName = "Nicole Steck";
    private int loopAmount;
    private int loopCounter;
   
    /**
    *  This method will repeat the fullName defined above for a set 
    *  interval, in this case until the loop counter has reached the
    *  predetermined amount of 10. 
    */ 
    public void repeatAfterMe() {
        loopAmount = 10;
        while (loopAmount > 0) {
            System.out.println(fullName);
            loopAmount--;
        }
    }
}
