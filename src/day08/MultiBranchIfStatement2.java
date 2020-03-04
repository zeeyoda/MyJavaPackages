package day08;

import java.util.Scanner;

public class MultiBranchIfStatement2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your favorite number? ");
        int myFavNumber = scan.nextInt();
        if (myFavNumber >= 100) {
            System.out.println("Way too high, go down");
        } else if (myFavNumber >= 60) {
            System.out.println("Come down more!");
            System.out.println("Let me give you a very easy hint. It is between 54 and 56. ");

        }else if(myFavNumber==55) {
            System.out.println("Bingo");
        }



        }
    }


    /* Task2
         * Create a program to check your favorite number
         * create a variable called myFavorite number as int
         * Ask user to guess your favorite number
         * If user guessed right,then print BINGO
         * if not print, Try again later
         */

