package muhtar35;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Meth_Max_SecondMax_Min {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 8, 2, 5, 8, 5,7, 8));
        int nums = getMax(list);
        System.out.println(nums);
        System.out.println(getMax(list));
        System.out.println("------------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(20, 98, 45, 85, 65, 98, 26, 98));
        System.out.println(secondMax(list1));
        System.out.println(getMin(list1));
        System.out.println(getSecondMin(list1));
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(15, 78, 65, 25, 25, 65, 78, 20, 15, 20, 79, 15));
        System.out.println(getSecondMin(numbers));

    }
    public static int getMax(ArrayList<Integer> num){
        int max = Integer.MIN_VALUE;
        for(int each : num){
            if(each>max){
                max=each;
            }
        }
        return max;
    }
    public static int secondMax(ArrayList<Integer> num){
        Integer max = getMax(num);
      num.removeAll(Arrays.asList(max));
      int secondMax = getMax(num);
      return secondMax;
    }
    public static int getMin(ArrayList<Integer> num){
        int min = Integer.MAX_VALUE;
        for(int each: num){
            if(each<min){
                min=each;
            }
        }
        return min;
    }
    public static int getSecondMin(ArrayList<Integer> num){
        Integer min = getMin(num);
        num.removeAll(Arrays.asList(min));
        getMin(num);
        return getMin(num);
//        Integer min = getMin(num);
//        num.removeAll(Arrays.asList(min));
//       // int secondMin = getMin(num);
//        return getMin(num);
    }


}
