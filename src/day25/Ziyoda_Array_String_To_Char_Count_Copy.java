package day25;

import java.util.Arrays;

public class Ziyoda_Array_String_To_Char_Count_Copy {
    public static void main(String[] args) {
        String name = "Muhammadqadir";
        char[] nameChar = name.toCharArray();
        int count = 0;
        for (char eachNameChar : nameChar) {
            if(eachNameChar=='a') {
                count++;
            }
            System.out.println("eachNameChar = " + eachNameChar);

        }
        System.out.println(count);

        Arrays.sort(nameChar);
        System.out.print(nameChar);

    }
}
