package day32;

import java.util.Arrays;

public class Method_Array_Practice {
    public static void main(String[] args) {
        // this is passing the array object directly into the method
        //printArrayItems(new int[]{1, 6, 5, 12, 3, 14});

        //this is assigning the array object into a variable
        //and then pass it into the method
       // int[] scores = {2,5,8,23,4,5,6};
        //printArrayItems(scores);
        //printMaxOfIntArray(new int[]{1, 5, 6, 8, 9});
        //printMinOfIntArrayint(new int[]{45, 85, 74, 25});
        //sumofArray(new int[]{45, 85, 74, 25});
        compare2ArraySize(new String[]{"Sezgin","Senay","Astrit"}, new String[]{"Araz"});
        String[] names1 = {"Superman","Batman","Flash"};
        String[] names2 = {"Wonder Woman","Aqua","Kukla"};


        compare2ArraySize(names1, names2);


    }
    //create
    public static void  compare2ArraySize(String[] arr1, String[] arr2){

        if(arr1.length>arr2.length) {
            System.out.println("Array 1 has more item ");
        }else if(arr1.length<arr2.length) {
            System.out.println("Array 2 has more item");
        }else{
            System.out.println("Array 1 and Array 2 have the same size");
        }

    }
    public static void sumofArray(int[] nums){
        int sum = 0;
       // for (int i = 0; i < nums.length; i++) {
        //    sum = sum+i;
            for (int each : nums) {
                sum = sum + each;

            }
            System.out.println("Sum is: "+sum);
        }

    //printMinOfIntArray
    public static void printMinOfIntArrayint(int[] numerals){
        int min = numerals[0];
        for (int i = 0; i < numerals.length; i++) {
            if(numerals[i]<min){
                min=numerals[i];
            }

        }
        System.out.println(min);

    }
    //printMaxOfIntArray
    //this method has one int array as parameter
    //and it will print the mas number inside the array
    public static void printMaxOfIntArray(int[] number ){
        int max = number[0];
        for (int i = 0; i <number.length ; i++) {
            if(number[i]>max);
            max=number[i];
        }
        System.out.println(max);

    }
    public static void printArrayItems(int[] nums ){
        System.out.println("Array has items: " + Arrays.toString(nums));
    }
}
