package day63MapWord_Character_Frequency;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class FindingCharacterThatShowedUpAtLeastOnce {
    public static void main(String[] args) {
        String str = "The new link for joining class will require you to login to Okta, if it asks you to sign in"+
                ", please just click on it, it will take you to Okta sign in page, once you sign in with Okta"+
                " Then you will be able to join right away. PLEASE DO NOT TRY TO REGISTER, THE LINK IS ALREADY IN THE EMAIL "+
                "Click to join";
        //turning String into String Array
        String[] eachCharStringArray = str.split("");
        System.out.println("eachCharStringArray = " + Arrays.toString(eachCharStringArray));

        //Then turn it into a List with Arrays.asList

        List<String> charLst = Arrays.asList(eachCharStringArray);

        //eventually create a HashSet object by copying everything inside this list=
        Set<String> charSet = new HashSet<>(charLst);
        System.out.println("charSet = "+charSet);


        //Short way


      //Set<Character> chars = new HashSet<>(Arrays.asList('A','A','A','A','A'));
        Set<String> charShortWay = new HashSet<>(Arrays.asList(str.split("")));
        System.out.println("charShortWay = " + charShortWay);


    }
}
