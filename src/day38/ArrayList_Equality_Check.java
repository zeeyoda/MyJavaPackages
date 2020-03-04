package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList_Equality_Check {
    public static void main(String[] args) {
        List<Integer> nums1 = new ArrayList<>(Arrays.asList(200, 300, 600, 700, 800));

        List<Integer> nums2 = new ArrayList<>(Arrays.asList(200, 300, 600, 700, 800));

        List<Integer> nums3 = new ArrayList<>(Arrays.asList(300, 200, 600, 700, 800));

        System.out.println(" Does nums1 equal to nums2 = "+nums1.equals(nums2));

        System.out.println("Does nums2 equal to nums3 + "+nums2.equals(nums3));

    }
}
