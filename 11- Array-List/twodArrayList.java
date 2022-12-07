import java.util.ArrayList;

public class twodArrayList {

    public static void main(String[] args) {
        
        //2D ArrayList = a dynamic list of lists
        // You can chgange the size of these lists during runtime

        ArrayList<ArrayList<String>> groceryList = new ArrayList<ArrayList<String>>();

        ArrayList<String> bakeryList = new ArrayList<String>();
        bakeryList.add("Pasta");
        bakeryList.add("Garlic Bread");
        bakeryList.add("Donuts");


        ArrayList<String> produceList = new ArrayList<String>();
        produceList.add("Tomatoes");
        produceList.add("Zucchini");
        produceList.add("Peppers");


        ArrayList<String> drinksList = new ArrayList<String>();
        drinksList.add("Soda");
        drinksList.add("Juice");
        drinksList.add("Coffee");


        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);



        System.out.println(bakeryList);
        System.out.println(groceryList.get(0).get(0));


    }

}
