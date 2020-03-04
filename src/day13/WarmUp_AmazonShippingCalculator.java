package day13;

public class WarmUp_AmazonShippingCalculator {
    public static void main(String[] args) {
        //Amazon had 2 type of members. Prime member gets free shipping
        //regular member gets free shipping only if order is more than $25
        //otherwise regular member pays $5 shipping fee

        String memberType = "Prime member";
        double amount = 15.99d ;
        int shippingFee = 0 ;

        //first I want to check if it's a Prime Member
      /*  if (memberType.equalsIgnoreCase("PRIME MEMBER")) {
            System.out.println("Your get one day free shipping");
            System.out.println("Your final price is " + amount);
        }else if(amount > 25) {
            System.out.println("You are not a prime member, but your order is more than $25");
            System.out.println("You get free shipping");
        }else{
            System.out.println("Do you want to sign up for Prime Membership");
            shippingFee = 5 ;
            amount = amount + shippingFee; // amount += shipping fee
            System.out.println("Your final amount is " + amount);
*/
           /* if (memberType.equalsIgnoreCase("PRIME MEMBER")) {
                System.out.println("Your get one day free shipping");
                System.out.println("Your final price is " + amount);
            }else if(!memberType.equalsIgnoreCase("PRIME MEMBER") && > 25 ) {
                System.out.println("You are not a prime member, but your order is more than $25");
                System.out.println("You get free shipping");
            }else{
                System.out.println("Do you want to sign up for Prime Membership");
                shippingFee = 5 ;
                amount = amount + shippingFee; // amount += shipping fee
                System.out.println("Your final amount is " + amount);

       */ }
    }

