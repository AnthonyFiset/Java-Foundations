// Importing the scanner to use the Libary
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Creating a variable for the scanner to call it in
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");

        //Storing user input into a variable
        String name = scanner.nextLine();

        //Asking for age aka storing a variable as an integer from the user input

        System.out.println("How old are you? ");
        int age = scanner.nextInt();

        //Clear the scanner

        scanner.nextLine();

        //Calling out another string

        System.out.println("Where do you live? ");

        String location = scanner.nextLine();

        //calling out the variable which has the user input data stored in
        System.out.println("Hello " + name);
        System.out.println("You are " + age + " Years old");
        System.out.println("You live in: " + location);

    }
}