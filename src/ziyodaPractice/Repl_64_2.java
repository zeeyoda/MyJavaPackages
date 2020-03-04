package ziyodaPractice;

import java.util.Scanner;

public class Repl_64_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

       /* int num = word.length();
         if ( num>=3 && word.length()%2 ==1){
            System.out.println(word.charAt(word.length()/2-1) + word.charAt(word.length()/2) + word.charAt(word.length()/2+1));
        }*/
        int num = word.length();
        int charCount = word.length()-1;
        if (num == 1) {
            System.out.print(word);
            System.out.print(word);
            System.out.print(word);
        } else if (num >= 3) {
            if (num % 2 == 1) {
                System.out.print(word.charAt(num / 2));
            }
            } else if(num>=4 && num%2 ==0){
            System.out.println(word.substring(charCount/2-1)+""+word.substring(charCount/2));

                System.out.print(word.charAt((num / 2) - 1) + "" + word.charAt(num / 2));
            }


            }

        }


