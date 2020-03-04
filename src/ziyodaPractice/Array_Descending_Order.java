package ziyodaPractice;

import java.util.Arrays;

public class Array_Descending_Order {
    public static void main(String[] args) {
        int[] nums = {100, 500, 300};
        Arrays.sort(nums);
        int[] reverse = new int[nums.length];
        int count = 0;
        for (int i = nums.length-1; i >=0 ; i--) {
            reverse[count]=nums[i];
            count++;
        }

        System.out.println(Arrays.toString(reverse));
    }
}
