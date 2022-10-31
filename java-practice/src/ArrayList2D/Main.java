package ArrayList2D;
import java.sql.Array;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 2D arrayList  is a dynamic list of lists
        // you can change the size of these lists during runtime

        //making a 2D arraylist, based off of the arraylists further down
        ArrayList<ArrayList<String>> groceryList = new ArrayList();


        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        ArrayList<String> produceList = new ArrayList();
        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("peppers");

        ArrayList<String> drinksList = new ArrayList();
        drinksList.add("soda");
        drinksList.add("coffee");


        //adding the arraylists to the 2D array
        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);
        //printing out the 2d arraylist
        System.out.println(groceryList);
        //getting the first element of the 2D arraylist, which is the first arraylist.
        System.out.println(groceryList.get(0));
        //getting a specific index in a specific arraylist, within the 2D arraylist.
        System.out.println(groceryList.get(0).get(0));

        System.out.println(bakeryList);
        //getting a specific index
        System.out.println(bakeryList.get(0));
    }
}
