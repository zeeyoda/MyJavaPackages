package day18;

import java.util.Scanner;

public class Do_While_Shazam {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String magicWord;
        do {
            System.out.println("What is the magic word?");
            magicWord = scan.next();
        }while(!magicWord.equals("SHAZAM"));
        System.out.println(" Your are now a Super Hero!");
        }
    }
