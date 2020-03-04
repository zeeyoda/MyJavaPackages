package ziyodaPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class Repl_202_Two_Times_ArrayList {
    public static void main(String[] args) {


    }

    public static void timesTwo(ArrayList<Integer> nums){

        for (int i = 0; i < nums.size(); i++) {
            nums.set(i, nums.get(i)*2);
        }
        System.out.println(nums);
    }
}
