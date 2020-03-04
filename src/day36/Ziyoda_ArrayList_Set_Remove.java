package day36;

import java.util.ArrayList;

public class Ziyoda_ArrayList_Set_Remove {
    public static void main(String[] args) {
        ArrayList<Integer> myInt = new ArrayList<>();
        myInt.add(56);
        myInt.add(25);
        myInt.add(47);
        myInt.add(65);
        myInt.add(8);
        for (int i = 0; i < myInt.size(); i++) {
            System.out.print(myInt.get(i)+", ");

        }
        System.out.println();
        myInt.set(3,4);
        for (Integer each :myInt) {
            System.out.print(each+", ");

        }
        System.out.println();
        myInt.remove(3);
        System.out.println(myInt);

        System.out.println();
        myInt.clear();
        System.out.print(myInt);
        System.out.println(myInt.size()==0);
        System.out.println(myInt.isEmpty());




    }
}
