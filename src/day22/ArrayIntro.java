package day22;

public class ArrayIntro {
    public static void main(String[] args) {
        // syntax for creating variable  to store a singe item
        // and assigning value
        //dataType variableName = value here
        int num1 = 10;

        //syntax for creating a variable to store multiple items
        //and assigning values
        // dataType [] variableName = new dataType [count of item];
        //this array can hold 4 items, it is also called array size
        //creating an object with empty space
        int[] scores = new int[4] ;
        scores[0] = 95;
        scores[1] = 70;
        scores[2] = 88;
        scores[3] = 100;
        // accessing the elements inside array one by one
        System.out.println(   scores[0]   );
        System.out.println(   scores[1]   );
        System.out.println(   scores[2]   );
        System.out.println(   scores[3]   );

        //updating the value at certain index
        scores [1] = 99;
        System.out.println( scores[1]);

        //when array is created it gets a default value
        int[] numbers = new int[3];
        System.out.println( numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);



    }
}
