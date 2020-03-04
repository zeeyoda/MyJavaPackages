package day25;

import java.util.Arrays;

public class Array_SortedOrNot2 {
    public static void main(String[] args) {
        int[]score = {32, 5, 76, 34, 2};

        System.out.println("nums " + Arrays.toString(score));
        //we can also use to check if the condition is true or false
        //below we assume array is sorted and give it a boolean name isSortedAlready
        boolean isSortedAlready= true;
        for (int x = 0; x < score.length - 1; x++) {
            //System.out.println(score[x]+ " " + score[x+1]);
            //pick first item and compare with second item
            //keep repeating until there is no more item

            //print if item1 is less than item2
            System.out.println("is "+score[x]+" less than " +score[x+1]+ " ? "+(score[x]<score[x+1]) );
            if(!(score[x]<score[x+1])){
                System.out.println("Array is not sorted, to point checking the rest");
                isSortedAlready=false;
                break;
            }
        }
        System.out.println("isSortedAlready = "+ isSortedAlready);
    }
}
