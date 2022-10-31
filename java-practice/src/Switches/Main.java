package Switches;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        //switch is a statement that allows a variable to be tested for equality against a list of values
        //Might be more efficient to use a switch if you're using a lot of if/else statements.
        // list of days of the week
        Scanner scanner = new Scanner(System.in);
        System.out.println("What day is it?");

        String day = scanner.nextLine();


        switch(day){
            case "Sunday":
                System.out.println("It is NOT friday, it's Sunday");
                break;
            case "Monday":
                System.out.println("It is NOT friday, it's Monday");
                break;
            case "Tuesday":
                System.out.println("It is NOT friday, it's Tuesday");
                break;
            case "Wednesday":
                System.out.println("It is NOT friday, it's Wednesday");
                break;
            case "Thursday ":
                System.out.println("It is NOT friday, it's Thursday");
                break;
            case "Friday":
                System.out.println("It is INDEED friday!");
                break;
            case "Saturday":
                System.out.println("It is NOT friday, it's Saturday");
                break;
        }






        }







    }

