package day09;

import java.util.Scanner;

public class EvenOddPractice {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int myNumber;
           System.out.println("What is your number? ");
           myNumber = scan.nextInt();
           System.out.println("Is it even or odd? ");
           if(myNumber%2==0){
               System.out.println("Your number is even");
           }else
               System.out.println("your number is odd");

    }

}
