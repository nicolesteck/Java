package java111.project5;
import java.util.*;
/**
* The Project5TestDrive class will run the main method, and will also define
* a number of other methods, called by the main method, that will run this
* program.
* @author Nicole Steck
*/
public class Project5TestDrive {

    private static ArrayList<Object> theOrders = new ArrayList<Object>();
    /**
    * The main method here calls the run method, created below, that gets the
    * ball rolling on the whole program.
    * @param args array of console line arguments
    */
    public static void main(String[] args) {

        run();

    }
    /**
    * The run method calls the two methods that, together, create the
    * orders and then display them.
    */
    public static void run() {
        create();
        display();
    }
    /**
    * The create method instantiates a number of objects of types
    * being orders requiring shipping and handling and those that don't;
    * the method then adds them to the theOrders ArrayList.
    */
    public static void create() {
        ProcessOrderItem dogToys = new ProcessOrderShipping("John Smith",
                01, "Dog toy", 7, 2.99, 20);
        theOrders.add(dogToys);

        ProcessOrderItem catToys = new ProcessOrderItem("Lindsay Smith",
                02, "Cat toy", 13, 4.49);
        theOrders.add(catToys);

        ProcessOrderItem oldDogToys = new ProcessOrderShipping("Millie theDog",
                03, "Old dog toy", 2, 9.25, 75.5);
        theOrders.add(oldDogToys);

        ProcessOrderItem oldCatToys = new ProcessOrderItem("Julie Douglass",
                04, "Old cat toy", 3, 1.15);
        theOrders.add(oldCatToys);

        ProcessOrderItem ferretToys = new ProcessOrderItem("Maisie McDougall",
                05, "Ferret toy", 5, 97.25);
        theOrders.add(ferretToys);

        ProcessOrderItem oldFerretToys = new ProcessOrderShipping("Joseph Mohr",
                06, "Old ferret toy", 1, 94.33, 40);
        theOrders.add(oldFerretToys);

    }
    /**
    * The display method iterates through the ArrayList created in the create
    * method and displays them to the screen.
    */
    public static void display() {
        for (Object theOrder : theOrders) {
            System.out.println(theOrder.toString());
        }
    }
}
