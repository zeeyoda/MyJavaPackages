package ziyodaPractice;

import java.util.Scanner;

public class Repl_100 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
         // first find first occurrence of bread str.indexOf("bread");
        // then find last occurrence of bread --> str.lastIndexOf("bread");

        int first = str.indexOf("bread");
        int last = str.lastIndexOf("bread");
        if(first != last) {
            System.out.println(str.substring(first+5, last));

        }else {
            System.out.println("nothing");
        }
         }
    }

