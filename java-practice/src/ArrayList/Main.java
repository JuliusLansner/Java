package ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // arraylist is a resizable array
        // elements can be added and removed after compilation  phase
        // store ONLY reference data types. Use wrapper class.
        //setting up an arraylist with String as the datatype
        ArrayList<String> food = new ArrayList<String>();
        //adding to the arraylist
        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");
        //print out the length/size of the arraylist
        System.out.println(food.size());
        // add a value at a specific index, use the .add with 2 parameters.
        food.add(1,"ketchup");

        //setting a specific value to a specific part of the array
        food.set(0,"sushi");
        // removes part of the array at the given index
        food.remove(2);
        //clearing arraylist, removes all values in an arraylist.
        food.clear();


        //creating a forloop to display array values
        // normally with arrays we'd use .length.
        // with arraylists we use .size()
        for(int i = 0; i<food.size(); i++){
            // to get an element out of the array, we use the get function.
            System.out.println(food.get(i));
        }
    }
}
