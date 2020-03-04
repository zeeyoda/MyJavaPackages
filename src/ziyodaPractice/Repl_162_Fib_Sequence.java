package ziyodaPractice;

import java.util.Arrays;

public class Repl_162_Fib_Sequence {
    public static void main(String[] args) {

       int n = 2;
      /*  if(n<0){
            System.out.println("Number is not allowed");*/
        if(n<=2){
            n=1;
            System.out.println(n);
        }
        if(n>2) {
            int first = 1;
            int second = 2;
            int nth = 2;
            for (int i = 3; i <= n - 1; i++) {
                nth = first + second;
                first = second;
                second = nth;


            }
            System.out.println(nth);
        }

    }

}









        /*int n=0;
        int m=1;
        int test;
        for (int i = 1; i<9; i++) {
            test= n+m;
            n = m;
            m = test;
        }
        System.out.print(n);

        int num=9;
        for (int i = 2; i <=num; i++) {
            if (i == num) {
                num = (num - 1) + (num - 2);
                break;
            }
        }
            System.out.println(num);*/


      /* int count = 10;
        int[] arr = new int[count];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <count; i++) {

           /* arr[i] = arr[i-1] + arr[i - 2];
            arr[count-1] = arr[count-2]+arr[count-3];

            System.out.println((arr[count]));*/


