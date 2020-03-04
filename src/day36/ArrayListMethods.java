package day36;

import java.util.ArrayList;

public class ArrayListMethods {

    public static void main(String[] args) {
        //create an Arraylist object of long and assign it to a variable

        ArrayList<Long> lst = new ArrayList<>();

        // C.R.U.D. ----> Create, Read, Update, Delete
        // add item, inset an item, read item, update the item, remove the item, check the location

        lst.add(12L);// 12L is automatically converted to new Long (12L)
        lst.add(100L);
        lst.add(50L);
        lst.add(200L);

        System.out.println("lst = "+ lst);// it prints in the order it is presented

        //in order to find out how many items are in the ArrayList we use the method called size

        System.out.println("Counting items using lst.size = "+lst.size());

        // Getting items inside ArrayList
        System.out.println("First item is : lst.get(0) = "+lst.get(0));

        //Task: get the sum of above ArrayList items
        long sum = 0;

        for (int i = 0; i <lst.size(); i++) {
            System.out.println("This is how we get each item "+lst.get(i));
            sum = sum+lst.get(i);

        }
        System.out.println(sum);
        System.out.println("--------------------------");

        //get the max
        long max = lst.get(0);
        for (int x = 0; x < lst.size(); x++) {
            if(lst.get(x)>max){
                max=lst.get(x);
            }
        }
        System.out.println("max  value is " +max);
    }
}
