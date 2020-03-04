package day63MapWord_Character_Frequency;

import java.util.HashMap;
import java.util.Map;

public class MapAddingElements {
    public static void main(String[] args) {

        Map<String, Integer> nameAgePair = new HashMap<>();

        //adding elements : put
        nameAgePair.put("Ziyoda", 31);
        nameAgePair.put("Ablatt", 47);
        nameAgePair.put("Sabira", 12);
        nameAgePair.put("Saida", 11);
        nameAgePair.put("Azat", 8);
        nameAgePair.put("Adil", 8);
        nameAgePair.put("Saniya", 22);
        System.out.println("nameAgePair = " + nameAgePair);
        System.out.println("nameAgePair size = "+nameAgePair.size());
        //key of the map is unique, it doesn't accept duplicates
        //here since we already have Ziyoda --->> it will replace the old value with new one
        nameAgePair.put("Ziyoda", 40);

        System.out.println("Test Ziyoda 40 = "+nameAgePair);

        //how do u get a value according to the key
        System.out.println("Getting Ziyoda's age = "+nameAgePair.get("Ziyoda"));

        //how do i check if key already exists
        //containsKey method
        System.out.println("nameAgePair.contains(\"Zamira\") = "+nameAgePair.containsKey("Zamira"));

        //how do I only add new items if it doesn't already exist

        nameAgePair.putIfAbsent("Sabira", 20);// this comes with Java8 edition
        System.out.println("After checking if sabira has been added or not "+nameAgePair);

        //updating the element in the Map using replace method
        nameAgePair.replace("Azat", 9);
        System.out.println("Azat should be 9 after replace  = " + nameAgePair.get("Azat"));
        //why dont we just use put()? What is the downside?
        //if I dont have that key, it will just add new once and thats not what we want, we only want to update

        //updating the value only if the old value equals to a specified value
        //only update Adil's age to 9 if it was 8
        nameAgePair.replace("Adil", 8, 9);
        System.out.println("nameAgePair.get(\"Adil\") = " + nameAgePair.get("Adil"));
        nameAgePair.replace("Ziyoda", 40, 18);
        System.out.println("nameAgePair.get(\"Ziyoda\")'s age after update = " + nameAgePair.get("Ziyoda"));

        //removing an entry
        nameAgePair.remove("Azat");

        //it is recommended not to use get method to check if u have the entry or not
        //because if you dont have the key, you will get null
        //but you will also get null if the value was actually null --{Azat=Null}
        System.out.println("Getting Azat after removing from nameAgePair = " + nameAgePair.get("Azat"));
        System.out.println("nameAgePair.containsKey(\"Azat\") = " + nameAgePair.containsKey("Azat"));


    }
}
