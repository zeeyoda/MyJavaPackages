package OfficeHour;

import java.util.Arrays;

public class Practice_12_12 {
    public static void main(String[] args) {
        String[] names = new String[5];
                    names[2]="Hasan";
                    names[4]="Husan";

         System.out.println(Arrays.toString(names)) ;

         int[]nums = new int[7];
        System.out.println(Arrays.toString(nums));

        char[] characters = {'a','b','c','d'};
        String str1 = Arrays.toString(characters);
        System.out.println(str1);

        int[]scores = {5, 4, 9};
        Arrays.sort(scores);
        System.out.println();

        String[] chars = "ABCD".split("");
        System.out.println(Arrays.toString(chars));//{A,B,C,D

        char[] chars2 = "Vald".toCharArray();
        System.out.println(chars2);
    }
}
