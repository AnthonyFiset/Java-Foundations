/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        //  Method Overriding = Declaring a method in sub classk,
        //                      which is alrady present in parent class
        //                      Done so that a child class can give its own implementation.

        Animal animal = new Animal();
        Dog dog = new Dog();

        dog.speak();
        animal.speak();

    }

}