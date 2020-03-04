package ziyodaPractice;

import java.util.Scanner;

public class Repl77 {

    public static void main(String[] args) {

        /*Input: craig_federighi@apple.com
        Output:
        First name: Craig
        Last name: Federighi
        Domain: apple
        Top-Level Domain: com*/
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        //craig_federighi@apple.com

        int a = email.indexOf("_");
        int b = email.indexOf("@");
        int c = email.indexOf(".");
        System.out.println("First name: "+ email.substring(0,1).toUpperCase()+email.substring(1,a));
        System.out.println("Last name: "+email.substring(a+1,a+2).toUpperCase()+email.substring(a+1,b));
        System.out.println("Domain: "+email.substring(b+1,c));
        System.out.println("Top-Level Domain: "+email.substring(c+1, email.length()));




    }
}
