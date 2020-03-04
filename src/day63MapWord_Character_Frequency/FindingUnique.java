package day63MapWord_Character_Frequency;

import java.util.*;

public class FindingUnique {

    public static void main(String[] args) {
        String str = "The new link for joining class will require you to login to Okta, if it asks you to sign in"+
                ", please just click on it, it will take you to Okta sign in page, once you sign in with Okta"+
                " Then you will be able to join right away. PLEASE DO NOT TRY TO REGISTER, THE LINK IS ALREADY IN THE EMAIL "+
                "Click to join";

        //how many unique character showed up in  above sentence
        //for example if you have AABBCC ---- you should get ABC

        //One way to do it
        //first find data structure that automatically remove duplicate (create HashSet object with type Character
        //first create a HashSet object with type Character
        //iterate over each character in above String
        //then add it to the HashSet so it can remove the duplicate for us

        Set<Character> mySet = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            mySet.add(str.charAt(i));

        }
        System.out.println("Ziyoda created "+mySet);
        System.out.println("Ziyoda created length of string "+str.length());
        System.out.println("Ziyoda created size of hashset "+mySet.size());

        for (Character eachChar:mySet) {
            System.out.println("Each unique char "+eachChar);

        }

        Set<Character> myLinkedHashSet = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) {
            myLinkedHashSet.add(str.charAt(i));
        }
        System.out.println("MyLinkedHashSet = "+myLinkedHashSet);





        Set<Character> charSet = new HashSet<>();//HashSet prints in ascending order
        for (int i = 0; i < str.length() ; i++) {
            charSet.add((str.charAt(i)));

        }
        System.out.println("How many total characters total = "+str.length());
        System.out.println("Total unique charSet characters = " + charSet.size());
        System.out.println("charSet = " + charSet);
        System.out.println("=======================================================================");


        Set<Character> charSet1 = new LinkedHashSet<>();//
        for (int i = 0; i < str.length() ; i++) {
            charSet1.add((str.charAt(i)));

        }
        System.out.println("How many total characters total = "+str.length());
        System.out.println("Total unique charSet characters = " + charSet1.size());
        System.out.println("charSet = " + charSet1);

        System.out.println("==================================================================");
        Set<Character> charSet2 = new TreeSet<>();//HashSet prints in ascending order
        for (int i = 0; i < str.length() ; i++) {
            charSet2.add((str.charAt(i)));

        }

        System.out.println("TreeSet Total unique charSet characters = " + charSet2.size());
        System.out.println("TreeSet charSet = " + charSet2);


    }
}
