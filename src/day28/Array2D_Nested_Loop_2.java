package day28;

import java.util.Arrays;

public class Array2D_Nested_Loop_2 {
    public static void main(String[] args) {

        int[][] myExcel = {
                            {10, 27, 88, 99},
                            {87, 100},
                            {90, 45, 65}
                         };

        //what does deepToString method do:
        //it turns a multiD array and turns it into a String with all items
        //what external data do I need to provide - the MultiD array variable
        //what do I get out of it --- String representation of multiD array object
        System.out.println(Arrays.deepToString(myExcel));

        for(int[] eachRow : myExcel){
            for (int eachCell: eachRow){
                System.out.print(eachCell+" ");
            }
            System.out.println();
        }

    }
}
