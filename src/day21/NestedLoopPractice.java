package day21;

public class NestedLoopPractice {
    public static void main(String[] args) {
        //count from 1 to 10
        //print only odd number
        //repeat only 4 times

        for (int x = 1; x <= 4; x++) {
            System.out.println("Cycle " + x);

            for (int i = 1; i <= 10; i++) {
                if (i % 2 == 1) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();

        }
    }
}

