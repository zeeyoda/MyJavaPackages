package ziyodaPractice;

import java.util.Scanner;

public class Repl_99 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();
        int strLength = str.length();
        int count = 0;

        String prefix = str.substring(0,n);
        int prefixLength = prefix.length();

        for (int i = 0; i < strLength - prefixLength  ; i++) {
            String currentChars = str.substring(i,i+prefixLength);
            if(currentChars.equalsIgnoreCase(prefix)){
                count++;
            }

        }
        System.out.println(count > 1);

    }
}

