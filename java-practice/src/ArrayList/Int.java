package ArrayList;

import java.util.ArrayList;

public class Int {
    public static void main(String[] args) {
        ArrayList<Integer> numb = new ArrayList<>();
      numb.add(1);
      numb.add(2);
      numb.add(3);
      numb.add(4);
      numb.add(5);
        System.out.println(numb.size());
        for(int i = 0; i<numb.size(); i++){
            System.out.println(numb.get(i));
        }


    }
}
