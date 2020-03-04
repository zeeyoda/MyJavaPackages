package ziyodaPractice;

import java.util.Scanner;

public class Repl_121 {
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
       int count = 0;

    int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
    for(int x=0; x<nums.length; x++ ) {
        if (nums[x] % 2 == 0) {
            count++;
        }
    }
        System.out.println(count);

}
}
