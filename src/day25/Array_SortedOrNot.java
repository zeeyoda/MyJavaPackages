package day25;

import java.util.Arrays;

public class Array_SortedOrNot {
    public static void main(String[] args) {
        int[] num = {13, 31, 8, 5, 21, 2};
        System.out.println(Arrays.toString(num));
        int numCount = num.length;
        int[] numCopy = new int[numCount];
        /*numCopy[0]=num[0];
        numCopy[1]=num[1];
        numCopy[2]=num[2];
        numCopy[3]=num[3];
        numCopy[4]=num[4];
        numCopy[5]=num[5];*/
        System.out.println(Arrays.toString(numCopy));
        for (int x = 0; x < numCopy.length; x++) {
            numCopy[x] = num[x];
        }
        System.out.println("Before sort numCopy = "+Arrays.toString(numCopy));
        Arrays.sort(numCopy);
        System.out.println("After sort numCOpy = "+Arrays.toString(numCopy));






    }
}
