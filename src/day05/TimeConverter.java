package day05;

import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
        Task 1
        *create an interactive program to ask user for a day and generate minute the day has
         */

        /*
        Task 2
        *create an interactive program to ask user for hourly wage
        * generate yearly salary
        * assume that he works 2080 hours in a year
         */

        System.out.println("How many hours are there in a day ? ");
        int hour = scan.nextInt();
        int minute = (hour*60) ;
        System.out.println("The " + hour + " hours equal to " + minute + " minutes " );
        System.out.println(" How many minutes did you read for today? ");
        int minutes = scan.nextInt();
        int second = (minutes*60);
        double minuteToHour = (minutes/60.0);
        System.out.println("You read for  " + second + " seconds or " + minuteToHour + " hours today." );





    }
}
