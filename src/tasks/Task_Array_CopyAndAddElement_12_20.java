package tasks;

import java.util.Arrays;

public class Task_Array_CopyAndAddElement_12_20 {
    public static void main(String[] args) {
      /*int[] num ={2, 6, 5, 4, 17, 8};
        int[] num1 = new int[7];
        num1[0] = num[0];
        num1[1] = num[1];
        num1[2] = num[2];
        num1[3] = num[3];
        num1[4] = num[4];
        num1[5] = num[5];
        num1[6] = 9;
        System.out.println(Arrays.toString(num1));*/
        int[] num ={2, 6, 5, 4, 17, 8};
        int[] num1 = new int[7];
        for (int i = 0; i < num1.length; i++) {
            if(i==num1.length-1){
                num1[num1.length-1]=9;
                break;
            }
            num1[i]=num[i];

            }
        System.out.println(Arrays.toString(num1));

        }


    }

