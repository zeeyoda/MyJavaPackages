package day29;

import java.util.Arrays;

public class Array_Filling_Up_1 {
    public static void main(String[] args) {
        int[] size = new int[100];
        System.out.println("Before filling up:" + Arrays.toString(size));
        size[0]=1;
        size[1]=2;
        size[2]=3;
        for (int x = 0; x < size.length; x++) {
            size[x] = x+1;
        }
        System.out.println("After filling up: "+ Arrays.toString(size));


    }
}
