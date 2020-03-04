package ziyodaPractice;

import java.util.ArrayList;

public class Repl_195_Sum_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(2);
        ints.add(4);
        ints.add(6);
        ints.add(8);
        ints.add(21);
        ints.add(23);
        ints.add(12);
        int sum = 0;
        for (Integer each: ints) {
            sum = sum+each;

        }
        System.out.println(sum);

    }
}
