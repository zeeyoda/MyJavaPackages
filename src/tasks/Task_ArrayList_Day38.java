package tasks;

import java.util.ArrayList;
import java.util.List;

public class Task_ArrayList_Day38 {
    public static void main(String[] args) {


        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(7);
        numbers.add(3);
        numbers.add(12);
        numbers.add(7);
        numbers.add(2);
       insert100BetweenItemOfList(numbers);
        System.out.println(numbers);


    }
    public static void insert100BetweenItemOfList(List<Integer> numbers ){
        for (int i = 0; i < numbers.size(); i+=2) {
            numbers.add(i, 100);
        }

    }
}
