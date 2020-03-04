package day37;

import java.util.ArrayList;
import java.util.List;

public class List_Insert_Add {
    public static void main(String[] args) {
        List<Integer> lst2 = new ArrayList<>();
        lst2.add(44);
        lst2.add(14);
        lst2.add(34);
        lst2.add(41);
        lst2.add(19);

        //insert 100 right after 34 : we do not know 34 is

        lst2.indexOf(34);
        lst2.add(lst2.indexOf(34)+1, 100);
        System.out.println("lst2 = "+lst2);

        //add 100 in from of 44
        //add five 100 in front of 44, we know exactly where 44 is
        for (int i = 0; i <= 5; i++) {
            lst2.add(0,100);


        }
        System.out.println("lst2 = "+lst2);

        //lst2.add(lst2.indexOf(44)-1, 100);
        //System.out.println("lst2 = "+lst2);


        List<Integer> nums = new ArrayList<>();
        // below I am adding values to my nums list
        nums.add(5);// index 0
        nums.add(65);// index 1
        nums.add(23);// index 2
        System.out.println(nums);
        // my result will print like this [5, 65, 23] --- size of the nums list is 3

        //below I am inserting 3 at index two
        nums.add(2, 3);
        System.out.println(nums);
        // my result will print like this [5, 65, 3, 23] ---->>> it shifts the original value to the right.
        //the size of the nums list is now 4


    }
}
