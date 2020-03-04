package day36;

import java.util.ArrayList;
import java.util.List;

public class ArrayListIntro {
    public static void main(String[] args) {
        // How do we create an ArrayList Object
        ArrayList<String> lst1 = new ArrayList<>();

        //ArrayList only stores objects, not primitives

        //correct way to create arraylist object that store whole number
        //is to use wrapper class type. Primitive type cannot be used-forbidden.

        ArrayList<Integer> lst2 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();// we can or not add Integer inside the second diamond

        ArrayList<Long> lst3 = new ArrayList<>();
        ArrayList<Double> lst4 = new ArrayList<>();

        // Optionally you can create this way
        // List is a more general data type. ArrayList is more concrete  data type
        //
        List<String> myList = new ArrayList<>();



    }
}
