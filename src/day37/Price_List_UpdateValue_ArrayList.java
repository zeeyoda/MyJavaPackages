package day37;


import java.util.ArrayList;
import java.util.List;

public class Price_List_UpdateValue_ArrayList {
    public static void main(String[] args) {
        List<Double> priceList = new ArrayList<>();
        priceList.add(9.99);
        priceList.add(12.99);
        priceList.add(2.39);
        priceList.add(3.95);
        priceList.add(11.29);
        priceList.add(1.2);
        priceList.add(3.99);
        priceList.add(65.59);
        priceList.add(999.99);

        System.out.println("priceList = "+priceList);
        //change the 3rd item to 10$

        priceList.set(2, 10.0);
        System.out.println("priceList = "+priceList.get(2));

        //add 4 dollar to first price. we need to update the value
        priceList.set(0, priceList.get(0)+4);
        System.out.println("Adding 4 dollars to first item price = "+priceList.get(0));

        //change last price to sum of first and second price
        double sumOfFirst2Items = priceList.get(0)+priceList.get(1);
        priceList.set(priceList.size()-1, sumOfFirst2Items);
        System.out.println("Replacing the last value by the sum of 1st and 2nd total "+priceList.get(priceList.size()-1));
        //below is the direct way
        priceList.set(priceList.size()-1, priceList.get(0)+priceList.get(1));
        System.out.println(priceList.get(priceList.size()-1));

        //give 40% off to second price
        priceList.set(1, priceList.get(1)*.60);
        System.out.println("After 40% discount, new value for item 2 is "+priceList.get(1));

        System.out.println("Latest original priceList "+priceList);
        //double the value of every price in the list
        //in order to update the item we need an index and new value
        //in order to update the price, we need to get the value and multiply it by 2
        for (int i = 0; i < priceList.size(); i++) {
            priceList.set(i, priceList.get(i)*2);
        }
        System.out.print("Result after doubling = " +priceList);
        System.out.println();

        //cut the price into half if the price is more than $20
        for (int i = 0; i < priceList.size(); i++) {
            if(priceList.get(i)>20){
                priceList.set(i, priceList.get(i)/2);
            }
                    }
        System.out.println(priceList);

        // swap the first value with the last value
        // store the first item in temp so we can assign it to the last later
        int lastIndex = priceList.size()-1;
        Double temp = priceList.get(0);
        priceList.set(0, priceList.get(lastIndex));//assigning the last value to first index
        priceList.set(lastIndex, temp);//assigning the first value to last index




    }
}
