package ziyodaPractice;

import java.util.Arrays;

public class Array_Ends_With_E {
    public static void main(String[] args) {

        String arr [] = {"zero", "one", "two","three","four"};
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i].contains("e")) {
                count++;
                System.out.print(arr[i]+" ");
                System.out.println();
            }
            }
        System.out.println(count);
        String[] fewValues = new String[count];
        for (int x = 0; x < fewValues.length; x++) {
                fewValues[x]=arr[x];

        }

        }




    }

