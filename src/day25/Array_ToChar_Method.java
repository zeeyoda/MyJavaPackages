package day25;

import java.util.Arrays;

public class Array_ToChar_Method {
    public static void main(String[] args) {
        String namez = "Ziyoda";
        // turn this into charArray using to CharArray() method
        char[] namezChars = new char[namez.length()];
        //namezChars[0]=namez.charAt[0];
        //namezChars[1]= namez.charAt[1];

        //using for loop to fill up the array one by one
        for (int x = 0; x < namezChars.length; x++) {
            namezChars[x] = namez.charAt(x);
        }
        System.out.println("namezChars " + Arrays.toString(namezChars));

        //easy short cut is below
        char[] namesChars2 = namez.toCharArray();
        System.out.println(Arrays.toString(namesChars2));
        System.out.println("----------------------------------------");

        String parents = "Ayam va Dadam: Hadisahon va Abduvohid";
        //String parents = "Hadisahon";
        char[] parentsChar = new char[(parents.length())];//

        for (int index = 0; index < parentsChar.length; index++) {
            parentsChar[index] = parents.charAt(index);
        }
        System.out.println(Arrays.toString(parentsChar));
    }
    }


