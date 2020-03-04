package day53;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MarketRun {
    public static void main(String[] args) {
        Broccoli b1 = new Broccoli("Green", "plain","raw");

        Vegetables v1 = b1;

        v1 = new Pepper("yellow","sweet",2, "pepper");


        Vegetables b2 = new Broccoli("white","sour","soft");

        Vegetables v2 = new Pepper("red","sweet",5,"pepper");

        Vegetables v3 = new Pepper("green", "plain",3,"pepper");

        Vegetables[] veggies = {v1, b2, v2, v3};
        for (Vegetables each:veggies) {
//            each.cook();

//            System.out.println(each.color);
//            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
//            System.out.println(each.taste);
//            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");


        }

        List<Vegetables> veggies3 = new ArrayList<>(Arrays.asList(v1, b2, v2, v3));//List size is a modifiable

        for (Vegetables each: veggies3) {

           System.out.println("each.toString = "+each.toString());
            System.out.println("Class type "+each.getClass().getSimpleName());
            // each.cook();
            //System.out.println("--------------------------------------------------------------------");

        }

    }
}
