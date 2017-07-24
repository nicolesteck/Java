/**
*  @author Nicole Steck comments (Code by Cary Walker/Erik Knapp)
*/
package java111.project5;
/**
* The PizzaDriver class calls the other methods and controls the flow of the
* application.
*
* Compiled this with comp5 project5 *
* Ran this with run5 project5 PizzaDriver
*/
public class PizzaDriver {
    /**
    * The main class controls the flow of the overall application and kicks the
    * whole thing off.
    *  @param args array of console line arguments
    */
    public static void main(String[] args)
            throws Exception {

        SelectPizza  thisPizza  = new SelectPizza();
        thisPizza.processSelection();
    }
}
