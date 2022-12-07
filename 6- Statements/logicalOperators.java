/**
 * logicalOperators
 */
public class logicalOperators {

    public static void main(String[] args) {
        
        /* 
            logical operators = used to connect two or more expressions

                    %% = (and) both conditions must be true
                    || = (or) either condition must be true
                    ! = (not) reverses boolean value of condition

        */

        int temp = 25;

        if(temp>30) {
            System.out.println("It is hot outside!");
        } else if(temp>=20 && temp<=30) {
            System.out.println("It is warm outside");
        } else {
            System.out.println("It is cold outside");
        }

    }

}