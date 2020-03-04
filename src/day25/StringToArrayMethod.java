package day25;

import java.util.Arrays;

public class StringToArrayMethod {
    public static void main(String[] args) {
        String name = "Alesya";

        // how would you store each and every character
        //to an char array from above name
        // without using method we are about to learn
        char[] nameChar = new char[name.length()];
       /*
        nameChar[0] = name.charAt(0);
        nameChar[0] = name.charAt(1);
        nameChar[0] = name.charAt(2);
        nameChar[0] = name.charAt(3);
        nameChar[0] = name.charAt(4);
        nameChar[0] = name.charAt(5);
        */
//      using for loop to fill ip the array one by one
        for (int x = 0; x < nameChar.length; x++) {
            //take each character of name and fill the char array values
            nameChar[x]=name.charAt(x);
        }
        System.out.println("nameChar = " + Arrays.toString(nameChar));

        char[] namesChar2 = name.toCharArray();
        System.out.println("nameChar2 = "+ Arrays.toString(namesChar2));




    }
        }




