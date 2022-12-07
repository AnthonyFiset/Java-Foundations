import java.util.ArrayList;

/**
 * forEachLoop
 */
public class forEachLoop {

    public static void main(String[] args) {
        
        //for-each = traversing technique to iterate through the elements in an array/collection
        // It has less steps
        // It is less flexible

        String[] animals = {"Cat", "Dog", "Rat", "Bird", "Fish"};

        ArrayList<String> names = new ArrayList<String>();

        names.add("Anthony");
        names.add("Brian");
        names.add("Cindy");
        names.add("Michael");

        for(String i : animals) {
            System.out.println(i);
        }

        for(String i : names) {
            System.out.println(i);
        }

    }

}