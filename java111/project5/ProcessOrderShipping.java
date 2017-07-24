package java111.project5;
import java.text.DecimalFormat;

/**
* ProcessOrderShipping deals only with orders for which there will be a
* handling charge assessed. ProcessOrderShipping accepts information from the
* superclass and uses it to determine the handling charge, then adds that
* charge to the overall bill total.
*
*/
public class ProcessOrderShipping extends ProcessOrderItem {

    double weight;
    double handlingCharge;
    double finalTotalCost;
    DecimalFormat df = new DecimalFormat("#.00");
    //Number Format nf = new NumberFormat();
    /**
    * The Constructor takes all of the information in from the super class,
    * adds additional required information, and synthesizes it to determine
    * the handling charge.
    * @param customerName name of the customer
    * @param customerNumber customer ID number
    * @param productName name of the product being purchased
    * @param quantityOrdered quantity of the product being purchased
    * @param unitPrice price per item
    * @param weight weight per item
    *
    */
    public ProcessOrderShipping(String customerName, int customerNumber,
            String productName, int quantityOrdered, double unitPrice,
            double weight) {
        super(customerName, customerNumber, productName, quantityOrdered, unitPrice);

    /*    switch (weight) {
            case 1: weight < 25;
                handlingCharge = 4;
            case 2: weight >= 25 && weight < 45;
                handlingCharge = 5;
            case 3: weight >= 45 && weight < 75;
                handlingCharge = 6;
        }
    */

        if (weight < 25) {
            handlingCharge = 4.00;
        } else if (weight >= 25 && weight < 45) {
            handlingCharge = 5.00;
        } else if (weight >= 45 && weight <= 75) {
            handlingCharge = 6.00;
        } else if (weight > 75) {
            handlingCharge = 7.00;
        }

        double totalCost = super.calculatePrice();
        finalTotalCost = totalCost + handlingCharge;
    }
    /**
    * This method calls the superclass's String of data to be outputted and
    * adds to it the data that the subclass will add -- namely, the amount of
    * the handling charge and how that impacts the overall cost.
    * @return a string describing the order, including which item and customer
    */
    public String toString() {
        return super.toString()
                + "\nPlus a handling charge of $" + df.format(handlingCharge)
                + "\nTotal with S&H: $" + df.format(finalTotalCost);
    }
}
