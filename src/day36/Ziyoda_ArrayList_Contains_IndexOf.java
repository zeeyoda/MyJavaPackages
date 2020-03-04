package day36;

import java.util.ArrayList;

public class Ziyoda_ArrayList_Contains_IndexOf {
    public static void main(String[] args) {
        ArrayList<Integer> myInt = new ArrayList<>();
        myInt.add(56);
        myInt.add(25);
        myInt.add(47);
        myInt.add(65);
        myInt.add(8);

        myInt.indexOf(56);
        System.out.println(myInt.indexOf(56)!=-1);
    }
}
