package day63MapWord_Character_Frequency;

import java.lang.reflect.Array;
import java.util.*;

public class Ziyoda_List_Map_HashMap {
    public static void main(String[] args) {

        //create a map that stores name and character count pair

        List<String> group = new ArrayList<>();
       // group.addAll(Arrays.asList("Ziyoda, Sezgin, Burhan, Abbos, Ainura, Sofiya, Tugba, Seda, Subi, Cristina, Ilnura, Mehmet, Gulay"+
                                   //" Nailya, Betul"));
        group.add("Seda");
        group.add("Ainura");
        group.add("Sofiya");

        group.add("Abbos");



        Map<String, Integer> nameCharPair = new HashMap<>();
        for (String eachName:group) {
            nameCharPair.put(eachName, eachName.length());

        }
        System.out.println("NameCharCount = "+nameCharPair);

    }
}
