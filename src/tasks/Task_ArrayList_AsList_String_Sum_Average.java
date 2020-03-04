package tasks;

import java.util.Arrays;
import java.util.List;

public class Task_ArrayList_AsList_String_Sum_Average {
    public static void main(String[] args) {
        List<String> numLst = Arrays.asList("79" , "54" , "100", "65", "44","78","68","98" ,"89","77");
        System.out.println("numLst = " + numLst);

        for (String each: numLst) {
            int eachNum = Integer.parseInt(each);
            if (eachNum>60){
                System.out.println("pass = "+eachNum);
            }else{
                System.out.println("Fail = "+eachNum);
            }

        }
        //count how many are more than 90
        int count = 0;
        for (String each : numLst) {
            if(Integer.parseInt(each) > 90){
                ++count;
            }

        }
        System.out.println("count = "+count);


        // get average score

        int sum = 0;
        for (String each: numLst) {
            sum = sum + Integer.parseInt(each);

        }
        System.out.println("average = "+sum/numLst.size());
        /**
         * * update the values with score-grade pair
         *   for example
         * 79C , 54F, 100A, 65D, 44F , 89B , 95A
         * go through each value, check the number for the range value so we can decide if it is A, B, C, D, F
         * Then use set method to update the current value to new value
         *
         */
        numLst.set(0, numLst.get(0)+"C");
    }
}
