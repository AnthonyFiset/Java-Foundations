import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        // Exception = an event that occurs during the execution of a program that, disrupts the normal flow of instructions

        // By catching the error with try & catch we are stopping the interruption of the program

        
        Scanner scanner = new Scanner(System.in);

    try {

        System.out.println("Enter a whole number to divide: ");
        int x = scanner.nextInt();

        System.out.println("Enter a whole number to divide by: ");
        int y = scanner.nextInt();

        int z = x / y;

        System.out.println("Result: " + z);

    } catch(ArithmeticException e) {
        System.out.println("You can't divide by 0 idiot!");
    } catch(InputMismatchException e) {
        System.out.println("PLEASE ENTER A NUMBER FOR CRYING OUT LOUT!");
    } catch(Exception e) {
        System.out.println("Something went wrong");
    } finally {
        System.out.println("This will always print");
        scanner.close();
    }


    }


}