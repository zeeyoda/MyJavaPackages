package day60.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratingAnyCollection {
    public static void main(String[] args) {

        // this is the ArrayList constructor that accept any type of Object
        // public ArrayList(Collection<E> c){}

        Collection<Integer> nums = new ArrayList<>(Arrays.asList(10, 4, 5, 45, 87, 9));

        //iterating over a collection object using iterator
        Iterator<Integer> myIter = nums.iterator();
        //hasNext() -->> checks whether you have item at next location
        System.out.println("myIter = " + myIter.hasNext());
        //next() --> moves the pointer of the iterator to the next element
        System.out.println("myIter = " + myIter.next());
        System.out.println("myIter = " + myIter.next());
        System.out.println("myIter = " + myIter.next());
        System.out.println("myIter = " + myIter.next());
        System.out.println("myIter = " + myIter.next());

        myIter.remove();//removes the element at this location

        System.out.println("myIter = " + myIter.next());

        System.out.println("myIter.hasNext() "+myIter.hasNext());//peeks to see if there is anything at the next element

        System.out.println(nums);
    }
}
