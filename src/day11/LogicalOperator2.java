package day11;

public class LogicalOperator2 {
    public static void main(String[] args) {

        // && and single & -- logical AND operator
        // This is used to check both conditions are true at the same time.

        //&& is called short circuit AND -- it doesnt check the next condition
        //as long as 1st condition is false
        //ex: rocket launching conditions - isEngineRunning, isAirEnough, isCommunicationSystemWorking
        //if isEngineRunning is false, it will not check the next condition

        // & checks each AND every condition no matter what


       /* System.out.println(7>5  && 1>7);
        System.out.println(5>5 && 1>7);
        System.out.println(1>5 && 9>7);

        System.out.println(7>5 & 1>7);
        System.out.println(5>5 & 1>7);
        System.out.println(1>5 & 9>7);
        */


      //  System.out.println(9/0);// Error! cannot divide by 0
        //I want to check whether dividing 9 by 0 is 3
      //  System.out.println(9/0==3);

        // combine 5 is more than 10
        // AND 9 divided by 0 is 3
        System.out.println(5>10 & 9/0==3);
    }
}
