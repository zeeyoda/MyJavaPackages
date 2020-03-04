package OfficeHour;

public class Practice_11_18 {

    public static void main(String[] args) {


        //System.out.println("aaa")
        //compound operator/ shorthand operator
        //+=, -=, *=, /=, %=

        //Increment and decrement operator
        //++ --

        //Relational operator
        //> >= < <= checking more or less
        // == != checking for equality

        //casting : converting one type to another
        //upcasting | type widening
            // converting date with smaller range data type to bigger range data type
            // for example converting int to long, int to double
            //this happens implicitly
            // double price = 99; if this is printed out, we get 99.0
        double price = 99; // 99-->>99.0
        long earthToKrypton = 1500; // 1500 will become 15000L


        //downcasting | type narrowing
        //converting date with bigger data type to smaller range data type
            //for example converting double to int, or long to short
            //this must happen explicitly (by user) or it will not compile
            //Just like we cannot put large coffe into small cup. as it will spill
            //In order to make it work, we need to cast it explicitly
            //tell the compiler this is what we want to do even though potential data will be lost
            //Example
            // int priceAsWholeNumber = 99.45; we will get an error as 99.45 is not an int
            // int priceAsWholeNumber = (int) 99.45; when printed we will get 99 and .45 will be lost

        //Special case of char to int
        // each character is represented by numbers is ascii table (google this table)

        char myLetter = 'A';
        System.out.println(myLetter);

        //int only stores numbers
        //so here it turns the character into Ascii code number representation of the letter
        int myLetter2 = 'A';
        System.out.println(myLetter2);

        int myLetter3 = 'a';
        System.out.println(myLetter3);

        char myLetter4 = 87;
        System.out.println(myLetter4);

        char myLetter5 = '8';
        System.out.println(myLetter5);

        //---------------------------------------
        // --- positive and negative number is programming
        // + can be
        //arithmetic operator 5 + 10 =15
        //increment operator ++x, x++ increase the number by 1
        // concatenation "Jon " + "Snow" = "Jon Snow"
        // It can also indicate a number is a positive int i = +5; It is optional

        //-
        // can be
        // Arithmetic subtraction operator 15 - 5 + 10
        // shorthand operator int x =10; = -+3; equals to 7
        //decrement operator --x, x-- decrease the number by 1
        //it can also indicate the number is negative
        // for example int bankBalance = -190; NOT OPTIONAL
        int num = 10;
        System.out.println(   num ==10);
        System.out.println(   num !=10);

        //-- we can store the result of the relational operation into boolean variable
        // because all of them will return true or false
        boolean isNumEqual10 = num ==10; // or u can also put it in brackets as (num ==10)
        System.out.println(isNumEqual10);

    }
}
