package day18;

import java.util.Scanner;

public class SmartLockOpener {
    public static void main(String[] args) {

        //smart lock door opener has a password
        //unless u enter correct password
        //it keeps locking you out
        //assuming correct password is B15
        //keep asking until user enter correct one
        Scanner scan = new Scanner (System.in);
        System.out.println("Knock knock!");
        System.out.println("What is the password");

        String password = scan.next();
        while ( ! password.equalsIgnoreCase("B15")){
       // while  ( ! password.equals("B15")) {
            System.out.println("Wrong password, enter again");
            password = scan.next();
        }
        System.out.println("Open Sesame");

        }
    }

