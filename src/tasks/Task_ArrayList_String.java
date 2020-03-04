package tasks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Task_ArrayList_String {
    public static void main(String[] args) {
        System.out.println(nameCharsToList("Sumeyye"));
        List<Character> resultList = nameCharsToList("Muge");
        resultList.add('M');// adds M after the last index to the List
        System.out.println("resultList = " + resultList);

    }
    public static List<Character> nameCharsToList(String name){
        List<Character> charLst = new ArrayList<>();
        for (int i = 0; i < name.length(); i++) {
            charLst.add(name.charAt(i));
        }
        return charLst;
    }
}
