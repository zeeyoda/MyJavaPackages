package day37;

import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;

public class MethodWithArrayListAsReturnType {
    public static void main(String[] args) {

        System.out.println( getListFrom1ToFinalNumber(7));
        System.out.println(getListFrom1ToFinalNumber(2));
        System.out.println( getListFrom1ToFinalNumber(20));

        List<Integer> myList = getListFrom1ToFinalNumber(25);
        System.out.println("myList = " + myList);

    }
    //create a method that accepts a finalNumber as int
    //return an ArrayList of Integer containing numbers
    //starting from 1 till finalNumber

    /**
     * This method will retirn a List of Integer that contains numbers
     * starting from 1 till finalNumber
     * @param finalNumber This is the last item of the list
     * @return List<Integer> that contains 1 till finalNumber each time increased by 1
     */
    public static List<Integer> getListFrom1ToFinalNumber(int finalNumber){
        List<Integer>nums = new ArrayList<>();

        for (int numbers = 1; numbers <=finalNumber; numbers++) {
            nums.add(numbers);
        }
        //System.out.println("nums = "+nums);
        return nums;

        }

}
