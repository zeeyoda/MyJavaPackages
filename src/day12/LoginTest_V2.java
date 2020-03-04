package day12;

public class LoginTest_V2 {
    public static void main(String[] args) {
        String userName = "abc123";

        boolean userNameCorrect = userName.equals("ABC123");
        System.out.println( userNameCorrect);

        boolean nameCheckIgnoreCheck = userName.equalsIgnoreCase("ABC123");
        System.out.println( nameCheckIgnoreCheck);
        //store your name is a name variable
        //check for equality using different uppercase lowercase example
        //using equals and equalsIgnoreCase

        String myName = "MauGli";
        boolean myNameIs = myName.equals("Maugli");
        System.out.println( myNameIs );

        boolean myNameIsNot = myName.equalsIgnoreCase("Maugli");
        System.out.println(myNameIsNot);



    }
}
