package day25;

import java.util.Arrays;

public class String_Split_Method {
    public static void main(String[] args) {
        String sentence = "I love Java";

        //what does this method do
        //split(bySomething) is a method of String that split string into multiple part

        String[]allWords=sentence.split(" ");
        System.out.println("allWords = " + Arrays.toString(allWords));
        System.out.println("How many word do I have in this sentence? "+ allWords.length);

        //how do i get the last word of the sentence using this array I got from String
        System.out.println("Last word in this sentence is "+ allWords[allWords.length-1]);

        String sentence2 = "Everything is Awesome!!!";
        //split by e
        String[]splitBy_e_Arr = sentence2.split("e");
        System.out.println("Splitting sentence2 by letter 'e' = " + Arrays.toString(splitBy_e_Arr));
        for(String eachPiece: splitBy_e_Arr){
            System.out.println("Each piece is split as this "+eachPiece);
        }
        System.out.println("-------------------------------------------");
        //split this sentence by is
        String[] split_By_Is = sentence2.split("is");
        System.out.println("Splitting sentence 2 by 'is' "+ Arrays.toString(split_By_Is));
        for(String eachPart: split_By_Is){
            System.out.println("I split by 'is' using for each loop "+eachPart);
        }
    }
}
