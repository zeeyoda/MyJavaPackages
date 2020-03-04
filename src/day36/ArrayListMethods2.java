package day36;

import java.util.ArrayList;

public class ArrayListMethods2 {
    public static void main(String[] args) {
        //create an Arraylist object of long and assign it to a variable

        ArrayList<Long> lst = new ArrayList<>();

        // C.R.U.D. ----> Create, Read, Update, Delete
        // add item, insert an item, read item, update the item, remove the item, check the location

        lst.add(12L);// 12L is automatically converted to new Long (12L)
        lst.add(100L);
        lst.add(150L);
        lst.add(200L);
        lst.add(null); //you can add null element into a list

        System.out.println("lst = " + lst);// it prints in the order it is presented

        // I was to insert 125 between 100L and 150L, basically 2nd and 3rd item

        lst.add(2, 125L);
        System.out.println("lst after insertion of 125 between 100L and 150L = " + lst);
        System.out.println("List count is done by using size "+lst.size());
        System.out.println("lst.get(3)= " + lst.get(3));

        // updating value at certain index :  set method

        lst.set(3, 195L);
        System.out.println("New value for lst.get(3) =" + lst.get(3));

        // removing item by its value
        //lst.remove(100L);
        //System.out.println("After removing 100L from the list = "+lst);

        //removing item by its index
        //lst.remove(2);
        //System.out.println("After removing item at index 2 = "+lst);

        // looking for location of a certain item
        System.out.println("Looking at the location of 100L using lst.indexOf() " + lst.indexOf(100L));

        System.out.println("Looking for location of 23L = " + lst.indexOf(23L));// this is a value we dont have. It prints -1


        // check whether a list is empty or not
        System.out.println("lst.size()>0 ="+(lst.size() > 0));
        System.out.println("lst.size() = "+ lst.isEmpty());

        //how to I delete everything inside ArrayList
        //lst.clear();

        //check after deletion
        //System.out.println("Check after clearing lst.isEmpty() = "+lst.isEmpty());

        //check whether we have certain item or not
        System.out.println("\nlst.contains(100L) = "+lst.contains(100L));
        System.out.println("lst.contains(10L) = "+lst.contains(10L));

        // how do I check whether a list contains an item without using contains method
        //use indexOf method, if it returns -1, it means we dont have it

        System.out.println("Do I have 10L = "+(lst.indexOf(10L)!=-1));


    }

}
