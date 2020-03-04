package day62.Set;

import java.util.HashSet;
import java.util.Set;

public class SetIntroInterface {
    public static void main(String[] args) {

        //Set is  a data structure to store unique elements;
        //HashSet implements Set Interface and always default choice
        //Set doesn't care about order and doesn't keep the order of the elements when printing
        //Set doesn't have index number
        //HashSet<Integer> myNums = new HashSet<>();
        Set<Integer> myNums = new HashSet<>();
        myNums.add(10);
        myNums.add(10);
        myNums.add(10);
        myNums.add(10);
        myNums.add(10);
        myNums.add(10);
        System.out.println(myNums);
    }
}
