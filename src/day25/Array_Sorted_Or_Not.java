package day25;

import java.util.Arrays;

public class Array_Sorted_Or_Not {
    public static void main(String[] args) {
        int[] nums = {13, 31, 8, 5, 21, 2};
        //storing the size of an array into a variable
        int numsItemCount = nums.length;
        // I want to copy the content of nums array into the new string

        //creating an array with same size as original array
        int[] numsCopy = new int[numsItemCount];
        numsCopy[0]= nums[0]; // =13; copying one by one from the original array
        numsCopy[1]= nums[1];
        numsCopy[2]= nums[2];
        numsCopy[3]= nums[3];
        numsCopy[4]= nums[4];
        numsCopy[5]= nums[5];
        for (int x = 0; x < numsItemCount; x++) {
            numsCopy[x] = nums[x];

        }

        System.out.println("Before sorting the numsCopy = "+ Arrays.toString(numsCopy));
        Arrays.sort(numsCopy);
        System.out.println("After sort numsCopy = " + Arrays.toString(numsCopy));

        //check if array still has the same content in the same order after sorting
        //what method will check for content
        if(Arrays.equals(nums, numsCopy)) {
            System.out.println("this array is already sorted");
        }else{
            System.out.println("this array is not already sorted");

        }

    }
}
