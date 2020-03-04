package day06;

public class PreIncrementDecrementOperator {
    public static void main(String[] args) {

        // initializing(giving value) offerCount value to 2
        int offerCount = 4;
        //increasing the number by one using regular way;
        // offerCount = offerCount + 1;

        //this is increasing the value by one using compound/shorthand operator
        //offerCount +1=;

        //Since increasing or decreasing a value is very special
        //and often used in programming
        //There is even shorter shortcut for this operation
        //and we use ++ or --, THIS IS EXCLUSIVELY FOR INCREASING OR DECREASING BY 1
        //We cannot use it for any other time like increasing or decreasing value by more than 1.
        //++ offerCount;//offer count will increase by one.
        //It is the same as offerCount + 1; or offerCount +=1.

        ++ offerCount;
        System.out.println("Offer now after increasing by one: " + offerCount);

        --offerCount;
                System.out.println("Offer now after decreasing by one " + offerCount);


    }
}
