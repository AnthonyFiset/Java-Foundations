/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        //Constructor = special method that is called when an object is intantiated (created)

        Human anthony = new Human("Anthony", 21, 1.70);
        Human rick = new Human("Rick", 23, 1.87);

        System.out.println(anthony.name);
        System.out.println(rick.age);

        rick.eat();
        anthony.drink();

    }
    
}