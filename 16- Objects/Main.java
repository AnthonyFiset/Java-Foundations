public class Main {
    
    public static void main(String[] args) {
        
        //Object = an instance of a class that may contain attributes and methods
        // example: (phone, desk, computer, coffee cup)

        //importing the object
        Cars myCar = new Cars();

        //Creating a second one from the class
        Cars myCar1 = new Cars();

        System.out.println(myCar1.make);

        //calling a method
        myCar.drive();

    }

}
