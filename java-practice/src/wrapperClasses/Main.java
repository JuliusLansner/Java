package wrapperClasses;

public class Main {
    public static void main(String[] args) {
        // wrapper class = provides a way to use primitive data types as reference data types as reference data types
        // reference data types contain useful methods
        // can be used with collections (ex. arraylist)

        //primitive     // wrapper
        //--------      //--------
        // boolean      //Boolean
        // char         //Character
        // int          //Integer
        // double       // Double

        //autoboxing, unboxing
        //4 reference data types created via autoboxing
        Boolean a = true;
        Character b = '@';
        Integer c= 123;
        Double d = 3.14;
        //String has S in caps, like Boolean, Character, Integer, Double.  Thats how to spot reference types.
        String e ="Bro";

        //reference data types within a wrapper class has access to some useful methods you can use.
        //unboxing is the reverse, converting reference to primitive data type.
        if (a==true){
            System.out.println("this is true");
        }
        if (b=='@'){
            System.out.println("this is true");
        }
        //accessing the data inside the wrapper class takes more steps than through just a raw, primitive value.

    }
}
