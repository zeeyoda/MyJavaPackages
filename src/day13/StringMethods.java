package day13;

public class StringMethods {
    public static void main(String[] args) {
        //String  actions we already know so far
        //equals
        String s1 = "Hello";
        System.out.println( s1.equals("abc"));
        //equalsIgnoreCase
        System.out.println( s1.equalsIgnoreCase("HELLO"));
        //toUpperCase method of String is used to make String all character uppercase
        System.out.println( s1 );
        System.out.println( s1.toUpperCase());

        //toLowerCase method of String is used to make String all character lowercase
        System.out.println( s1.toLowerCase());
        System.out.println( s1.length());

        //in order to get how many character we have inside String
        //we can use length method of String
        //it will count each and every
        System.out.println( s1.length()    );

        int lengthOfStr = s1.length();
        if(lengthOfStr>4) {
            System.out.println("More than 4 character");
        }else{
            System.out.println("Not more than 4");
        }
    }
}
