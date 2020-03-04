package ziyodaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Repl_190 {
    public static void main(String[] args) {

        int[] a = {1,2,3};
        int[] b = {4,5,6};
        System.out.println(Arrays.toString(mergR(a, b)));



    }
    public static int[] mergR(int[] a,int[] b){
       /* int[] mergR = new int[a.length+b.length];
        int z=0;
        for (int i = 0; i < a.length; i++) {
            mergR[z] = a[i];
            z++;
        }
        for (int j = 0; j < b.length ; j++) {
            mergR[z]=b[j];
            z++;



        }

        return mergR;*/
        int length = a.length + b.length;
        int[] arr = new int[length];
        int y = 0;
        for (int x = 0; x < a.length; x++) {
            arr[y] = a[x];
            y++;
        }
        for (int m = 0; m < b.length; m++) {
            arr[y] = b[m];
            y++;

        }
        return arr;
    }
  }
