package day17;

public class BackwardEvenNumberFinder {
    public static void main(String[] args) {

        int number = 100 ;
        while(number >= 0){
        if(number%2 == 0) {
            System.out.println(number + " is an even number");

        }
        --number;
        }

    }
}
