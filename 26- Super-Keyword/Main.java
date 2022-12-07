/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        // Super = keyword refers to the superclass (parent) of an object
        //         Very similar to the "this" keyword

        Hero hero1 = new Hero("Batman", 42, "$$$");
        Hero hero2 = new Hero("Superman", 43, "everything");

        System.out.println(hero2.toString());
        System.out.println(hero1.toString());

        

    }

}