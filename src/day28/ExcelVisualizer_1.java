package day28;

import java.util.Arrays;

public class ExcelVisualizer_1 {
    public static void main(String[] args) {
      /*
        Cell(1,1)= 78	Cell(1,2)= 54	Cell(1,3)= 100	Cell(1,4)= 84
        Cell(2,1)= 33	Cell(2,2)= 44	Cell(2,3)= 77	Cell(2,4)= 123
        Cell(3,1)= 12	Cell(3,2)= 88	Cell(3,3)= 52	Cell(3,4)= 76
        Cell(4,1)= 67	Cell(4,2)= 33	Cell(4,3)= 98	Cell(4,4)= 67
        Cell(5,1)= 12	Cell(5,2)= 88	Cell(5,3)= 52	Cell(5,4)= 45
        Cell(6,1)= 67	Cell(6,2)= 33	Cell(6,3)= 98	Cell(6,4)= 34
        { {78,54,100,84},{33,44,77,123},{12,88,52,76},{67,33,98,67},{12,88,52,45},{67,33,98,34} };
        */

      int[] row1 = {78, 54, 100, 84};
      int[] row2 = {33, 44, 77, 123};
      int[] row3 = {12, 88, 52, 76};
      int[] row4 = {67, 33, 98, 67};
      int[] row5 = {12, 88, 52, 45};
      int[] row6 = {67, 33, 98, 34};

      // to store this in another array object

        //int[][] sheets = new int[][]{{row1,row2, row3, row4, row5, row6}};

        int[][] mySheet = { {10, 27}, {87,99,100}, {90, 45}};

        //tell me how to print 100 and 90 from this array
        System.out.println(mySheet[1][2]);
        System.out.println(mySheet[2][0]);

        //this will print the number of 1d array objects in this 2D array
        //this will print 3, which represents 3 1d array objects in the 2d array
        System.out.println(mySheet.length);

        //how many items do I have in the first object of this 2D array
        System.out.println(Arrays.toString(mySheet[0]));

        //i want to get the length of 1st array object
        System.out.println(mySheet[0].length);
        System.out.println(mySheet[1].length);
        System.out.println(mySheet[2].length);

        // how can I make the above code better
        //by loop and get the item count of each 1d array
        for (int x=0; x<mySheet.length; x++){
            System.out.println("Item number " +(x+1)+" length is: "+ mySheet[x].length);
        }

    }
}
