import java.util.ArrayList;

/**
 * arrayList
 */
public class arrayList {

    public static void main(String[] args) {
        
        /* Arraylist = a resizable array
         * 
         * Elements can be added and removed after compilation phase
         * 
         * Store reference data types
         * 
         */

        //Creating the Array List
         ArrayList<String> food = new ArrayList<String>();


         //Creating a function to add to the list
        food.add("Pizza");
        food.add("Hamburger");
        food.add("hotdog");

        //Set method = set a value at a index

        food.set(0, "Sushi");

        //Remove value at a index

        food.remove(2);

        //clear array list
        food.clear();

        //Calling out the arraylist
        for(int i = 0; i<food.size(); i++) {
            System.out.println(food.get(i));
        }


    }

}