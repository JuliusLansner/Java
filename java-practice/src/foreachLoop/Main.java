package foreachLoop;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
    // for each loop(enhanced for loop)= traversing technique to iterate through the  elements in an array/collection
        // benefits: fewer steps, more readable
        // negatives: less flexible

        //String[] animals = {"cat", "dog", "rat", "bird"};


        ArrayList<String> animals = new ArrayList<String>();
        animals.add("Cat");
        animals.add("dog");
        animals.add("rat");
        animals.add("bird");


        //using for-each loop to go through the array / arraylist
        for(String i : animals){
            System.out.println(i);
        }
    }
}
