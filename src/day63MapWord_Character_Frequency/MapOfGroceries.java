package day63MapWord_Character_Frequency;

import java.util.HashMap;
import java.util.Map;

public class MapOfGroceries {
    public static void main(String[] args) {
        
        Map<String, Double> groceries = new HashMap<>();
        
        groceries.put("Cherry", 2.99);
        groceries.put("Strawberry", 4.99);
        groceries.put("Blueberry", 3.99);
        groceries.put("Blackberry", 5.99);
        groceries.put("Black Olives", 3.29);
        groceries.put("Apple", 2.99);
        groceries.put("Apricot", 4.25);
        
        groceries.put("Cherry", 5.26);// adding duplicate key will update the value of the key
        System.out.println("groceries = " + groceries);

        groceries.putIfAbsent("Chobani Flip", 8.99);
        System.out.println("groceries after adding chobani flip= " + groceries);
        
        groceries.putIfAbsent("Apple", 1.29);
        System.out.println("groceries = " + groceries);
        System.out.println("groceries = " + groceries.size());

        System.out.println("groceries.get(\"Blueberry\") = " + groceries.get("Blueberry"));
        //groceries.replaceAll("Apple", 1.89*2);
        System.out.println("groceries.replace(\"Apple\", groceries.get(\"Apple\")*2) = " + groceries.replace("Apple", groceries.get("Apple") * 2));
        double newPrice = groceries.get("Apple")*2;
    }
}
