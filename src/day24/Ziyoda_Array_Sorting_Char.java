package day24;

import jdk.swing.interop.SwingInterOpUtils;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ziyoda_Array_Sorting_Char {
    public static void main(String[] args) {

        int[] scores = {90, 44, 65, 98, 102, 55};
        System.out.println(Arrays.toString(scores));
        System.out.println("First index of scores "+scores[0]);
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));
        System.out.println("First index of scores after sorting "+scores[0]);

        System.out.println("----------------character sorting------------------");
        char [] nameChars = {'Q',' ','o','G','9','F'};
        System.out.println(nameChars);
        System.out.println("Printing char array in Arrays.ToString before sorting "+Arrays.toString(nameChars));
        Arrays.sort(nameChars);
        System.out.println("Printing nameChars array after sorting "+Arrays.toString(nameChars));

        System.out.println("-------------------String Sorting---------------------");
        String[] names = {"Ziyoda","Otabek","Iroda","Zohida","Mustafa","100","99"};
        System.out.println("Array names before sorting "+Arrays.toString(names));
        Arrays.sort(names);
        System.out.println("After sorting the String names "+Arrays.toString(names));

        System.out.println("----------------Boolean sorting------------------------");
        boolean[] fiveSwitchOnOffs = {true, false, false, true, true};
        System.out.println("Before sorting boolean array "+Arrays.toString(fiveSwitchOnOffs));
        //arrays.sort doesn't work for boolean array, as JDK did not create one for boolean array

    }

}
