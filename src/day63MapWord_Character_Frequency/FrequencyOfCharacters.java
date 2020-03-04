package day63MapWord_Character_Frequency;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "AAAAAAAABBBBBBBBCCCRDDDD";

        //Get the frequency of character and store into map

        Map<Character, Integer> charFreq = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if(!charFreq.containsKey(str.charAt(i))){
                System.out.println("Entering for the first time");
                charFreq.putIfAbsent(str.charAt(i),1);
            }else{
                //if we come to this point it means it has already showed up
                //so we update the count with 1 extra than existing count
                charFreq.replace(str.charAt(i), charFreq.get(currentChar)+1);
            }

        }
    }
}
