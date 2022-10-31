package Methods;

public class Main {
    public static void main(String[] args) {
        // method = a block of code that is executed whenever it is called upon
        // method with return type void (that returns nothing)
        String name = "Julius";
        int age = 21;
        hello(name,age);

        int x = 3;
        int y = 4;
        int z = add(x,y);
        System.out.println(z);
        //OR
        System.out.println(add(x,y));
    }
    static void hello(String name, int age){
        System.out.println("Hello "+name);
        System.out.println("you are "+age);
    }

    static int add(int x, int y){

       int z = x+y;
       return z;
        // OR
        //return x+y;
    }

}
