package stringmethods;

public class Main {
    public static void main(String[] args) {
        //string is a reference data type that can be used to store one or more characters.
        // reference data types have access to useful methods
        String name = "  Julius  ";

        //boolean result = name.equals("Julius");
        //equals is case sensitive
        //a non-case-sensitive method
        //boolean result = name.equalsIgnoreCase("JuLIuS");

        //.length returns the length of a variable.
        //int result = name.length();

        //charAt chooses the character at (x) place.
        //char result = name.charAt(0)

        //this finds the index of the character given in .indexOf(x), by using  letters.
        //int result = name.indexOf("j");

        //gives a true/false, .isEmpty() checks, if the given string is empty.
        //boolean result  = name.isEmpty();


        // makes the entire string uppercase. substring is used if you want specific characters uppercase.
        //String result = name.toUpperCase();
        //to lower case.
        //String result = name.toUpperLower();

        // trim method removes empty space before and after characters.
        //String result = name.trim();

        // replace replaceschars, with parameters being 'oldchar','new char'
        //String result = name.replace('u','a');


       //System.out.println(result);
    }
}
