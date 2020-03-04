package day18;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        String password = scan.next();
        System.out.println("Please enter your password");
        password = scan.next();

        while(!password.equals("B15")){
        System.out.println("Wrong Password");
        password = scan.next();
    }
        System.out.println("Sim Sim Ochil");
}
}
