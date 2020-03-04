package day06;

import java.util.Scanner;

public class ScannerMultipleWord1 {
    public static void main(String[] args) {
        Scanner blabla = new Scanner (System.in);
         //System.out.println("WHat is your name? ");
         //nextLine method of Scanner is used to capture whole

        //String name = blabla.nextLine();
         //System.out.println(" You have entered " + name);

         /*Task4
         use nextLine to ask your bio, your name, city you live in, including, state,
         what is your street address
          */

         System.out.println(" what is your name ?");

         String name = blabla.nextLine();
         System.out.println("What is your address? ");
         String address = blabla.nextLine();
         System.out.println("What city do you live in? ");
         String city = blabla.nextLine();
         System.out.println("what state do you live in? ");
         String state=blabla.nextLine();


    }
}
