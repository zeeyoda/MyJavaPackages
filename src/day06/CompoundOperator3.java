package day06;

public class CompoundOperator3 {
    public static void main(String[] args) {
        int bankBalance = 1140;


        System.out.println("I have the half of it : " + bankBalance);
        //bankBalance = bankBalance/2 ;
        bankBalance /=2;
        System.out.println("Now my balance is " + bankBalance);
        //bankBalance = bankBalance % 500;
        bankBalance %=500;


        System.out.println("I want to divide the balance by 500 and keep the remainder in my pocket");
        System.out.println("the remainder is : " + bankBalance);




}


}



