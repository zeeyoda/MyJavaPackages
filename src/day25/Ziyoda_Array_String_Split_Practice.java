package day25;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Ziyoda_Array_String_Split_Practice {
    public static void main(String[] args) {
        String sentence = "I am very sleepy";
        String[] splitSen = sentence.split(" ");

        System.out.println("Split sentence is: "+ Arrays.toString(splitSen));

        System.out.println("How many words do I have in this sentence? = "+splitSen.length);

        System.out.println("The last word of this array is: "+splitSen[splitSen.length-1]);

        String[] splitSenE = sentence.split("e");

        System.out.print(Arrays.toString(splitSenE));
        for (String eachSplitE :  splitSenE) {
            System.out.println("Split by e looks like this: "+eachSplitE);

        }
    }
}
