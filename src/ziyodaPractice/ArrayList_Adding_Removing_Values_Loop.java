package ziyodaPractice;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;

public class ArrayList_Adding_Removing_Values_Loop {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        // this is how we add elements 1 to 10 to an ArrayList using loop
        int count = 1;
        for (int x = 0; x < 10; x++) {
            nums.add(count++);

        }
        System.out.println(nums);
        //Below I would like to remove elements between 4 and 7 from the ArrayList.
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) >= 4 && nums.get(i) <= 7) {
                nums.remove(i--);
                // i--;//every time an element is removed ArrayList size shrinks; Here I am going back to the same index
                //as the next element has shifted to this index after the previous one got removed
            }
        }
        System.out.println(nums);
        System.out.println(nums.toString());//returns a String representation of this collection
        System.out.println("Second version for removing several elements from an ArrayList --->> backwards");
        for (int y = nums.size() - 1; y >= 0; y--) {
            if (nums.get(y) >= 4 && nums.get(y) <= 7) {
                nums.remove(y);
            }
        }
        System.out.println(nums);
    }
}
