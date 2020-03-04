package OfficeHour;

import java.util.Arrays;
import java.util.Scanner;

public class Practice_12_10_1 {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        System.out.println("Please enter your 3 languages");
        String l1 = scan.next();
        String l2 = scan.next();
        String l3 = scan.next();

        String[] languages = {l1, l2, l3};
        System.out.println(languages[2]);
        //1. print all values
        System.out.println(Arrays.toString(languages));

        //2. print all values using for each loop
        for (String lan: languages) {
            System.out.println("Here is your language " + lan);

            //3. printing backwards
            for (int languagesIndex = languages.length - 1; languagesIndex >= 0; languagesIndex++) {
                System.out.println(languages[languagesIndex]);

            }
        }


    }
}
