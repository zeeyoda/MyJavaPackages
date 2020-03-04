package tasks;

import java.util.Arrays;

public class Ziyoda_Array_Split_CharArray {
    public static void main(String[] args) {
        char[] characters = {'a','b','c','d'};
        String str1 = Arrays.toString(characters);
        System.out.println(str1);

        String sentence = "ABCD";
        String[] chars = "ABCD".split("");
        System.out.println(Arrays.toString(chars));

        char[] chars2 = "Vald".toCharArray();
        System.out.println(chars2);
    }
}
