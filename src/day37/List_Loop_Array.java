package day37;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class List_Loop_Array {
    public static void main(String[] args) {
        /**
         * Create an Array List of Integer and fill it up with 1-100

         */
        List<Integer> nums = new ArrayList<>();
        for (int number  = 1; number <=100; number++) {
            nums.add(number);

        }
        System.out.println("nums = "+nums);

        //change all the odd number value to 0;

        for (int i = 0; i < nums.size(); i+=2) {//because our odd numbers are located at even index
            System.out.println("Odd Values are at index "+i);
            nums.set(i, 0);

            }
        System.out.println(nums);
        nums.indexOf(20);
        System.out.println("Index of 20 : nums.indexOf() = "+nums.indexOf(20));
        //insert 100 to first index
        nums.add(0, 100);
        System.out.println("nums = " + nums);

        //I want to know index of 20
        nums.indexOf(20);
        System.out.println("Index of 20 after inserting 100 at index 0 is = "+nums.indexOf(20));


    }

}
