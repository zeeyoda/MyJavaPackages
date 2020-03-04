package day05;

public class VariablePractice {

    public static void main(String[] args) {
        // 8 primitives
        /*
        line1
        line2
        line3
        This is called block comment, everything in between will be seen as comment

        whole number         : byte, short, short, int, double
        fractional numbers   : float , double
        logical              : boolean (true , false)
        character            : char (single character in single quote)

        usually by default for whole numbers :  just use int
        usually by default for fractional numbers: just use double
        IS String part of Primitive types? : NO!
        String is sequence of character
         */

        //Task 1: Age calculator
        //given birth year , please calculate the age

        int birthYear = 1982;
        int currentYear = 2019;
        int age = currentYear-birthYear;

        //I was born in year 1982 , and I am 37 years old

        System.out.println(currentYear-birthYear);
        //System.out.println("I was born in year " + 2001 + " , and I am " + (2019-1982) + " years old");
        System.out.println("I was born in year " + birthYear + " , and I am " + age + " years old");

        //Task 2 : you are speeding today


        int speedLimit = 45;
        int currentSpeed = 65;
        int overTheLimit = 20;
        int speeding = currentSpeed-speedLimit;

        System.out.println("My current speed is " + currentSpeed + " , speed limit is " + speedLimit + "." +
                " I am going " + speeding + " over speed limit");

        System.out.println("Your are driving " + overTheLimit + " mph more than speed limit");
    }
}
