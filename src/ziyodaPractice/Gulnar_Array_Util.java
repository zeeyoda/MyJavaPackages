package ziyodaPractice;

import java.util.Arrays;

public class Gulnar_Array_Util {
    public static void main(String[] args) {
        //Arrays.toString method
        /*String[] name = {"love","bird","name"};
        System.out.println(Arrays.toString(name));
        int[] num = {3, 7, 1, 6};
        System.out.println(Arrays.toString(num));

        //Arrays.sort method, we have to sort first and then print
        String[] names = {"love","bird","name","Ab"};
        String names2 = (Arrays.toString(names));
        for (int i = 0; i < names2.length(); i++) {
            System.out.println("Character at " + i + " is "+names2.charAt(i));

        }*/
       /* String[] namez = {"Ziyoda", "Adil", "Azat", "Saida", "Sabira", "Ablatt"};
        System.out.println(Arrays.toString(namez));
        String ablattNameIndex = namez[namez.length-1];
        for (String eachName: namez){
            System.out.print(eachName);
            if (!eachName.equals(ablattNameIndex)) {
                System.out.print(",");
            }
        }*/
        char[] marker = {'a','z','g','b'};
        String marker1 = Arrays.toString(marker);
        for(char eachMarker: marker) {
            System.out.print(eachMarker);
            if (eachMarker != (marker[marker.length - 1])) {
                System.out.print(" * ");
            }
        }



    }
}
