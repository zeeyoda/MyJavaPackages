package ziyodaPractice;

import java.util.Scanner;

public class Last_Character {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String word = scan.next();
        int lastIndex=word.length()-1;
        System.out.println(word.substring(word.length()-1));
    }
}
