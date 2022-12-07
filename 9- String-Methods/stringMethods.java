/**
 * stringMethods
 */
public class stringMethods {

    public static void main(String[] args) {
        
        String name = "Bro";


        // The equals method is going to compare the string in the variable to the string that is enter into the method. Also going to store the result into a boolean.
        //equalsignoreCase will not be case sensitive
        boolean result = name.equals("Bro");

        char character = name.charAt(0);

        int index = name.indexOf("B");

        boolean empty = name.isEmpty();

        String upper = name.toUpperCase();

        String lower = name.toLowerCase();

        String replace = name.replace('o', 'a');


        //Length method
        int count = name.length();

        //Calling out the result
        System.out.println(result);
        System.out.println(count);
        System.out.println(character);
        System.out.println(index);
        System.out.println(empty);
        System.out.println(upper);
        System.out.println(lower);
        System.out.println(replace);



    }

}