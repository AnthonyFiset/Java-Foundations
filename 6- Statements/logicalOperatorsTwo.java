import java.util.Scanner;

public class logicalOperatorsTwo {
    
    public static void main(String[] args) {
        
        // || (or) either condition must be true
        // ! = (Not) use it to reverse this example, meaning ! would be used to not use the Q and it would show you are still playing game

        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing a game! Press q or Q to quit");
        String response = scanner.next();

        if(response.equals("q") || response.equals("Q")) {
            System.out.println("You quit the game");
        } else {
            System.out.println("You are still playing the game");
        }

        scanner.close();

    }

}
