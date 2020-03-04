package ziyodaPractice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class A_Practice_Swapping {

    public static void main(String[] args) {

        int a = 20;
        int b = 45;
        int temp = 0;
        temp = a;// now temp equals to a
        a=b;//45
        b=temp;//20
        System.out.println("After swapping a= "+a+" and b= "+b);

        //swapping without assigning temp number

        int x = 78;
        int y = 100;
        x=x+y;//178
        //y=(x+y)-y; y=x
        y = x-y;//y=178-100=78
        //x=(x+y)
        x=x-y;//x=178-78=100


        //how to sort array swapping the numbers

        int[]num = new int[]{45, 2, 3, 7, 8, 90, 2};
        System.out.println("Before sorting the array "+ Arrays.toString(num));
        for (int i = 0; i < num.length ; i++) {
            for (int j = i+1; j <num.length ; j++) {
                if(num[i]>num[j]){
                    int temp1 = num[i];
                    num[i]=num[j];
                    num[j]=temp1;
                }
            }
        }
        System.out.println("After sorting the numbers "+Arrays.toString(num));

        //swapping array

        int[] arr = new int[]{3, 5, 7, 8, 15, 25, 35};
        System.out.println("Before swapping the array "+Arrays.toString(arr));
        for (int i = 0, j=arr.length-1; i < arr.length/2 ; i++, j--) {
            int temp2 = arr[i];
            arr[i] = arr[j];
            arr[j] = temp2;

        }
        System.out.println("After reversing the array "+Arrays.toString(arr));


        int[] arr1 = new int[]{13, 5, 7, 8, 15, 25, 35, 80};
        System.out.println("Akbar's way Before swapping the array "+Arrays.toString(arr1));
        for (int i = 0; i < arr1.length/2 ; i++) {
            int temp3 = arr1[i];
            arr1[i] = arr1[arr1.length-1-i];
            arr1[arr1.length-1-i] = temp3;
        }
        System.out.println("After swapping the array "+Arrays.toString(arr1));

        System.out.println("Reversing the ArrayList");

        ArrayList<Integer> lst = new ArrayList<>(Arrays.asList(34, 5, 6, 78, 98, 12, 45, 32));
        for (int i = 0; i < lst.size() ; i++) {
            for (int j = i+1; j < lst.size(); j++) {
                if (lst.get(i) > lst.get(j)) {
                    int tempLst = lst.get(i);
                    lst.set(i, lst.get(j));
                    lst.set(j, tempLst);
                }
            }

            }
            System.out.println("After sorting the ArrayList "+lst);

        System.out.println("Swapping ArrayList elements");
        ArrayList<Integer> swap = new ArrayList<>(Arrays.asList(34, 5, 6, 78, 98, 12, 45, 32));
        System.out.println("Before swapping the ArrayList elements "+swap);
        for (int i = 0, j=swap.size()-1; i < swap.size()/2 ; i++, j--) {// j=swap.size()-1
            int tempSwap = swap.get(i);
            swap.set(i, swap.get(j));
            swap.set(j, tempSwap);
        }
        System.out.println("After swapping the elements in ArrayList "+swap);



        }
    }

