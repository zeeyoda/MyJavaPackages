package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysList_ShortWay {
    public static void main(String[] args) {
        List<Double> prices = Arrays.asList(9.99, 5.55, 3.76, 8.99, 0.99, 65.67, 0.99);
        System.out.println("prices = " + prices);

        int count = 0;
        for (Double each:prices) {
            if(each>5){
                ++count;
            }
        }
        System.out.println("count = "+count);

        //i want to add 2 more prices, I have to create a new ArrayList as the old one's size cannot be changed

        ArrayList<Double> newPrices = new ArrayList<>(prices);
        newPrices.add(199.99);
        newPrices.remove(.99);
        System.out.println("newPrices = " + newPrices);

        //Create an ArrayList Object in one shot with many items so we can add or remove
        // Just one option to create ArrayList Object in one shot

        ArrayList<Double>  oneShotPrice = new ArrayList<>(Arrays.asList(9.99, 5.55, 3.76, 8.99));
        oneShotPrice.add(1, 100.99);
        System.out.println("oneShotPrice = " + oneShotPrice);
        System.out.println("OneShotPrice after adding 100.99 = "+oneShotPrice);
        oneShotPrice.remove(2);
        System.out.println("OneshotPrice after item at index 2 got removed "+oneShotPrice);


    }
}
