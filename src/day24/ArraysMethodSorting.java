package day24;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class ArraysMethodSorting {
    public static void main(String[] args) {
        int[] scores = {99,44,66,23,19,55};
        System.out.println(Arrays.toString(scores));
        System.out.println("Original first item value: "+ scores[0]);
        //for sorting an array in ascending order -- low to high
        //sort -->> Array.sort(yourArrayHere)
        Arrays.sort(scores);
        //so what happened to the original order? it is gone
        //we cannot get the original back
        //the original index of items has changed
        System.out.println(Arrays.toString(scores));
        //first item value
        System.out.println("first item value "+ scores[0]);

        char[] nameChars = {'D', 'G','a','C','8'};
        System.out.println("nameChars = " +Arrays.toString(nameChars));
        Arrays.sort(nameChars);
        System.out.println("After sorting nameChars = "+ Arrays.toString(nameChars));
        //low to high order for character is decided by its ascii table value
        //in ascii table special characters come first, then numbers, then uppercase, then lower case


        System.out.println("-------------String sorting----------------------");
        String[] superHeroes = {"Batman", "Wonderwoman", "Captain America", "100", "9","09"};
        System.out.println("before sorting superHeroes "+Arrays.toString(superHeroes));
        Arrays.sort(superHeroes);
        //in string order only the first character matters
        System.out.println("after sorting superHeroes "+Arrays.toString(superHeroes));

        System.out.println("---Boolean sorting-----SORT METHOD DOES NOT WORK FOR BOOLEAN ARRAY-----------");
        boolean[] fiveSwitchOnOff = {true, false, true, false, true, true};
        System.out.println("Arrays.toString(fiveSwitchOnOff) = " + Arrays.toString(fiveSwitchOnOff));

    }
}
