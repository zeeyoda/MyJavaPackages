package OfficeHour;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array_String_Comparison_Practice_12_19 {
    public static void main(String[] args) {
        /*1. write a program that can check if a string is build out of the same letters as another string
		Ex: input:
				str1 = "abc";
				str2 = "cba";
			output:
				true
				*/
        String str1 = "abc", str2 = "cbb";
        //.split(), toCharArray()

        char[] arr1 = str1.toCharArray();//[a, b, c];
        Arrays.sort(arr1);

        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        System.out.println(Arrays.equals(arr1, arr2));

        str1 = Arrays.toString(arr1);
        str2 = Arrays.toString(arr2);

        System.out.println(str1.equals(str2));//


    }
}
