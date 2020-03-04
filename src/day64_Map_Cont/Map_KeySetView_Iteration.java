package day64_Map_Cont;

import java.util.HashMap;
import java.util.Map;

public class Map_KeySetView_Iteration {
    public static void main(String[] args) {
        //Map is not iterable so we cannot iterate over them directly
        //we can get something iterable out of the map
        //keySet() will return a Set<String>  and its iterable

        Map<String, Double> groceries = new HashMap<>();
        groceries.put("Apple", 1.99);
        groceries.put("Banana", 1.59);
        groceries.put("Milk", 2.83);
        groceries.put("Lamb", 5.99);
        groceries.put("Olive", 4.99);


    }
}
