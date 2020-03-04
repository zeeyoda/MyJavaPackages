package day53;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Market {
    public static void main(String[] args) {
        Broccoli b1 = new Broccoli("Green", "plain","raw");
        System.out.println(b1.color);
        System.out.println(b1.taste);
        System.out.println(b1.type);
        b1.cook();

        System.out.println("==========================================================");
        Vegetables v1 = b1;
        System.out.println(v1.color);
        System.out.println(v1.taste);
        v1.cook();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        v1 = new Pepper("yellow","sweet",2, "pepper");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        v1.cook();

        System.out.println(v1);


        Vegetables b2 = new Broccoli("white","sour","soft");

        Vegetables v2 = new Pepper("red","sweet",5,"pepper");

        Vegetables v3 = new Pepper("green", "plain",3,"pepper");

        Vegetables[] veggies = {v1, b2, v2, v3};
        for (Vegetables each:veggies) {

            System.out.println(each.color);
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            System.out.println(each.taste);
            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");


        }

        List<Vegetables> allVeggies = Arrays.asList(v1, b2, v2, v3);// size of this List in unchangeable, cannot add or remove



        List<Vegetables> veggiesAll = new ArrayList<>();
        veggiesAll.addAll(allVeggies);// we can only add List or ArrayList to this collection

        List<Vegetables> veggies3 = new ArrayList<>(Arrays.asList(v1, b2, v2, v3));//List size is a modifiable

        for (Vegetables each: veggies3) {

           each.toString();
           // each.cook();
            //System.out.println("--------------------------------------------------------------------");

        }
        System.out.println(v1);


    }
}
