package day27;

import java.util.Arrays;

public class MultiDimentionalArray_3D {
    public static void main(String[] args) {
        //2D Array: contains one dimentional array
        int[][] arr2D = {{1,2,3}, {4,5,6}};
        //[index num of 1D array][index number of element/value]


        //3D Array: contains 2 D array

        int[][][] arr3D = {{{1,2,3}, {4,5,6}},         {{7,8,9}, {10,12,13}}};

        //[index num of 2D array][index of 1D array][index number of each element/value]
        //print 9
        System.out.println(arr3D[1][0][2]);

        //print 2
        System.out.println(arr3D[0][0][1]);

        //print {1,2,3}
        System.out.println(Arrays.toString(arr3D[0][0]));

        //print {10, 11, 12}
        System.out.println(Arrays.toString(arr3D[1][1]));

        //print {{7,8,9}, {10,11,12}}
        System.out.println(Arrays.deepToString(arr3D[1]));

        System.out.println(Arrays.deepToString(arr3D));

    }
}
