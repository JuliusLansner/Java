package MathClass;

public class Main {
    public  static void main (String[] args){
    double x = 3.14;
    double y = -10;
    //max and min method method
        double z =Math.max(x,y);
        double c = Math.min(x,y);
        System.out.println("Max: "+z+"\n"+"Min: "+c);
        //absolute method
        double a = Math.abs(y);
        System.out.println("Absolute value of -10: "+a);
        //square root
        double s = Math.sqrt(x);
        System.out.println("square root of x: "+s);
        //round to nearest up or down
        double r = Math.round(x);
        System.out.println("x rounded: "+r);
        //ceiling :round up
        double ci = Math.ceil(x);
        System.out.println("ceil of x: "+ci);
        //floor :round down
        double fl = Math.floor(x);
        System.out.println("ceil of x: "+fl);
    }
}
