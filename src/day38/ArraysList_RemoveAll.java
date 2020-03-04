package day38;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysList_RemoveAll {
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

        //I want to remove 100, 133
        // just like add.All method, removeAll expects another collection or List Object to be removed

        nums1.removeAll(Arrays.asList(100, 300));
        System.out.println("nums1 after removing = "+ nums1);

        //if we remove the items i don't have, nothing happens when I print
        nums1.removeAll(Arrays.asList(100, 300));
        System.out.println(nums1);

        nums1.removeAll(Arrays.asList(400, 1000));
        System.out.println("after trying to remove 400 that exists and 100 that doesn't exist = "+nums1);

        //if we have the same number appear in several indexes then want to remove all occurrences
        // of the same number
        nums1.removeAll(Arrays.asList(450));
        System.out.println(nums1);




    }
}

