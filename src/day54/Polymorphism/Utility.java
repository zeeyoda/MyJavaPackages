package day54.Polymorphism;

import ziyodaPractice.ArrayList_Adding_Removing_Values_Loop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Utility {
    public static void main(String[] args) {
        Wearable w1 = new Clothes();
        wearMyWearable(w1);

        Wearable w2 = new Watch();
        wearMyWearable(w2);

        Wearable w3 = new Perfume();
        wearMyWearable(w3);

        Wearable w4 = new MakeUps();
        wearMyWearable(w4);

        List<Wearable> lst = new ArrayList<>(Arrays.asList(w1, w2, w3, w4));
        for (Wearable each: lst){

        }

        wearMyWearable(new Watch());
        Wearable result = getMyWearableObject();
        System.out.println(result);
        System.out.println(result.getClass().getSimpleName());//gets the name of the class being called
        result.wear();
        wearMyWearable(result);


    }
    public static void  wearMyWearable(Wearable any){
        any.wear();

    }
    public static Wearable getMyWearableObject(){
        return new Watch();
    }
}
