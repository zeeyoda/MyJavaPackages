package day06;

public class CoinConverter {
    public static void main(String[] args) {
        //you have 200 cents
        //how many dimes you can get = 10c
        //how many quarter you can get 25c
        //how many nickels you can get 5c
        //how many pennies you can get

        int cents = 200;

        // you have to buy candle for .74cent
        //what would be your remainder
         cents -= 74; // 126 cents after spending 74 cents for a candle
        int quarter = cents/25;
        int change =  cents%25; // 126/25 --..5, 1 is the remainder

        System.out.println(quarter);
        System.out.println(change);

        //now I want to try to calculate dime for same money after purchase in dime

        int dime = cents/10 ; //-->> 126/10 we get 12 and remainder 6
        //how much cents I have after getting dime 126%10 -->>

        int penny = cents%10 ; // remainder 6
        System.out.println(dime);
        System.out.println(penny);






    }
}
