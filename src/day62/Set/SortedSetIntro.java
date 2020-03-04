package day62.Set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetIntro {
    public static void main(String[] args) {
        //Sorted interface extends Set interface
        //It is data structure that store unique elements in sorted order
        //The implementing class is TreeSet

        //Sorted removes the duplicate and prints in ascending order
        SortedSet<Integer> mySet = new TreeSet<>();
        mySet.add(78);
        mySet.add(78);
        mySet.add(30);
        mySet.add(30);
        mySet.add(65);
        mySet.add(35);

        System.out.println("mySet = "+mySet);

        System.out.println(" first element/minimum value = " + mySet.first());
        System.out.println("last element/maximum value = "+mySet.last());



    }
}
