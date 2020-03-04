package day17;

import java.util.Scanner;

public class Reverse_Name_Printer_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter your name");
        String name = scan.nextLine();
        // get your name printed in reversed order
        // assuming we dont know the length

        // find out the location of your last character of your name
        // pick your last character of your name according to the location
        // then keep shifting the location to pick until first character
////                     01234567   index =  count - 1
//        String name = "Birnigar";
//        //             12345678   count = name.length()
        System.out.println("ENTER YOUR NAME !!");
         name = scan.nextLine();

        //int lastCharacterIndex = name.length()-1 ;
        int x = name.length() - 1;
        while (x >= 0) {
            System.out.println("index " + x + " : " + name.charAt(x));
            --x;

        }

    }
}
