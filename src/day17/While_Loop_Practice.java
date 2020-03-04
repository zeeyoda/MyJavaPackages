package day17;

public class While_Loop_Practice {
    public static void main(String[] args) {
        //Count 1 to 5, then count 5 to 1
        // if I use (counter <= 5 ) as condition I will have these
        // -->> iteration 1 : 1<=5 true, print 1 counter 2
        // -->> iteration 2 : 2<= 5 true
        // --> iteration 3: 3<=5 true
        // -->> iteration 4: 4<=5 true
        // -->> iteration 5 : 5<=5 true
        // -- >> iteration 6: 6 is not <=5, false
        int counter = 1 ;
        while ( counter <= 5){
            System.out.print(counter + " ");
            ++counter;
        }
        System.out.println();
        System.out.println("counter = " + counter);

        //now i want to count from 5 to 1, using the same counter
        while(counter >1) {
            --counter;
            System.out.println(counter + " ");

        }

    }
}
