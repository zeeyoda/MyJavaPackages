package ziyodaPractice;

import java.util.Arrays;

public class Repl_126 {
    public static <eachSplitWord> void main(String[] args) {
        /*String sentence = "Everything is awesome in this wonderful world";
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
        System.out.println("The longest word is "+ longestWord);*/

        //Write a program that will find out shortest words in the given string str.
        // If there are few words that are evenly short, print them all.
        // Use split method in order to split str string variable and create an array of strings.
        // Print array with Arrays.toString() method. Sort array before printing.
        //Split values by comma: split(", ");
        //input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray
        //output: [cat, old, ray]
        String allWords = "olive, fish, pursuit, old, warning, python, java, coffee, cat, ray";
        String[] allWordsSplit = allWords.split(" ");
        String shortestWord = "";
        String allShortestWord = "";
        int count = 0;
        for (int x=0; x< allWordsSplit.length; x++){
            if(allWordsSplit[x].length()<shortestWord.length()){
                shortestWord = allShortestWord;
            }
        }
        for (int i = 0; i < allWordsSplit.length; i++) {
           if(shortestWord.length()==allWordsSplit[i].length());
           shortestWord=allWordsSplit[i];
           allShortestWord = allShortestWord+allWordsSplit[i];

            }
        }
        /*System.out.println(count);
        String[] shortestWords = allShortestWord.split(",");
        Arrays.sort(shortestWords);
        System.out.println(shortestWords);*/


        }





