package Arrays;

public class Main {
    public static void main(String[] args){
        // arrays is used to store multiple values in a single variable
        String[] cars1 = {"Camarox","Corvettex", "Teslax"};
        cars1[0]= "Fiatx";

        String[] cars = new String[3];
        cars[0]= "Camaro";
        cars[1]= "Corvette";
        cars[2]= "tesla";
        System.out.println(cars[0]);
        System.out.println(cars1[0]);
        for(int i = 0; i<cars.length; i++){
            System.out.println(cars[i]);
        }
    }
}
