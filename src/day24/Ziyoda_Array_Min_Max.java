package day24;

import java.util.Arrays;

public class Ziyoda_Array_Min_Max {
    public static void main(String[] args) {
        int[] number = {1, 4, 5, 34, 2};
        int temp=0;
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j <number.length ; j++) {
                if(number[i]<number[j]){
                    temp=number[i];
                    number[i]=number[j];
                    number[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(number));
    }
}
