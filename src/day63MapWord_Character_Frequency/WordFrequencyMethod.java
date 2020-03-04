package day63MapWord_Character_Frequency;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyMethod {
    public static void main(String[] args) {
        String str = "Fun Fun Fun Java Java is Ending Tomorrow Tomorrow No It is never Ending";

        System.out.println("getFrequencyMap(str) "+getFrequencyMap(str));
        //longer way to do this is below
        Map<String, Integer> theFrequency = getFrequencyMap(str);
        System.out.println("theFrequency = " + theFrequency);
    }
    //Why this method is static? So that it can be called directly in main t test
    //Can I  make it non-static? Yes you can, then you will need to create an object to call it
    //Can it be void? Yes it can be void
    //But here requirement is getFrequencyMap and return it to the caller;
    public static Map<String, Integer> getFrequencyMap(String str) {
        Map<String, Integer> wordFrepMap = new HashMap<>();

        String[] strSplit = str.split(" ");

        //for (String word : str.split(" ")) {//direct way instead of inserting strSplit in here
        for (String eachWord:strSplit) {

           if(!wordFrepMap.containsKey(eachWord)){
               wordFrepMap.put(eachWord, 1);
        }else{
               Integer oldCount = wordFrepMap.get(eachWord);
               wordFrepMap.replace(eachWord, wordFrepMap.get(eachWord)+1);
           }

        }

    return wordFrepMap;

}
}
