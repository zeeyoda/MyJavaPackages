package day36;

import java.util.Arrays;

public class MethodPracticeLong {
    public static void main(String[] args) {
    Long[] myLongs = {6L, 11L, 44L, 32L, 65L};
        System.out.println("Before swap myLongs = " + Arrays.toString(myLongs));

        swapFirstAndLastValue(myLongs);
        System.out.println("After swapping myLongs "+Arrays.toString(myLongs));


        int x = 0;
        Integer x1 = null; //  this means - >no object no address
    }

    /**
     * swap the first and last value of long array
     * @param nums
     */
    public static void swapFirstAndLastValue(Long[] nums){

        long temp = nums[0];
        nums[0]=nums[nums.length-1];
        nums[nums.length-1]=temp;

    }
}
