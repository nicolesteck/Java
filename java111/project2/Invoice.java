/**
* @author Nicole Steck
* This class creates each individual invoice, which is made up of invoiceItems
* and then uses each item cost & quantity to determine the total invoice cost
*/

public class Invoice {
    private InvoiceItem[] invoiceItemsArray;
    private double invoiceTotal;
    
    /**
    * This is the getter to make the private invoiceTotal value fetchable
    * from outside the class.
    */
    public double getInvoiceTotal() {
        return invoiceTotal;
    }
    
    /**
    * This is the setter that makes the invoiceItemsArray publicly modifiable
    * outside of this class
    */
    public void setArray(InvoiceItem[] invoiceItemsArray) {
        this.invoiceItemsArray = invoiceItemsArray;
    }
    
    /**
    * This method does the math on the invoice items and determines the 
    * total cost of the invoice. 
    */
    public double calculateInvoice() {
        invoiceTotal = 0;
        
        for (int loopIt = 0; loopIt < invoiceItemsArray.length; ++loopIt) {
            InvoiceItem someInvoiceItem =  invoiceItemsArray[loopIt];
            double currentTotal = someInvoiceItem.calculateItemTotal(); 
            invoiceTotal += currentTotal;
        }  
        
        return invoiceTotal;
    } 
    
    /**
    * This method outputs the invoice items and the total invoice cost
    */
    public void displayInvoice() {
        int arrayLength = invoiceItemsArray.length;
        
        for (int loopIt = 0; loopIt < arrayLength; ++loopIt) {
            System.out.println(invoiceItemsArray[loopIt].display());
        }
        
        System.out.println("Invoice total: $" + calculateInvoice());
    }
    
}