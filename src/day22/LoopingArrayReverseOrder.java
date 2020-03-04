package day22;

public class LoopingArrayReverseOrder {
    public static void main(String[] args) {
        int[] scores = new int[4] ;
        scores[0] = 95;
        scores[1] = 70;
        scores[2] = 88;
        scores[3] = 100;
        // accessing the elements inside array one by one
        System.out.println(   scores[0]   );
        System.out.println(   scores[1]   );
        System.out.println(   scores[2]   );
        System.out.println(   scores[3]   );


        int elementCount = scores.length;
        int lastItemIndex = elementCount - 1;

        //we are printing in reverse order so
        //we start with highest index till lowest index 0 -->> 3-0

        for (int x = lastItemIndex; x>=0 ; x--) {
            System.out.print("index location " + x + " is ");
            System.out.println( scores[x]);
        }

        int[] grades = {95, 45, 87, 99};
        for (int k = 0; k <grades.length ; k++) {
            System.out.println(grades[k]);
        }

        }

    }

