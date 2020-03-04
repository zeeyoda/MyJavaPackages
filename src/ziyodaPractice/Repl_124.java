package ziyodaPractice;

public class Repl_124 {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 44, 1, 100, 55};

        for(int x=0; x<nums.length/2; x++){
            nums[x]=nums[nums.length-1-x];
        }
    }
}
