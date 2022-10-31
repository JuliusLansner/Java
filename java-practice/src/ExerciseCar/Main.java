package ExerciseCar;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        car nissan = new car("Grey and Blue", "Nissan", 2002, "R34");
        car nissan2 = new car("Grey and Blue", "Nissan", 2002, "R34");
        System.out.println(nissan.getColor());
        System.out.println(nissan.getMake());
        System.out.println(nissan.getVersion());
        System.out.println(nissan.getYear());
        System.out.println(nissan.toString());



        ArrayList<car> cars = new ArrayList<>();
        cars.add(nissan);
        cars.add(nissan2);
        for(car car: cars);
        System.out.println(cars);



    }
}
