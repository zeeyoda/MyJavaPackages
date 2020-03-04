package ziyodaPractice;

import java.util.Scanner;

public class RemainderPractice {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        int coupon;
        System.out.println("Enter number of coupons:");
        coupon = scan.nextInt();
        int candy = (coupon/10);
        int gumball = (coupon%10/3);
        if( coupon>=10){
            System.out.println("Number of Candies: " + candy);
            System.out.println("Number of Gumballs: " + gumball);
        }else if (coupon <=2){
            System.out.println("Not enough coupons");
        }
    }
}
