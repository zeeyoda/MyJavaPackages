package day61.TaskComparable;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class JobHunter {
    public static void main(String[] args) {

        Job j1 = new Job("Florida", 121000.00, "Apple");
        Job j2 = new Job("California",150000.00, "Yahoo");
        Job j3 = new Job("Washington DC", 120000.00, "White House");

        System.out.println("j1.compareTo(j2)= "+j1.compareTo(j2));
        System.out.println("j2.compareTo(j3)= "+j2.compareTo(j3));



        LinkedList<Job> list = new LinkedList<>();
        list.add(new Job("Florida", 121000.00, "Apple"));
        list.add(new Job("California",150000.00, "Yahoo"));
        list.add(new Job("Washington DC", 120000.00, "White House"));
        list.add(new Job("Ohio", 85000.00, "University"));
        list.add(new Job("New Jersey", 115000.00, "J&J"));
        System.out.println("list = " + list);

        //how does the sort method know how to sort?
        //it used the comparing logic provided inside
        //compareTo(Job other) method
        //then sort them accordingly
        Collections.sort(list);
        System.out.println("list = " + list);
        //Comparator.reverseOrder() will give you an object with reversed comparing logic
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println("list = " + list);

        //Collections.reverseOrder() will also give you an object with reversed comparing logic
        //below code will try to sort the list in reverse order from natural order.
        //because I already reversed using Comparator.reverseOrder() which reversed the natural order, when I used
        //Collections.reverseOrder() it kept the same reversedOrder.
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("list = " + list);

        //Comparator.reverseOrder() and Collections.reverseOrder() do the same function

            }
}
