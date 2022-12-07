public class twodArrays {
    
    public static void main(String[] args) {
        
        //2d array = an array of arrays

        String[][] cars = new String[3][3];


        //ROW ONE
        cars[0][0] = "Camaro";
        cars[0][1] = "Corvette";
        cars[0][2] = "Silverado";

        //ROW TWO
        cars[1][0] = "Mustang";
        cars[1][1] = "Ranger";
        cars[1][2] = "F-150";

        //ROW THREE
        cars[2][0] = "Ferrari";
        cars[2][1] = "Lambo";
        cars[2][2] = "Tesla";


        //Creating a nested for loop
        for(int i = 0; i<cars.length; i++) {
            System.out.println();
            for(int j=0; j<cars[i].length; j++) {
                System.err.print(cars[i][j] + " ");
            }
        }



        /* Second way of achieving this
         * 
         * 		String[][] cars = 	{	

								{"Camaro","Corvette","Silverado"},

								{"Mustang","Ranger","F-150"},

								{"Ferrari","Lambo","Tesla"}

							};
         * 
         */



        


        
    }

}
