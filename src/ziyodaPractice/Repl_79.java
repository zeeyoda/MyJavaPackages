package ziyodaPractice;

import java.util.Scanner;

public class Repl_79 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();


        if(word.charAt(0)=='x' | word.charAt(0)=='X' &&
                word.charAt(word.length()-1)=='x' | word.charAt(word.length()-1) =='X'){
            System.out.println(word.substring(1, word.length()-1));
        }else if(word.charAt(0)!='x' | word.charAt(0) != 'X' &&
                word.charAt(word.length()-1)=='x' |word.charAt(word.length()-1)=='X'){
            System.out.println(word.substring(0, word.length()-1));
        }else if(word.charAt(0)=='x' | word.charAt(0)=='X' &&
                word.charAt(word.length()-1) !='x' | word.charAt(word.length()-1 )!='X'){
            System.out.println(word.substring(1, word.length()));
        }else {
            System.out.println(word);
        }

        }
    }


