package ziyodaPractice;

import java.util.Scanner;

public class Repl_115_Array_Max {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        int sum = 0;
        for(int x=0; x<nums.length; x++) {
            nums[x]=input.nextInt();
          sum = sum+nums[x];
        }
        System.out.println(sum);

    }
}
