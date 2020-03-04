package ziyodaPractice;
import java.util.ArrayList;
import java.util.Arrays;

public class Repl_201_ArrayList_Sum {
    public static void main(String[] args) {

    }

    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> nums) {
        ArrayList<Integer> numsCopy = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > 0) {
                numsCopy.add(nums.get(i));
                sum += nums.get(i);
            }
        }
        numsCopy.add(sum);

        return numsCopy;
}
}



