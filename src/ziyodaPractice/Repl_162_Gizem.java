package ziyodaPractice;

import java.util.Scanner;

public class Repl_162_Gizem {
    public static void main(String[] args) {


        int[] fibArray = new int[9];
        int initial = 0;
        int initial2 = 1;
        fibArray[0] = initial;
        fibArray[1] = initial2;

      /*  for (int i = 2; i < fibArray.length; i++) {

            fibArray[i] = fibArray[i - 1] + fibArray[i - 2];

        }*/
        System.out.println(fibArray[fibArray.length - 1]);
    }
}
