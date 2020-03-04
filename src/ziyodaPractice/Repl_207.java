package ziyodaPractice;

import java.util.Arrays;

public class Repl_207 {
    public static void main(String[] args) {
        int[] nums = {4, 7, 2, 9};

       //do_switch(Arrays.toString(nums);

    }
    public static int[]do_switch(int[] i){
        int temp = i[0];
        i[0]=i[i.length-1];
        i[i.length-1]=temp;

        return i;
    }
}
