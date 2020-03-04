package day18;

import java.util.Scanner;

public class GiveMeMoney {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give me Money");
        int x = 0;
        while(x != 100 && x!=50){
            System.out.println("That is not what I want. Please give me what I want!");
            x=scan.nextInt();
        }
        System.out.println("Thank you! I wanted either 50 or 100 and I got it:)");    }
}
