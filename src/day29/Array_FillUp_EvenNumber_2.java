package day29;

import java.util.Arrays;

public class Array_FillUp_EvenNumber_2 {
    public static void main(String[] args) {
    // fill up the array with even numbers starting from 2
        int[] size = new int[100];
        System.out.println("Before filling up:" + Arrays.toString(size));
       /*this is what we would do without the loop
        size[0]=0;  //0*2
        size[1]=2;  //1*2
        size[2]=4;  //2*2
        size[3]=6;  //3*2
        size[4]=8;
        size[5]=10;
        size[6]=12;
        ..........
        size[99]=198;
        */
        //size[x}=X*2

        for (int i = 0; i <size.length; i++) {
            size[i]=i*2;

        }

        System.out.println("After filling up \n"+ Arrays.toString(size));
    }
}
