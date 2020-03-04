package day16;

public class WhileLoopPractice {
    public static void main(String[] args) {
         int x= 100;
         while( x<=105) {
             System.out.println("Hello World");
             ++x;
         }
         //iteration 1: x=100, u check if 100<=105 --> true
        //iteration 2: number is increased by one that is 101<=105 --> true
        //iteration 3: --> 102<=105 --> true
        //iteration 4: --> 103<=105 --> true
        //iteration 5: --> 104<=105 --> true
        //iteration 6: --> 105<=105 --> true
        //iteration 7: --> there is no iteration 7 as it cannot go beyond 105

    }
}
