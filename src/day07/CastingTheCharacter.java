package day07;

public class CastingTheCharacter {

    public static void main(String[] args) {

        char grade = 'B';
        System.out.println(grade);

        int letterInNumber = 'B' ;//'B' is represented by 66 in ascii table
        // here type char is automatically widened to int
        // and stored as number
        System.out.println(letterInNumber);

        int letterNumber2 = 'b';
        System.out.println(letterNumber2);
        //---------------------------

        char myFirstChar = 100 ;
        System.out.println(myFirstChar);


        int fName1 = 'Z';
        System.out.println(fName1);
        int fName2 = 'I';
        System.out.println(fName2);
        int fName3 = 'Y';
        System.out.println(fName3);
        int fName4 = 'O';
        System.out.println(fName4);
        int fName5 = 'D';
        System.out.println(fName5);
        int fName6= 'A';
        System.out.println(fName6);

        char letterA ='a';
        //adding a character to int number will result in int
        //(int) letterA + 1
        System.out.println( letterA +1  );

        System.out.println("" + letterA + 1  );//compiler will read this as a String
        //if you start with a String you end with a String


    }
}
