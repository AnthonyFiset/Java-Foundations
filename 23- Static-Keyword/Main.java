/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        //Static = modifier. A single copy of a variable/method is created and shared.
        //         The class "owns" the static member

        Friend friend1 = new Friend("Anthony");
        Friend friend2 = new Friend("Robert");
        Friend friend3 = new Friend("Scarlet");
        Friend friend4 = new Friend("Jason");

        Friend.displayFriends();

        System.out.println(Friend.numberOfFriends);

    }

}