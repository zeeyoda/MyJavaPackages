package day05;
import java.util.Scanner;

public class TheScanner {

    public static void main(String[] args) {

        //ask user for name
        //capture the result
        // print your name is this
        // ask user for birth year
        //capture the result
        //print the age
        //ask user for their height
        //capture the result
        //print the height

        //create scanner object
        Scanner scan = new Scanner(System.in);
        // you can name your variable anything you want
        //in below case we are calling it a scan
        //Scanner is date type, scan is the name, new Scanner(System.in) is the value
        System.out.println("What is your birth year : " );
        int birthYear = scan.nextInt();
        System.out.println("My name is " + birthYear);
        System.out.println(" What is your age : ");
        int age = scan.nextInt();
        System.out.println("I am " + age + " years of age");
        System.out.println("What is your height : ");
        double height = scan.nextDouble();
        System.out.println("I am " + height);
        System.out.println("How much money do you have ? ");
        float money = scan.nextFloat();
        System.out.println(" I have " + money + " dollars");
        System.out.println("What is your name :");
        //String name = "Sam" ;
        String name = scan.next();
        System.out.println("My name is  " + name );



    }
}
