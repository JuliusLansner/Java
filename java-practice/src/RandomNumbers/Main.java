package RandomNumbers;
import java.util.Random;
public class Main {
    public static void main(String[] args){
    Random random = new Random();
    //random int gives a random number to the limit of int ,2b. Unless parameters are given, ofc.
    int x = random.nextInt(6)+1;
        //random double gives a random value between 0.000..-1.
    double y = random.nextDouble();
    boolean z = random.nextBoolean();
        System.out.println(z);
        System.out.println(y);
        System.out.println(x);
    }
}
