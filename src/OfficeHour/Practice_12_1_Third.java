package OfficeHour;

import java.util.Scanner;

public class Practice_12_1_Third {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //             01234567890
        //String name = "Arya Stark";

        //getting each character using charAt(index)
        //generate sequential number 0 -->> 10

        String name = scan.nextLine();
        int x = 0 ;
        if(x < name.length()) {
            System.out.println("index: " + x );
            System.out.println(name.charAt(x));
            ++x;

        }

    }
}
