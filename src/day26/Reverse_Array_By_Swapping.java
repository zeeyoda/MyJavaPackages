package day26;

import java.util.Arrays;

public class Reverse_Array_By_Swapping {
    public static void main(String[] args) {
        int[] myNumber = {5, 1, 21, 2, 13, 8};
        int size = myNumber.length;
        int lastIndex = size-1;
        int middleIndex = size/2;
        System.out.println(Arrays.toString(myNumber));
        System.out.println(         );

        //firs and last item print
        System.out.println(myNumber[0]+"----------"+myNumber[lastIndex]);
        System.out.println(myNumber[1]+"----------"+myNumber[lastIndex-1]);
        System.out.println(myNumber[2]+"----------"+myNumber[lastIndex-2]);

        //loop this
        for(int x =0; x<middleIndex; x++){
            System.out.println(myNumber[x]+ "---------"+myNumber[lastIndex-1]);
            int temp = myNumber[x];
            myNumber[x]=myNumber[lastIndex-1];
            myNumber[lastIndex-1]=temp;
        }
        System.out.println("After swap complete "+ Arrays.toString(myNumber));


    }
}
