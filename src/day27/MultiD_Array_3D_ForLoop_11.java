package day27;

public class MultiD_Array_3D_ForLoop_11 {
    public static void main(String[] args) {

        int[][][] arr3D = {{{1,2,3}, {4,5,6}},         {{7,8,9}, {10,12,13}}};
        //loop though each element separated by space

        for (int x = 0; x<arr3D.length; x++){//each index of 2D array
            for (int i = 0; i < arr3D[x].length; i++) {//each index of 1D array
                for (int k = 0; k < arr3D[x][i].length; k++) {//k is each index number of values
                    System.out.print(arr3D[x][i][k] + " ");

                }

            }
        }
    }
}
