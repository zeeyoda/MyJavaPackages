package day08;

import java.util.Scanner;

public class WarmUpTask2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        /* Task2
         * Create a program to check your favorite number
         * create a variable called myFavorite number as int
         * Ask user to guess your favorite number
         * If user guessed right, favorite number is 300, then print BINGO
         * if not print, Try again later
         */
        System.out.println("What is my favorite number?");
        int myFavouriteNumber = scan.nextInt();
        if (myFavouriteNumber == 55) {

            System.out.println("Bingo!");
        } else
            System.out.println("You are not my best friend.");
    }
}