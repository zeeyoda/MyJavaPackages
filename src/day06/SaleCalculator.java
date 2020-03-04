package day06;

import java.util.Scanner;

public class SaleCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double origPrice;
        double discountPercentage;
        double salePrice;


        System.out.println(" What is the original price? ");
        origPrice = scan.nextDouble();

        System.out.println(" What is the discount percentage? ");
        discountPercentage = scan.nextDouble();

        salePrice = origPrice-origPrice*discountPercentage;

        System.out.println(" Regular price is " + origPrice + "$ , discount is " +discountPercentage
        + " you got deal for " + salePrice +"$");



    }


}
