package day60.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class UsingMyIterWHileLoop {
    public static void main(String[] args) {
        Collection<Integer> nums = new ArrayList<>(Arrays.asList(10, 4, 5, 45, 87, 9));
        Iterator<Integer> myIter = nums.iterator();
        while (myIter.hasNext()){
            if(myIter.next()<=10){
                myIter.remove();
            }
        }
        System.out.println(nums);

    }

}
