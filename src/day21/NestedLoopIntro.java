package day21;

public class NestedLoopIntro {
    public static void main(String[] args) {
        // count 1 to 5
        //repeat 3 times

      /*  for (int x = 1; x <=5; x++) {
            System.out.print(x + " ");
        }
        System.out.println();
        for (int x = 1; x <=5; x++) {
            System.out.print(x + " ");
        }
        System.out.println();

        for (int x = 1; x <=5; x++) {
            System.out.print(x + " ");
        }
        System.out.println("-------------------------------------");

        for ( int i = 1; i <= 3; i++) {
            System.out.println("Iteration:" + i);
            for (int x = 1; x <= 5; x++) {
                System.out.print(x + " ");
            }
            System.out.println();

       */

        for(int b=1; b<=12; b++) {
            System.out.println("Iteration: " + 1);
            for (int c = 1; c <= 12; c++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }

    }
}
