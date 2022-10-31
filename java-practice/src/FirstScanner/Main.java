package FirstScanner;
// imports the ability to have user input
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        // sets up the variable "scanner" for use as system input.
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name");
        // we make a string with the input, scanner.nextLine() goes o the next line
        String name = scanner.nextLine();
        System.out.println("how old are you ?");
        //due to java strangeness, after nextInt(), it's gonna skip the next scan if the next scan is a nextLine(),
        //so we use an empty scanner.nextLine(); to prevent our scanner line "in use" to be skipped.
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What's your favourite food?");
        String food = scanner.nextLine();


        System.out.println("hello "+name);
        System.out.println("you are "+ age+" years old");
        System.out.println("You like "+food);
    }
}
