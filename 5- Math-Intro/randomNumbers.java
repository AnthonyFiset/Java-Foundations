import java.util.Random;

public class randomNumbers {
    public static void main(String[] args) {
        
        //creating a random variable to call it out
        Random random = new Random();  


        //adding random numbers
        int x = random.nextInt();

        //You can set a limit | it will go to 8 because java always starts with zero
        int y = random.nextInt(9);

        // you can randomize booleans as well and doubles as well.

        System.out.println(x);
        System.out.println("this is Y: " + y);

    }
}
