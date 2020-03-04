package ziyodaPractice;

import java.util.Arrays;

public class Repl_205 {
    public static void main(String[] args) {
        int[] ints1 = {1, 2, 3, 4, 5};
        int[] ints2 = {6, 7, 8, 9, 10};


    }
    public static int[] addElements(int[] ints1, int[] ints2) {
        int[] ints3 = new int[ints1.length];
        for (int i = 0; i < ints1.length; i++) {
            ints3[i] = ints1[i] + ints2[i];
        }
        return ints3;
    }
}
