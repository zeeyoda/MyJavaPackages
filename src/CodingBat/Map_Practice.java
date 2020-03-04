package CodingBat;

import java.util.HashMap;
import java.util.Map;

public class Map_Practice {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("a", null);
        map.put("b","cherry");
        //Modify and return the given map as follows: if the keys "a" and "b" have values that have different lengths,
        // then set "c" to have the longer value. If the values exist and have the same length, change them both to the
        // empty string in the map.
//
        if(map.containsKey("a") && map.containsKey("b")){
            if ((map.get("a")!=null && map.get("b")!=null) && map.get("a").length()>map.get("b").length()){
                map.put("c", map.get("a"));
            }
            if((map.get("b")!=null && map.get("a")!=null) && map.get("b").length()>map.get("a").length()){
                map.put("c", map.get("b"));
            }
            if((map.get("a")!=null && map.get("b")!=null) && map.get("a").length()==map.get("b").length()){
                map.put("a", "");
                map.put("b", "");
                map.put("c", map.get("c"));
            }


        }
        System.out.println(map);


    }
}
