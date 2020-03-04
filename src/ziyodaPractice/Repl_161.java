package ziyodaPractice;

import java.util.Scanner;

public class Repl_161 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);
    }

    public static void isPalindrome(int num){

        int r = 0;
        int sum = 0;
        int t=num;
        boolean isPalindrome = true;
        while(num>0) {
            r = num % 10;
            sum = (sum * 10) + r;
            num = num / 10;
        }
        if( t==sum) {
            System.out.println("Is this number a palindrome? "+isPalindrome);
        }else{
            System.out.println("Is this number a palindrome? "+!isPalindrome);


        }

    }
}
