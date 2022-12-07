public class arrayTwo {
    
    public static void main(String[] args) {
        
        String[] cars = new String[3];

        cars[0] = "Camaro";
        cars[1] = "Corvette";
        cars[2] = "Tesla";


        //Using a for loop to call out all the contents in the variable
        for(int i = 0; i<cars.length; i++) {
            System.out.println(cars[i]);
        }

    }

}
