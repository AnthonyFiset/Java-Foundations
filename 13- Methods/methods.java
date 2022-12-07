/**
 * methods
 */
public class methods {

    public static void main(String[] args) {
        
        //Method = a block of code that is executed whenver it is called upon

        //Call method

        String name = "bro";
        int age = 21;


        //Adding an argument inside the parenthesis
        hello(name, age);

    }


    //Create method

        //Parameter inside the parenthesis

    static void hello(String name, int age) {
        System.out.println("HELLO " + name + " You Are: " + age + " YEars old"); 
    }

}