package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_Practice {
    public static void main(String[] args) {


        //how do we copy everything from Array to ArraysList Object


        Integer[] nums = new Integer[] {1,4,5,7,8,5,3,2,19} ;
        List<Integer> numsLst = Arrays.asList(nums);
        Integer[] numsArr = numsLst.toArray(new Integer[9]);

    }

}
