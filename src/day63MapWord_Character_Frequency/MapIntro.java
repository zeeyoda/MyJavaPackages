package day63MapWord_Character_Frequency;

import java.util.HashMap;
import java.util.Map;

public class MapIntro {
    public static void main(String[] args) {

        //Compared to List, Set which store single element per item
        //Map store key-value pair per item
        //That's why we need to put data type inside <>
        //one for the key and one for the value

        Map<String, String> nameAndState = new HashMap<>();

        Map<Integer, String> groupNumLeaderNamePair = new HashMap<>();

        Map<String, Double> groceryNameAndPrice = new HashMap<>();

        Map<String, Boolean> voterAndEligibilityPair = new HashMap<>();

        Map<String, Integer> gameNameAndScoreMap = new HashMap<>();

        Map<Byte, Character> questionNumAndCorrectAnswer = new HashMap<>();

    }
}
