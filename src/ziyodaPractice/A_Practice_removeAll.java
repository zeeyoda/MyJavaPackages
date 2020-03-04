package ziyodaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A_Practice_removeAll {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("Ziyoda", "Adil", "Adil", "Azat"));
        String name = "Adil";
        names.removeAll(Arrays.asList(name));
        System.out.println(names);

        List<Integer> nums = new ArrayList<>(Arrays.asList(5, 6, 8, 7, 9, 3));
        int num = 5;
        nums.removeAll(Arrays.asList(num));
        System.out.println(nums);
    }
}
