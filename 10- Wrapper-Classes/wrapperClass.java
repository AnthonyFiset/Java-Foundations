/**
 * wrapperClass
 */
public class wrapperClass {

    public static void main(String[] args) {
        
        /* Wrapper Class = provides a way to use primitive data types as reference data types
         * 
         * Reference data types contain useful methods
         * 
         * Can be used with collections (Ex. Arraylist)
         * 
         * //Primitive      //Wrapper
         * 
         * //boolean        //Boolean
         * //char           //Character
         * //int            //Integer
         * //double         //Double
         * 
         * autoboxing = the automatic conversion that the java compiler makes between the primitive types and their corresponding object wrapper classes
         * unboxing = the reverse of autoboxing. automatic conversion of wrapper class to primitive
         */


         /* Autoboxing */
         
         //Boolean

         Boolean a = true;

         //Character
         Character b = '@';

         //Integer
         Integer c = 123;

         //Double

         Double d = 3.14;

         //String

         String e = "Bro";

         /* Unboxing */

         if(a==true) {
            System.out.println("This is true");
         }

         

    }    

}