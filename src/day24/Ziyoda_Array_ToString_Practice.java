package day24;

import java.util.Arrays;

public class Ziyoda_Array_ToString_Practice {
    public static void main(String[] args) {
        int[] sizes = new int[]{2,3,4,5,6};
        System.out.println(Arrays.toString(sizes));
        String allSizes = Arrays.toString(sizes);
        System.out.println(allSizes.charAt(0));
        System.out.println(allSizes.charAt(1));
        System.out.println(allSizes.substring(allSizes.length()-1));
        System.out.println(allSizes.substring(allSizes.length()/2));
        for (int x = 0; x <sizes.length ; x++) {
            System.out.println("Size at index "+ x +" is "+sizes[x]);

        }
    }
}
