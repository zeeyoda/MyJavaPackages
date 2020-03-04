package day36;

import java.util.Arrays;

public class MethodWithParameterArray {
    public static void main(String[] args) {
        int[] nums = {1, 5, 3, 4, 7, 2};
        //System.out.println("Before nums got sorted "+nums);
        //Arrays.sort(nums);
        //System.out.println("After nums got sorted "+ Arrays.toString(nums));

        System.out.println("Before changing the first index "+ Arrays.toString(nums));
        changeArrayFirstItemTo100(nums);
        System.out.println("After changing the first index "+Arrays.toString(nums));

        //when you pass a variable to a method parameter
        // you are only passing the copy of that variable
        //for primitives ---> the copy hold the value itself
        //changing the value doesnt change the original value that passed

        //for reference type-->> the copy hold samw address of the object
        // changing the value will affect the original object
        //because both methods parameters and passed variables are pointing to the same object

        //THIS IS WHAT IS CALLED PASS-BY VALUE
        //when u pass a variable to a method parameter:
        //you are only passing the copy of that variable



    }

    /**
     *
     * @param numbers
     */
    public static void changeArrayFirstItemTo100(int[] numbers){
        numbers[0]=100;


    }

}
