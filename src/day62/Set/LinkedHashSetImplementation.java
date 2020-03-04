package day62.Set;

import java.util.*;
//primary difference between LinkedHashset and Hashset is Hashset is faster as it only print the unique elements
//LinkedHashSet  removes the duplicate and keeps the insertion order

public class LinkedHashSetImplementation {
    public static void main(String[] args) {

        //LinkedHashSet is used to remove duplicate. It also keeps the insertion order(first come first serve)
        //LinkedHashSet is a subclass of Hashset
        Set<Integer> myNums = new LinkedHashSet<>();//LinkedHashSet prints the unique elements and keeps the insertion order
        myNums.add(10);
        myNums.add(10);
        myNums.add(22);
        myNums.add(13);
        myNums.add(13);
        myNums.add(30);
        myNums.add(30);

        System.out.println("LinketHashSet = " + myNums);

        Set<Integer> hashset = new HashSet<>();//HashSet it prints the unique elements and doesn't keep the insertion order, it is faster
        hashset.add(10);
        hashset.add(10);
        hashset.add(22);
        hashset.add(13);
        hashset.add(13);
        hashset.add(30);
        hashset.add(30);

        System.out.println("HashSet = "+hashset);


    }
}
