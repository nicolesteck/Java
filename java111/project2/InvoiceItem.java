/**
* @author Nicole Steck
* The purpose of the InvoiceItem class is to create private instance variables
* describing an Item object, with public getters and setters to make those
* variables modifiable and viewable outside the class.
*/

public class InvoiceItem {
    private int itemId;
    private int itemQuantity;
    private double itemPrice;
    private String itemDescription;
    
    /**
    * The purpose of setItemId is to make the private instance variable
    * publicly modifiable
    */
    public void setItemId(int itemId) {
        this.itemId = itemId;
    }
    
    /**
    * The purpose of setItemQuantity is to make the private instance
    * variable publicly modifiable
    */    
    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }
    
    /**
    * The purpose of setItemPrice is to make the private instance
    * variable publicly modifiable
    */        
    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    /**
    * The purpose of setItemDescription is to make the private instance
    * variable publicly modifiable
    */        
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }
    
    /**
    * The purpose of getItemId is to make the private instance
    * variable publicly viewable
    */         
    public int getItemId() {
        return itemId;
    }
    
    /**
    * The purpose of getItemQuantity is to make the private instance
    * variable publicly viewable
    */       
    public int getItemQuantity() {
        return itemQuantity;
    }
    
    /**
    * The purpose of getItemPrice is to make the private instance
    * variable publicly viewable
    */      
    public double getItemPrice() {
        return itemPrice;
    }
    
    /**
    * The purpose of getItemDescription is to make the private instance
    * variable publicly viewable
    */      
    public String getItemDescription() {
        return itemDescription;
    }
    
    /**
    * The purpose of calculateItemTotal is to determine what 
    * the total cost for one specific type of item is, i.e. its subtotal
    */
    public double calculateItemTotal() {
        double itemTotal = 0;
        
        itemTotal = (double)itemQuantity * (double)itemPrice;
        
        return itemTotal;
    }
    
    /**
    * The display method will concatenate the instance variables to 
    * create a publicly available string that can be called by other classes
    */ 
    public String display() {
        String theDisplay = "Description: " + itemDescription + ";\tID: " + itemId
                + ";\tPrice: $" + itemPrice + ";\tQuantity: " + itemQuantity 
                + ";\ttotal cost: $" 
                + calculateItemTotal();
        return theDisplay;
    }
}