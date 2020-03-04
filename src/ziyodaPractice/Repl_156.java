package ziyodaPractice;

import java.util.Arrays;

public class Repl_156 {
    public static void main(String[] args) {

        int[] arr = {2, 5, 8, 6};
        int arrSize = arr.length;
        int[] arrCopy = new int[arrSize+1];

        for (int i = 0; i < arr.length ; i++) {
            arrCopy[i]=arr[i];
            arrCopy[arrSize]=9;
            System.out.print(arrCopy[i]+ " ");


        }
        System.out.println(arrCopy[arrSize]);


    }
}
