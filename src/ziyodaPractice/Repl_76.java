package ziyodaPractice;

import java.util.Scanner;

public class Repl_76 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();


        if (email.contains("_")) {
            int underScoreIndex = email.indexOf("_");
            int atSignIndex = email.indexOf("@");
            System.out.println(email.substring(underScoreIndex+1, atSignIndex)+"_"+
                    email.substring(0,underScoreIndex)+"@"+(email.substring(atSignIndex+1,email.length())));
             } else if (!email.contains("_")) {
            System.out.println(email);
        }
        }
    }

