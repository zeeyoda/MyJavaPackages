package day59;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class ExceptionPractice2 {
    public static void main(String[] args) {

        System.out.println("The start");
        String str = "Furkan";

        Scanner scan  = new Scanner(System.in);
        System.out.println("Character at what index you want to get from Furkan's name? ");

        try {
            int targetIndex = scan.nextInt();
            System.out.println("name = " + str.charAt(targetIndex));

        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Entry is out of bound.");
            System.out.println("Enter between 0 and "+(str.length()-1));
        }catch ( InputMismatchException e) {
            System.out.println("Input mismatch happened and got caught. Please enter a number.");
            System.out.println("Here is what you get if you enter 0 "+str.charAt(0));
        }
        System.out.println("str = "+str);
        System.out.println("The end.");
    }
}
