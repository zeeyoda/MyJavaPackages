package ziyodaPractice;

import java.util.ArrayList;

public class Repl_211 {
    public static void main(String[] args) {
        int max_fuel = 3;
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(9);
        arr.add(1);
       // arr.add(1);
      //  arr.add(2);
      //  arr.add(6);

        int times = refuel_times(arr,3);
        System.out.print(times);
    }
    public static int refuel_times(ArrayList<Integer> deliveries, int max_fuel) {
        int sum = 0;
        int times = 0;
        int remainder = 0;
        int refuel_times = 0;
        for (Integer each : deliveries) {
            sum += each;
//        }
//            if (sum % max_fuel == 0) {
//                times = sum / max_fuel;
//
//            }
//            if (sum % max_fuel == 1) {
//                remainder = sum % max_fuel;
//            }
        }
        refuel_times = (sum/max_fuel) + (sum%max_fuel);
        return refuel_times;
    }
}

