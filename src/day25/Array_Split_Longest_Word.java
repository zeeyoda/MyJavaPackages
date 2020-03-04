package day25;

import java.util.Arrays;

public class Array_Split_Longest_Word {
    public static void main(String[] args) {

        String sentence = "Everything is awesome in this wonderful world";
        String[] allWords = sentence.split(" ");
        System.out.println("allWords = " + Arrays.toString(allWords));
        String longestWord = "";
        int maxCharCount = 0;
        //create a String variable longestWord to store my result
        //also create macCharCount variable to store my longest char count
        //I want to go through each and every word in String array
        //and check if the length of current word is more than longestWord
        //if it is I will assign the longestWord value to current word I am looking at

        for (String currentWord : allWords) {
            System.out.println("Current word is " + currentWord);
            if (currentWord.length() > longestWord.length()) {
                longestWord = currentWord;
            }
        }
        System.out.println("The longest word is "+ longestWord);
    }
}
