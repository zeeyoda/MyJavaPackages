package day11;

public class LogicalOperatorPractice {

    public static void main(String[] args) {

        int score = 99;
        if ( score < 0 || score > 100) {
            System.out.println("Invalid Score");
        }else if(score == 100) {
            System.out.println("Perfect Score");
        }else if ( 70<score && score<100) {
            System.out.println("Your have passed");
        }else if(score<20) {
            System.out.println("Come to my office");
            System.out.println("You have failed the exam");
        }else if(30<score && score<40) {
            System.out.println("Attend additional classes");
            System.out.println("You have failed the exam");;
        }else if (40<score && score<70){
            System.out.println("Little bit more study will let you pass");
            System.out.println("You have failed the exam");



        }
    }
}
