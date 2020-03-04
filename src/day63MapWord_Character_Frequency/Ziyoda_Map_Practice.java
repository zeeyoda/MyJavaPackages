package day63MapWord_Character_Frequency;

import java.util.HashMap;
import java.util.Map;

public class Ziyoda_Map_Practice {
    public static void main(String[] args) {

        Map<String, Double> shopping = new HashMap<>();
        shopping.put("Apple", 1.29);
        shopping.put("Banana", 1.99);
        shopping.put("Garlic", 2.59);
        shopping.put("Carrot", 3.99);
        shopping.put("Apricot", 5.49);
        shopping.put("Cherry", 4.99);
        shopping.put("Blackberry", 2.99);

        shopping.putIfAbsent("Grapes", 2.29);
        shopping.putIfAbsent("Apple", 2.45);
        System.out.println("My shopping list = " + shopping);
        System.out.println("Getting my third item "+shopping.get("Garlic"));

        shopping.replace("Apple", 1.29*2);
        shopping.replace("Apple", shopping.get("Apple")*2);

        double newPrice = shopping.get("Apple")*2;//get the apply price and double it
        shopping.replace("Apple", newPrice);

        System.out.println("Doubling the price of the first item "+shopping.get("Apple"));

        //try to reduce the price by 1 dollar
        shopping.replace("Apple", shopping.get("Apple")-1);


        if(shopping.containsKey("Cherry")){
            shopping.remove("Cherry");
            System.out.println("No More cherry.");
        }
        System.out.println("Shopping list after cherry has been removed "+shopping);

    }
}
