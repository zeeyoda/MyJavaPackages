package day05;

import java.util.Scanner;

public class HourlyWageCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How much do you make per hour ? ");
        int perHourRate = scan.nextInt();
        System.out.println("I make $" +  perHourRate + " per hour.");
        System.out.println(" How many hours do you work per year? ");
        int totalHoursPerYear = scan.nextInt();
        System.out.println("I make " + (totalHoursPerYear*perHourRate) + "$ " + " per year.");

            }
}
