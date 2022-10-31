package MathClass;

import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args){
        //Making a simple program that figures out the hypotenuse length by using math class methods.
        double x;
        double y;
        double z;

        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter side x: ");
        x = scanner.nextDouble();
        System.out.println("Enter side y: ");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x)+(y*y));

        System.out.println("Hyp is: " +z);
        scanner.close();


    }
}
