package day38;

import java.util.*;

public class SortingAListObject {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(300, 200, 700, 500, 800));
        System.out.println("nums before sort = "+nums);
        //2 ways to sort an ArrayList
        //Use Collections utility class
        //Collections is a class coming from java.util.package
        //it has a lot of ready method to work with Collection objects like ArrayList and so on

        Collections.sort(nums);
        System.out.println("nums = " + nums);

        Collections.sort(nums, Comparator.reverseOrder());

        //Comparator.naturalOrder() --->> low to high

        nums.sort(Comparator.naturalOrder());
        System.out.println("nums after natural order = "+nums);

        nums.sort(Comparator.reverseOrder());
        System.out.println("nums after reverse order = "+nums);
    }
}
