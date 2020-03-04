package day26;

public class ArrayTask_NumberTest {
    public static void main(String[] args) {
        int[]score = {156, 101, 76, 187, 87, 110};
        String finalResult = "";
        // 1 logic to solve this problem:
        // take each item check if it is less than 100, count. if end count is more than 0 then NO
        int cntLessThan100 = 0;
        for (int eachScore: score){
            if(eachScore<100){
                System.out.println("eachScore = "+eachScore);
                cntLessThan100++;
            }
        }
        System.out.println("count = " + cntLessThan100);
        if (cntLessThan100>0) {
            finalResult = "No";
        }else{
            finalResult = "Yes";
        }
        System.out.println("Final Result = " + finalResult);
        System.out.println("-------------------------------");

        //Logic 2
        //take each item and check if it is more than 100, then count.
        // in the end if count is equal to array item count the finalResult Yes, answer is NO

        int cntMoreThan100 = 0;
        for(int eachScores : score){
            if(eachScores>100){
                ++cntMoreThan100;
            }
        }
        System.out.println("cntMoreThan100 = "+ cntMoreThan100);
        //if all the numbers are more than 100, it will have the same count as item count
        if(cntMoreThan100 == score.length) {
            finalResult = "YES";
        }else{
            finalResult = "NO";
        }
        System.out.println("Final Result = "+finalResult);
        System.out.println("-----------------------");

        //Logic 3.
        //break as long as result is less than 100 after  assigning final result to NO
        //if we never go inside condition, final result will remain Yes

        for(int eachNum : score){
            if(eachNum<=100){
                finalResult = "NO";
                break;
            }
        }
        System.out.println("Final result is "+ finalResult);
    }
}
