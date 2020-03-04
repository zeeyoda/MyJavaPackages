package day18;

import java.util.Scanner;

public class GiveMe10$20$ {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int x = scan.nextInt();
        while ( !(x == 10 || x == 20)) {
            System.out.println("I dont want that");
            x = scan.nextInt();
        }
        System.out.println("Thanks, I will put it in my piggy bank");
        }
    }

