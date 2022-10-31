package overloadedMethods;

public class Main {
    public static void main(String[] args) {
        //overloaded methods = methods that share the same name but have different parameters
        //                                  method name + parameters = method signature
        int x = add(3,3,22,3);
        System.out.println(x);
    }
    static int add(int a, int b){
        System.out.println("this is overloaded method nr1");
        return a+b;
    }
    static int add(int a, int b,int c){
        System.out.println("this is overloaded method nr2");
        return a+b+c;
    }
    static int add(int a, int b,int c,int d){
        System.out.println("this is overloaded method nr3");
        return a+b+c+d;
    }

}
