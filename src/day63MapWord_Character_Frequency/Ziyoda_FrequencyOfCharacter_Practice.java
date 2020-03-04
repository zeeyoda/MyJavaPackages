package day63MapWord_Character_Frequency;

import java.util.HashMap;
import java.util.Map;

public class Ziyoda_FrequencyOfCharacter_Practice {
    public static void main(String[] args) {

        String str = "hhhhhhhhhhhhttoogggggggggggggggmmmmmmmmmmmmmmccccccccccccccc";
        //get the frequency and store into map <Character, Integer>

        Map<Character, Integer>  charFreqs = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {

            char currentChar = str.charAt(i);

            if(!charFreqs.containsKey(str.charAt(i))){
                //if we don't have this ket yet, it means we are entering for the first time
                //the count will be 1
                System.out.println("Entering for the first time "+currentChar);
                charFreqs.put(currentChar, 1);
            }else{
                //if we come to this point it means this value already exists in the HashMap
                //so we update the count with 1 extra than existing count

                System.out.println("Incrementing the count of "+currentChar+" by one and "+
                        "replacing old count "+charFreqs.get(currentChar));
                //replacing the count value by incrementing existing value
                charFreqs.replace(currentChar, charFreqs.get(currentChar)+1);
            }
        }
        System.out.println("charFreqs = "+charFreqs);

    }
}
