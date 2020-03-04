package day10;

public class Calculator_v2_With_IfElse {
    public static void main(String[] args) {
        System.out.println("Please choose an operator!");

        double num1 = 55D;
        double num2 = 12D;
        char operation = '/';

        if(operation == '+') {
            System.out.println("You chose addition. Result is " + (num1 + num2));
        }else if( operation == '-') {
            System.out.println("You chose subtraction. Result is " + (num1 - num2));
        }else if (operation == '*') {
            System.out.println("You chose multiplication. Result is " + (num1 * num2));
        }else if (operation == '/') {
            System.out.println("You chose division. Result is "+(num1/num2));
            System.out.println("Great selection. Now do the opposite operation in your head!");

        }


    }
}