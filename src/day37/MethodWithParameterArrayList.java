package day37;

import java.util.ArrayList;
import java.util.List;

public class MethodWithParameterArrayList {
    public static void main(String[] args) {
        /**
         * create a list that accept a List of String as an argument
         * same thing as a method that has List of String parameter
         * and print out each item in the list vertically
         */
        List<String> nameLst =new ArrayList<String>();
        nameLst.add("Qalbinur");
        nameLst.add("Ruzi");
        nameLst.add("Sabahiddin");
        nameLst.add("Guzelnurin");
        printAList(nameLst);

        String resultLongest = getLongestElement(nameLst);
        System.out.println("resultLongest = "+resultLongest);
    }
    public static String getLongestElement(List<String> nameLst){
        String longestName = " ";
        for (int i = 0; i < nameLst.size(); i++) {
            String eachName = nameLst.get(i);
            // > will give you the first longest name if you have more than one
            // >= will give you the last longest name if you have more than one
            if(eachName.length()>=longestName.length()){
                longestName=eachName;
            }
        }
        return longestName;
    }
    public static void printAList(List<String> lst){
        for (String each: lst) {
            System.out.println("each = " + each);

        }

    }
}
