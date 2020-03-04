package day33;

import java.util.Scanner;

public class Return_Will_Terminate_TheMEthon_Scanner_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number more than 10");
        int num = scan.nextInt();
        if (num < 10) {
            // you can use return keyword to get our of the method in void method
            // as long as you dont return a value.
            //below line is only thing you can do. no value, get out.
            return;

        }
        System.out.println("Happy Holidays");
        System.out.println("2 days off! Yeay");
    }
}
