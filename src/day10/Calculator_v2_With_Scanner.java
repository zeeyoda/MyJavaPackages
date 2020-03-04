package day10;

import java.util.Scanner;

public class Calculator_v2_With_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char operation = ' ' ;
        System.out.println("Which operation did you choose?");
        operation = scan.next().charAt(0);
        int num1 = 30;
        int num2 = 20;

        switch (operation) {

            case '+' :
                System.out.println("You chose addition. Result is "+(num1+num2));
                break;
            case '-'  :
                System.out.println("You chose subtraction. Result is "+(num1-num2));
                break;
            case '*' :
                System.out.println("You chose multiplication. Result is "+(num1*num2));
                break;
            case '/' :
                System.out.println("You chose division. Result is "+(num1/num2));
                break;




        }












    }
}
