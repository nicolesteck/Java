/**
* @author Nicole Steck (Cary Walker)
*
*/
package java111.project5;
import java.text.*;
import java.util.*;

/**
* PizzaChoice generates the sizes and according prices, then accepts the size
* chosen by the end user, returning what the price for that size is.
*/
public class PizzaChoice {
    private  char[] sizes = {'S', 'M', 'L', 'X'};
    private  double[] prices = {6.99, 8.99, 12.50, 15.00};
    private  NumberFormat formatter  = NumberFormat.getCurrencyInstance();
    private  int index;

    /**
    * The constructor PizzaChoice runs when an object of class PizzaChoice
    * is instantiated; it accepts an int (indicating which pizza the end user
    * wants).
    * @param choice the number assigned to the chosen pizza
    */
    public PizzaChoice(int choice) {
        index = choice;
    }

    /**
    *  getSize makes the private sizes instance variable publicly-visible
    * @return the size of the chosen pizza
    */
    public char getSize() {
        return sizes[index];
    }
    /**
    *  getPrice makes the private prices instance variable publicly-visible
    * @return the price of the chosen pizza
    */
    public double getPrice() {
        return prices[index];
    }
    /**
    *  toString() describes the object in string format.
    * @return a string stating the price as determined by this class
    */
    public String toString() {
        return "The price is " + formatter.format(prices[index]);
    }
}
