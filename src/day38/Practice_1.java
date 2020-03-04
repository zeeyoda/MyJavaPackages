package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice_1 {
    public static <ArraysList> void main(String[] args) {
        List<Double> nums = Arrays.asList(6.99, 5.55, 3.76, 3.99, 6.99, 65.67, 0.99, 5.55);
        int count = 0;
        for (Double each:nums) {
            if (each > 5) {
                //System.out.println(each);
                count++;
            }

            }
            System.out.print(count);
        System.out.println("========================================================");
        System.out.println(nums);

            nums.set(2, 8.14);
           System.out.println(nums);

        ArrayList<Double> newPrices = new ArrayList<>(nums);
        System.out.println(newPrices);
        newPrices.add(0.99);
        newPrices.add(3, 85.00);
        System.out.println(newPrices);

        newPrices.remove(0.99);
        System.out.println(newPrices);

        ArrayList<Double> nums2 = new ArrayList<>(Arrays.asList(6.99, 5.55, 3.76, 3.99, 6.99, 65.67, 0.99, 5.55));
        System.out.println(nums2);
        nums2.add(1, 100.00);
        nums2.remove(2);
        System.out.println(nums2);






    }
}
