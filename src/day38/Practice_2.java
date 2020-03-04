package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice_2 {
    public static void main(String[] args) {
        List<String> myLst = Arrays.asList("apple", "banana", "pear", "orange");

        ArrayList<String> hisLst = new ArrayList<>(myLst);
        hisLst.add("kiwi");
        hisLst.add("plum");

        System.out.println(hisLst);

        List<String> newLst = Arrays.asList("grapes", "blueberries","strawberries","apricot", "Apple", "pear", "orange");

        //adding one List to another list
        //I want to add everything from newLst to hisLst

        hisLst.addAll(newLst);
        System.out.println("Combines list = "+hisLst);

    }
}
