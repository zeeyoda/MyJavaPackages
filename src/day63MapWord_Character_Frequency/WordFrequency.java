package day63MapWord_Character_Frequency;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    public static void main(String[] args) {

        //we want to solve this using the Map
        //because Map only can have unique key, so we can use it for unique words
        //first create Map object HashMap implementation

        //Loop through word array
        //Check if we already have the word in the key or not
        //If we do not have the key, it means we are entering for the first time
        //so the count will be 1, add using put method
        //else it means we already have it in the key
        //and replace the old count value by new count value by incrementing by one
        String str = "Finding words frequency sounds fun because fun comes in when you count Words "+
                "But How do I count the Words with what I already know previously "+
                "Do it and find out Words Words Words";

        String[] allWords = str.split(" ");
        System.out.println("word length = "+allWords.length);


        Map<String, Integer> wordCount = new HashMap<>();

//        for (int i = 0; i <allWords.length; i++) {
//            if(!wordCount.containsKey(allWords[i])){
//                wordCount.put(allWords[i], 1);
//            }else{
//                wordCount.replace(allWords[i], wordCount.get(allWords[i])+1);
//            }
//        }
//        System.out.println("Using for loop and counting the number of occurrence of each word "+wordCount+"\n");

        for(String eachWord: allWords){
            //if(wordCount.containsKey(eachWord)==false) {
                 if(!wordCount.containsKey(eachWord)){
                wordCount.put(eachWord, 1);
            }else{

//                     int newCount = wordCount.get(eachWord)+1;
//                     wordCount.replace(eachWord, newCount);
                wordCount.replace(eachWord, wordCount.get(eachWord)+1);
            }
        }
        System.out.println("Using for each loop - Counting the number of occurrence of each word in wordCount "+wordCount);
    }
}
