package day34;

import java.util.Arrays;

public class MethodThatReturnMoreThanOneValue {
    public static void main(String[] args) {
        String sentence = "I love Java";

        char[] eachChars = sentence.toCharArray();

        String[] eachWords = sentence.split(" ");
        int[] resultArr = returnBoysVsGirlsResult();
        System.out.println(Arrays.toString(resultArr));
    }
    //create a method that return int array returnBoysVsGirlsResult
    public static int[] returnBoysVsGirlsResult(){
         int[] boysGirlsCount = {57, 57};
         return boysGirlsCount;

    }
}
