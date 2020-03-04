package ziyodaPractice;

import java.util.Scanner;

public class Repl_86 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String name;
        String guestName;
        String answer;
        System.out.println("Please enter guest name:");
        name=input.next();
        System.out.println("Do you want to enter new guest name:");
        answer=input.next();
        System.out.println("Please enter guest name:");
        guestName=input.next();
        System.out.println("Do you want to enter new guest name:");
        answer=input.next();
        if(answer.equalsIgnoreCase("no")) {

        }

        System.out.println("Guest's list: " + name + ", " + guestName);

    }
}
