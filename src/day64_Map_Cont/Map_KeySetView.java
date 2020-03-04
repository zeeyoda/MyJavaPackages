package day64_Map_Cont;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Map_KeySetView {
    public static void main(String[] args) {
        Map<String, Double> groceries = new HashMap<>();
        groceries.put("Apple", 1.99);
        groceries.put("Banana", 1.59);
        groceries.put("Milk", 2.83);
        groceries.put("Lamb", 5.99);
        groceries.put("Olive", 4.99);
        System.out.println("groceries = " + groceries);

        //Map View
        // keySet() --> retrieves the the key of the map
        //How do I store all the keys into a Collection

        Set<String> items = groceries.keySet();
        System.out.println(items);
        items.remove("Banana");
        System.out.println("After removing banana my updated grocery list shows = "+groceries);
        //getting a copy of the original keySet();
       // Set<String> copyOfKeys = new HashSet<>(items);
        Set<String> copyOfKeys = new HashSet<>(groceries.keySet());// --->> this is a direct way of copying the Map keys
        System.out.println("copyOfKeys = " + copyOfKeys);
        copyOfKeys.remove("Olive");
        System.out.println("copyOfKeys after removing the olive = " + copyOfKeys);
        System.out.println("Original groceries map "+ groceries);



    }
}
