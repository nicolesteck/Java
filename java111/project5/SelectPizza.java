package java111.project5;
/**
* The SelectPizza class asks the user what size of pizza they would like,
* relays it to the PizzaChoice object through its constructor, and returns
* the cost of that choice.
* @author Nicole Steck (Cary Walker)
*/
public class SelectPizza {
    /**
    * processSelection is the method that actually completes this class'
    * functionality; it prompts the user for a size of pizza, relays that
    * to the PizzaChoice object and outputs a message letting the user know
    * what the final cost of the pizza will be. 
    */
    public void processSelection()
        throws Exception {
        char selection;
        String choice = "";
        int index = 0;

        System.out.print("Select a pizza size "
                 + "(Type 1 for S, 2 for M, 3 for L, 4 for X): ");

        selection = (char) System.in.read();
        choice = choice + selection;
        index = Integer.parseInt(choice) - 1;

        PizzaChoice thisChoice  = new PizzaChoice(index);

        System.out.println(thisChoice);
    }

}
