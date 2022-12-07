import java.util.Random;

public class DiceRoller {
    
    /* First way of adding a value as it is stored locally
    
    DiceRoller() {
        Random random = new Random();
        int number = 0;
        roll(random, number);
    }

    void roll(Random random, int number) {
        number = random.nextInt(6) + 1;
        System.out.println(number);

    }

    */

    //Declaring the value outside of the method to make it global
    Random random;
    int number = 0;


    DiceRoller() {
        random = new Random();
        roll();
    }

    void roll() {
        number = random.nextInt(6)+1;
        System.out.println(number);

    }

}
