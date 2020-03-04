package day25;

import java.util.Arrays;

public class Ziyoda_Array_Copy {
    public static void main(String[] args) {
        int [] nums = {5, 8, 7, 9, 6};
        int numsSize = nums.length;

        int[] numsCopy = new int[numsSize];
        numsCopy[0]=nums[0];
        numsCopy[1]=nums[1];
        numsCopy[2]=nums[2];
        numsCopy[3]=nums[3];
        numsCopy[4]=nums[4];

        for (int i = 0; i < nums.length; i++) {
            numsCopy[i]=nums[i];
            System.out.print(numsCopy[i]+" ");
            System.out.println("-------------------------------");

            System.out.println("Before sorting numsCopy: "+Arrays.toString(numsCopy));
            Arrays.sort(numsCopy);
            System.out.println("After sorting numsCopy: "+Arrays.toString(numsCopy));

          if(Arrays.equals(nums,numsCopy)){
                System.out.println("This array is sorted");
            }else{
                System.out.println("This array is not sorted");
            }

        }

    }

}