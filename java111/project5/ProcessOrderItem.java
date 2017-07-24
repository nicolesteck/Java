package java111.project5;
import java.text.DecimalFormat;

/**
* @author Nicole Steck
* the ProcessOrderItem class will take a single item and gather/calculate
* information about it.
*/
public class ProcessOrderItem {
    private String customerName;
    private int customerNumber;
    private String productName;
    private int quantityOrdered;
    private double unitPrice;
    private double totalPrice = 0;
    DecimalFormat df = new DecimalFormat("#.00");

    /**
    * The Constructor will accept / require all parameters to be passed in
    * in order to create the object using this Constructor.
    * @param customerName name of the customer
    * @param customerNumber customer ID number
    * @param productName name of the product
    * @param quantityOrdered quantity of product ordered
    * @param unitPrice price per item
    *
    */
    public ProcessOrderItem(String customerName, int customerNumber,
            String productName, int quantityOrdered, double unitPrice) {
        this.customerName = customerName;
        this.customerNumber = customerNumber;
        this.productName = productName;
        this.quantityOrdered = quantityOrdered;
        this.unitPrice = unitPrice;
    }
    /**
    * calculatePrice takes the quantity and per item price and calculates the
    * total price.
    *  @return the total price
    */
    public double calculatePrice() {
        totalPrice = quantityOrdered * unitPrice;
        return totalPrice;

    }
    /**
    * toString returns information contained within the object -- that is,
    * attributes of the object -- in String format.
    * @return information about the item and customer ordering it
    */
    public String toString() {
        return "\n\n\n---------------------------------"
                + "\nOrder:"
                + "\nCustomer ID: " + customerNumber
                + "\nName: " + customerName
                + "\nItem: " + productName
                + "\nQuantity: " + quantityOrdered
                + "\nUnit price: $" + df.format(unitPrice)
                + "\nTotal order cost: $" + df.format(calculatePrice());
    }
}
