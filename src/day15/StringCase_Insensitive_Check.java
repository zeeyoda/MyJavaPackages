package day15;

public class StringCase_Insensitive_Check {
    public static void main(String[] args) {
        String name = "Arya Stark";
        System.out.println( "name contains st RESULT IS : " + name.contains("st"));

        // I want to check if this name has st regardless of upper/lower case
        //I want to store the uppercase version of this name then check for ST

        String  uppercaseName = name.toUpperCase(); //"ARYA STARK"
        System.out.println("uppercaseName contains ST or not? " +uppercaseName.contains("ST"));

        String lowercaseName = name.toLowerCase(); //"arya stark"
        System.out.println(("lowercaseName contains st or not? " + lowercaseName.contains("st")));

        // method chaining - is combining multiple method call
        //make my name all lower case (String), then check whether it contains lowercase st
        System.out.println(name.toLowerCase().contains("st"));

        //System.out.println(name.length().toUpperCase()); length is an int which is a primitive,
        // therefore it cannot have a String action

    }
}
