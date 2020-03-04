package day30;

import java.util.Arrays;

public class Array_Split_Size_3 {
    public static void main(String[] args) {
        //Split method has 2 versions
        //1. Split by some separator and get whatever the count of item we get from the result
        //2. accepts 2 external data, one is the separator, another is the limit of your arrays size
        //so if you have 5 word in a sentence if you split by space and put the limit for 2
        //then you will get an array with size 2 -->>(first word, the rest of the sentence
        String sentence = "I love Java Java Java";
       // String[] wordsArray = sentence.split(" ");
        String[]   wordsArray = sentence.split(" ", 2);
        String[]   wordsArray7 = sentence.split(" ", 7);


        System.out.println("wordsArray = "+ Arrays.toString(wordsArray7));
       // System.out.println("wordsArray size = "+wordsArray.length);
    }
}
