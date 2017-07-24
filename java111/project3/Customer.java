/**
*   The Customer class holds information about each individual
*  customer and calculates the costs and fee schedule for that customer.
*
*  @author Nicole Steck
*/

public class Customer {
    private String name;
    private int lawnLength;
    private int lawnWidth;
    private int lawnSquareFootage;
    private int numberOfPayments;
    private int paymentFee;
    private int costPerWeek;
    private int costPerPayment;
    private int totalCost;

    /**
    * This method makes the private name variable publicly-modifiable
    */
    public void setName(String name) {
        this.name = name;
    }

    /**
    * This method makes the private name variable publicly-viewable
    */
    public String getName() {
        return name;
    }

    /**
    * This method makes the private lawnLength variable publicly-modifiable
    */
    public void setLawnLength(int lawnLength) {
        this.lawnLength = lawnLength;
    }

    /**
    * This method makes the private lawnLength variable publicly-viewable
    */
    public int getLawnLength() {
        return lawnLength;
    }

    /**
    * This method makes the private lawnWidth variable publicly-modifiable
    */
    public void setLawnWidth(int lawnWidth) {
        this.lawnWidth = lawnWidth;
    }

    /**
    * This method makes the private lawnWidth variable publicly-viewable
    */
    public int getLawnWidth() {
        return lawnWidth;
    }

    /**
    * This method makes the private numberOfPayments variable publicly-modifiable
    */
    public void setNumberOfPayments(int numberOfPayments) {
        this.numberOfPayments = numberOfPayments;
    }

    /**
    * This method makes the private numberOfPayments variable publicly-viewable
    * @return
    */
    public int getNumberOfPayments() {
        return numberOfPayments;
    }

    /**
    *  calculateLawnSize looks at the provided lawn length and width
    *  and calculates the square footage of the lawn
    */
    public int calculateLawnSize() {
        lawnSquareFootage = lawnLength * lawnWidth;
        return lawnSquareFootage;
    }

    /**
    *  calculateWeeklyPayment looks at the size of the lawn and figures out
    *  the per-week charge.
    *  @param lawn square footage
    *  @return weekly payment amount 
    */ 
    public int calculateWeeklyPayment(int lawnSquareFootage) {
        int LARGE_LAWN = 600;
        int SMALL_LAWN = 400;
        
        if (lawnSquareFootage < SMALL_LAWN) {
            costPerWeek = 25;
        }
        else if ((lawnSquareFootage > SMALL_LAWN) 
                 && (lawnSquareFootage < LARGE_LAWN)) {
            costPerWeek = 35;         
        }
        
        else if (lawnSquareFootage > LARGE_LAWN) {
            costPerWeek = 50;
        }
        
        System.out.println("Name: " + name + "; Square footage " + lawnSquareFootage + "; cost: " + costPerWeek);
        return costPerWeek;
    }
    
    /**
    *    calculatePaymentAmount() considers the lawn size and payment schedule,
    *    and determines the total amount this customer will pay for one summer's
    *    lawn care.
    *     @param weekly payment
    *     @return total cost
    */
    public int calculatePaymentAmount() {
       // System.out.println("number of payments: " + numberOfPayments);
        if (numberOfPayments == 2) {
            paymentFee = 5;
            System.out.println("Payment fee: $5 per payment.");
        } else if (numberOfPayments == 20) {
            paymentFee = 3;
            System.out.println("Payment fee: $3 per payment.");
        } else if (numberOfPayments == 1) {
            paymentFee = 0;
            System.out.println("No payment fee assessed.");
        } else {
            
            System.out.println("ERROR: You must fully satisfy your bill in "
                               + " either 1, 2, or 20 payments.");
        }
        
        costPerWeek = calculateWeeklyPayment(lawnSquareFootage);
        
        costPerPayment = paymentFee + ((costPerWeek * 20) / numberOfPayments);
        
        // if cost = 35 per week;
        // 20 weeks;
        // payment twice so $5 charge per payment, each payment for $35 * 10
        // 35 * 20 = 700
        // payment twice, so 350 apiece plus 5, so 355. or 710. 
        return costPerPayment;
       
    }
    
    public String display(int paymentAmount) {
       // paymentAmount = calculatePaymentAmount();
        totalCost = paymentAmount * numberOfPayments;
        return " >> Name: " + getName()
                + "\n >> Lawn size: " + (getLawnLength() * getLawnWidth())
                + "\n >> Number of payments: " + numberOfPayments
                + "\n >> Amount of each payment: $" + totalCost
                + "\n >>------------------->>";
        }
        
} 
