package day05;

import java.util.Scanner;

public class GroceryShopping {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*
    Task 5 : Grocery Shopping
    *   ask user whats the price of tomato and store it
        ask user how many tomato you want to buy and store it
    *   ask user whats the price of potato and store it
        ask user how many potato you want to buy and store it
    *   ask user whats the price of banana and store it
        ask user how many banana you want to buy and store it

        generate this example output
        You got 3 tomato price is 2.99 and total -->>
        You got 5 potato price is 3.49 and total -->>
        You got 2 banana price is 1.99 and total -->>
        Your grand total for this shopping is ????

    * */
        System.out.println(" How much are the potato? ");
        float perLbPotatoPrice = scan.nextFloat();
        System.out.println("How many pounds of potatoes do you want to buy? ");
        int potatoCount = scan.nextInt();

        System.out.println("How much is tomato? ");
        float perLbPriceTomato = scan.nextFloat();
        System.out.println("How many pounds of tomato do you want to buy?");
        int tomatoCount = scan.nextInt();
        System.out.println("How much are the bananas?");
        float perLbPriceBanana = scan.nextFloat();
        System.out.println("How many pounds of bananas do you want to buy? ");
        int bananaCount = scan.nextInt();

        System.out.println("You purchased " + potatoCount + " potatoes. "+ "Potato is " + "$"+ perLbPotatoPrice + " per pound." + "Your total for potatoes is " +(potatoCount*perLbPotatoPrice));
        System.out.println("You purchased " + tomatoCount + " tomatoes. "+ "Tomato is " + "$"+ perLbPriceTomato + " per pound." + "Your total for tomatoes is " +(tomatoCount*perLbPriceTomato));
        System.out.println("You purchased " + bananaCount + " bananas. "+ "Bananas are " + "$"+ perLbPriceBanana + " per pound." + "Your total for bananas is " +(bananaCount*perLbPriceBanana));
        float potatoTotal = potatoCount*perLbPotatoPrice;
        float tomatoTotal = tomatoCount*perLbPriceTomato;
        float bananaTotal = bananaCount*perLbPriceBanana;
        System.out.println("Your grand total for this purchase is $" +(potatoTotal+tomatoTotal+bananaTotal) +"$.");




    }

}
