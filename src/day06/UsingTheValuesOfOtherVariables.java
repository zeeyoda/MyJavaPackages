package day06;

public class UsingTheValuesOfOtherVariables {
    public static void main(String[] args) {
        int myFavNumber = 300 ;

        int urFavNumber = myFavNumber ;

        System.out.println("My favorite number " + myFavNumber);
        System.out.println("Your favorite number " + urFavNumber);

        urFavNumber = 100;
        System.out.println("My favorite number " + myFavNumber);
        System.out.println("Your favorite number " + urFavNumber);

        //create a variable called yourOrder , type String and assign a value
        //optionally assign this value using Scanner
        //create another variable called myOrder and assign the value
        //and just print them out.

    }
}
