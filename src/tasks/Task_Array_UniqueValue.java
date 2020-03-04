package tasks;

import java.util.Arrays;

public class Task_Array_UniqueValue {
    public static void main(String[] args) {

        int[] nums = {5, 8, 7, 8, 5, 7, 3, 2, 1};

        for (int j = 0; j < nums.length; j++) {
            int count = 0;
            for (int x = 0; x < nums.length; x++) {
                if (nums[x] == nums[j]) {
                    count++;
                }

            }
            if (count == 1) {
                System.out.println(nums[j]);
            }

        }
    }
}





