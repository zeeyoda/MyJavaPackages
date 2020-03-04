package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysList_Retail_All {
    public static void main(String[] args) {
        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(100);
        nums1.add(200);
        nums1.add(450);
        nums1.add(300);
        nums1.add(400);
        nums1.add(450);
        nums1.add(500);
        nums1.add(600);
        nums1.add(450);

        List<Integer> nums2 = new ArrayList<>(Arrays.asList(200, 300, 600, 700, 800));
        //System.out.println(nums2);
        // this will only keep the common part of nums2
        nums1.retainAll(nums2);
        System.out.println("nums1 = " +nums1);

        nums2.retainAll(nums2);
        System.out.println("nums2 = "+nums2);


    }
}
