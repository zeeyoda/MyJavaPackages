package day16;

import java.util.Scanner;

public class GiveMe5 {
    public static void main(String[] args) {
        //I want to ask user to enter a number
        //I will keep asking until user actually enters number 5

        Scanner scan = new Scanner(System.in);
        //System.out.println("Give me FIVE");
      /*  int userNumber = scan.nextInt();

        if (userNumber != 5) {
            System.out.println(" You did not give me five");
        }
        */
      int userNumber = 0;
       while( userNumber != 5){
           System.out.println("Give me FIVE");
           userNumber = scan.nextInt();
       }
        System.out.println("End of the program");
    }
}
