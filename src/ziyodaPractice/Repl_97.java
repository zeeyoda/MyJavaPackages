package ziyodaPractice;

import java.util.Scanner;

public class Repl_97 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String word = scan.next();
        int count=0;
        for (int i = 0; i < word.length()-3; i++) {

            if (word.substring(i,i+4).startsWith("java")) {
                count++;
            }
        }
        System.out.println(count);
        }
    }

