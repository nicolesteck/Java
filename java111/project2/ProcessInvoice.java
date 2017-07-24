/**
* This class will create then set values for the objects in the invoiceItem
* array, then set a run function that does the actual processing
*/ 
public class ProcessInvoice {
    private Invoice someInvoice;
    
    /**
    * This method creates an array of invoice items and then sets values
    * for them
    */
    public void createInvoiceItems() {
        InvoiceItem[] localInvoiceArray = new InvoiceItem[3];
        
        InvoiceItem firstInvoice = new InvoiceItem();
        InvoiceItem secondInvoice = new InvoiceItem();
        InvoiceItem thirdInvoice = new InvoiceItem();
        
        localInvoiceArray[0] = firstInvoice;
        localInvoiceArray[1] = secondInvoice;
        localInvoiceArray[2] = thirdInvoice;
        
        localInvoiceArray[0].setItemId(25);
        firstInvoice.setItemQuantity(5);
        firstInvoice.setItemPrice(2.99);
        firstInvoice.setItemDescription("Dog treat");
       
        secondInvoice.setItemId(25);
        secondInvoice.setItemQuantity(3);
        secondInvoice.setItemPrice(13.99);
        secondInvoice.setItemDescription("E-Z Glue"); 
        
        thirdInvoice.setItemId(20);
        thirdInvoice.setItemQuantity(10);
        thirdInvoice.setItemPrice(10.49);
        thirdInvoice.setItemDescription("Cat Food");
        
        someInvoice.setArray(localInvoiceArray);
    }
    
    /**
    * The runProcess method instantiates the invoice, calculates its totals, 
    * and then calls the display method to output it. 
    */
    
    public void runProcess() {
        someInvoice = new Invoice();
        //System.out.println("Created new invoice");
        createInvoiceItems();
        someInvoice.calculateInvoice();
        //System.out.println("Calculated invoice");
        someInvoice.displayInvoice();
    }
}