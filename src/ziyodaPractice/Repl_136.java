package ziyodaPractice;

import java.util.Arrays;

public class Repl_136 {
    public static void main(String[] args) {
        int[] scores = {5, 6, 8, 8, 9, 7, 7, 9};

        System.out.println(Arrays.toString(scores).contains("7, 7"));
        System.out.println(Arrays.toString(scores).contains("6, 6"));
        System.out.println(Arrays.toString(scores).contains("5, 6"));
        System.out.println(Arrays.toString(scores).contains("9, 6"));
        System.out.println(Arrays.toString(scores).contains("5, 6"));
    }
}
