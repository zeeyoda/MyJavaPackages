package day37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList_With_String {
    public static void main(String[] args) {
        List<String> superHeros = new ArrayList<>();
        superHeros.add("Superman");
        superHeros.add("Batman");
        superHeros.add("Wonder Woman");
        superHeros.add("Cyborg");
        superHeros.add("Aquaman");
        superHeros.add("Flash");
        System.out.println("superHeros = " + superHeros);

        //do we have superman in the list
        System.out.println("superHeros = " + superHeros.contains("Superman"));

        System.out.println(superHeros.contains("man"));

        for(int x=0; x < superHeros.size(); x++){
            String currentHero = superHeros.get(x);
            if(!currentHero.contains("man")){
                superHeros.remove(currentHero);
                --x;
                //once hero is removed, this index will be filled by next item
                //so we need to decrease the index by 1 so to stay at the same index
            }
        }
        System.out.println("superHeros = "+superHeros);
         List<String> superHeroCopy = new ArrayList<>(superHeros);
        System.out.println("superHeroCopy = " + superHeroCopy);

        // This will create unmodifiable list!!!
        List<String> topics = Arrays.asList("Java", "Selenium","Database","API");
        System.out.println("topics = " + topics);

        List<String> topicsCopy = new ArrayList<>(topics);
    }
}
