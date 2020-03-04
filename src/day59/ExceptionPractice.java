package day59;

import java.util.Scanner;

public class ExceptionPractice {
    public static void main(String[] args) {

        //This program will get certain character from Furkan's name
        //according to the index use provides
        System.out.println("The start");
        String str = "Furkan";

        Scanner scan  = new Scanner(System.in);
        System.out.println("Character at what index you want to get from Furkan's name? ");
        int targetIndex = scan.nextInt();
        try {
            System.out.println("name = " + str.charAt(targetIndex));
        //}catch (Exception e){ //--> this is general catch block  that can catch any IS-A sub type Exception class

            //below is a specific catch block to only catch StringIndexOutOfBoundsException and take action accordingly
        }catch (StringIndexOutOfBoundsException e){

            //getMessage() is a method from Exception class. It provides some more details about exception object
            System.out.println("Message from getMessage() method "+e.getMessage());
            System.out.println("Something unusual happened.");
        }

        System.out.println("str = "+str);




       // System.out.println("100th character of Furkan's name ="+str.charAt(100));

        //Exceptions are object, so it had its own class
        //We can create object from the Exception classes just like any other concrete class
        //StringIndexOutOfBoundsException obj = new StringIndexOutOfBoundsException();
        //System.out.println(obj.toString());

        System.out.println("The end.");
    }
}
