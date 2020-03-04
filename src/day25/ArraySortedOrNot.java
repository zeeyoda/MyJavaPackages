package day25;

import java.util.Arrays;

public class ArraySortedOrNot {

    public static void main(String[] args) {
        int[] nums = {11, 2, 43, 4, 15, 6};
        System.out.println("nums = " + Arrays.toString( nums));
        // create a variable

        boolean isSortedAlready = true;
        for (int x = 0; x < nums.length-1; x++) {
            System.out.println(nums[x]+ " " + nums[x+1]);// first pick item comparing to the next item
            // keep repeating until there is no more item

            // print if item1 is less than item2
            System.out.println("is "+ nums[x]+ " less than "+ nums[x+1]+ " ? " + (nums[x]<nums[x+1]));
           if(! (nums[x] < nums[x+1])){
           System.out.println("Array is not sorted, no point checking the rest");
           isSortedAlready = false;
           break;
}

        }
        System.out.println("isSortedAlready = " + isSortedAlready);
    }
}
