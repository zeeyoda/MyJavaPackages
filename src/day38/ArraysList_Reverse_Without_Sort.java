package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysList_Reverse_Without_Sort {
    public static void main(String[] args) {
        List<Integer> nums2 = new ArrayList<>(Arrays.asList(300, 200, 700, 600, 800));
        System.out.println("nums2 = " + nums2);
        for (int i = 0; i < nums2.size() / 2; i++) {
            Integer temp = nums2.get(i);
            nums2.set(i, nums2.get(nums2.size() - 1 - i));
            nums2.set(nums2.size() - 1 - i, temp);
        }

        System.out.println("nums2 = " + nums2);
    }
}
