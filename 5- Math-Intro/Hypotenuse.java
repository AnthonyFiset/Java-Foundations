import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {

        //Creating the variables

        double x;
        double y;
        double z;

        //Creating the scanner for user input

        Scanner scanner = new Scanner(System.in);

        //Asking user to put in X

        System.out.println("Enter side x: ");
        x = scanner.nextDouble();

        //Asking user to put in Y

        System.out.println("Enter side y: ");
        y = scanner.nextDouble();

        //Formula to get the Hypotenuse of a triangle

        z = Math.sqrt((x*x)+(y*y));

        System.out.println("The hypotenuse is: " + z);

        //It's good to alwasy close your scanner once you are done

        scanner.close();

    }
}
