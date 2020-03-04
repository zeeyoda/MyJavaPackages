package day10;

public class Calculator_v2 {
    public static void main(String[] args) {
        //declare 2 number as int1, int2 and assign value
        //declare and assign value for char variable called operator +-/*
        //according to operator, print the result of the operator

        int num1 = 30;
        int num2 = 15;
        char operator = '/';
        switch(operator){
            case '+' :
                System.out.println(num1+num2);
                break;
            case '-' :
                System.out.println(num1-num2);
                break;
            case '*' :
                System.out.println(num1*num2);
                break;
            case '/' :
                System.out.println(num1/num2);
                break;
            default :
                System.out.println("Invalid operation");
        }
    }
}
