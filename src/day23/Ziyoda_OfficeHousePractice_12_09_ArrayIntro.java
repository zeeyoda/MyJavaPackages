package day23;

import java.util.Arrays;

public class Ziyoda_OfficeHousePractice_12_09_ArrayIntro {
    public static void main(String[] args) {
        int[] nomer = {4, 5, 7, 8, 9,10};
        System.out.println(Arrays.toString(nomer));
        System.out.println(nomer.length);
        System.out.println(nomer[nomer.length-1]);
        //to find the middle value we divide the length by 2
        System.out.println(nomer[nomer.length/2]);
        System.out.println("------------------------------");

        //how to find the largest number in an array
        int[] num = {4, 5, 7, 8, 9,10};
        int max = num[0];
        int secondMax = max;
        int min = num[0];
        int secondMin = num[0];
        for (int x=0; x<num.length; x++) {
            if (num[x] > max) {
                max = num[x];
            }
            if (num[x] < min) {
                min = num[x];
            }
        }
        for(int eachNum: num){
                if (eachNum > secondMax && eachNum != max) {
                    secondMax = eachNum;
                }
        }
                System.out.println("Max is: "+max);
        System.out.println("Second max is:"+secondMax);
        System.out.println("Min value is: "+min);
    }
}
