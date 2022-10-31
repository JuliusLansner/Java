package WhileLoop;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String name = "";
// while loop keeps going until the condition "()" is false.
        //do loop is a variation of the while loop where it always performs the code of block atleast once.
    while(name.isBlank()){
        System.out.print("Enter your name: " );
        name =scanner.nextLine();

    }
        System.out.println("Hello: "+name);
    }
}
