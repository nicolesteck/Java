/**
*
*   The CustomerDatabase class will instantiate the Customer objects and then
*   store them in an arraylist. 
*
*
*  @author Nicole Steck
*
*
*/ 

import java.util.*;

public class CustomerDatabase {
    private InputHelper input;
    private ArrayList<Customer> customers = new ArrayList<Customer>();
    private int customerInvoiceTotal;
    private int customerLawnSquareFootage;
    private int summerInvoiceTotal;
    private int summerSquareFootage;
    private int feeAssessed = 0;
    
    public void processCustomer() {
       // customers = new ArrayList<Customer>();
        input = new InputHelper();
        
        String name = "";
        String lawnLengthString = "";
        String lawnWidthString = "";
        String numberOfPaymentsString = "";
        int lawnWidth = 0;
        int lawnLength = 0;
        int numberOfPayments = 0;
        Customer newCustomer = null;
        String more = "";
        
        while (true) {
            name = input.getUserInput("Customer Name? ");
            lawnLengthString = input.getUserInput("Yard Length? ");
            lawnLength = Integer.parseInt(lawnLengthString);
            lawnWidthString = input.getUserInput("Yard Width? ");
            lawnWidth = Integer.parseInt(lawnWidthString);
            numberOfPaymentsString = input.getUserInput("Number of Payments? ");
            numberOfPayments = Integer.parseInt(numberOfPaymentsString);
            
            
               
            newCustomer = new Customer();
            newCustomer.setName(name);
            newCustomer.setLawnLength(lawnLength);
            newCustomer.setLawnWidth(lawnWidth);
            newCustomer.setNumberOfPayments(numberOfPayments);
            customers.add(newCustomer);
            more = input.getUserInput("Are there more customers?");
            System.out.println("<-------------------<");
            if (!more.equals("y")) {
                    break;
            }
     
        } 
    }
    
    /**
    *  The callCustomer class will iterate through the arraylist 
    *  and display each customer 
    *   
    */
    
    public void callCustomer() {
        Customer customer = null;
        int customerIt = 0;
        while (customerIt < customers.size()) {
            customer = (Customer)customers.get(customerIt);
            System.out.println(customer.display((customer.calculateWeeklyPayment((customer.getLawnLength() 
                    * customer.getLawnWidth()) * customer.getNumberOfPayments())))); 
            System.out.println();
            ++customerIt;
        }
    }
    
    /**
    *  The displaySeasonReport() iterates through the arraylist, adding all of
    *  the cost and square footage totals to a running total 
    *
    */
    public int[] calculateSeasonReport() {
        int[] theResults = null;
       
        int customerIt = 0;
     //  System.out.println("customers " + customers.size());
        while (customerIt < customers.size()) {
            System.out.println(customers.get(customerIt).getName());
            int customerSquareFootage = customers.get(customerIt).calculateLawnSize();
            int numberOfPayments = customers.get(customerIt).getNumberOfPayments();
          // System.out.println("sq. ft. " + customerSquareFootage);
            int customerInvoiceTotal = 
                    ((customers.get(customerIt).calculateWeeklyPayment(customerSquareFootage) * 20) + customers.get(customerIt).calculatePaymentAmount());
            theResults = new int[2];
            theResults[0] += customerInvoiceTotal;
            theResults[1] += customerSquareFootage;
         // System.out.println("Customer it: " + customerIt);
            ++customerIt;
           
        }
        
       /* for (Customer customer : customers) {
          //  System.out.println(customer.getName());
            int customerSquareFootage = customer.calculateLawnSize();
           // System.out.println("Square footage: " + customerSquareFootage);
            int customerInvoiceTotal = 
                    ((customer.calculateWeeklyPayment(customerSquareFootage) * 20) + customer.calculatePaymentAmount(customer.calculateWeeklyPayment(customerSquareFootage), customer.getNumberOfPayments()));
           // summerInvoiceTotal += customerInvoiceTotal;
           // summerSquareFootage += customerLawnSquareFootage;
            theResults = new int[2];
            theResults[0] += customerInvoiceTotal;
            theResults[1] += customerSquareFootage;
            return theResults;
        } */
       // System.out.println("At the bottom of calculateSeasonReport()");
        
        return theResults;
    }
    
    public void displaySeasonReport() {
        System.out.println("Number of clients: " + customers.size());
        int[] theResults = calculateSeasonReport();
        System.out.println("Total Square Feet of Mowing: " + theResults[1]);
        System.out.println("Total Revenue for the Summer: " + theResults[0]);
        
    }  
    
    public void run() {
        processCustomer();
        callCustomer();
        //calculateSeasonReport();
        displaySeasonReport();
    }
}