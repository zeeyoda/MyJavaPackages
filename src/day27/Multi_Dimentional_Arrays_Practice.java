package day27;

import java.util.Arrays;

public class Multi_Dimentional_Arrays_Practice {

    public static void main(String[] args) {
        //                      0        1          2        0        1       2
        String[][] names = {{"Ziyoda", "Ablatt", "Saida"}, {"Adil", "Azat", "Sabira"}};
        //                                0                            1
        //print Azat
        System.out.println(names[1][0]);
        names[1][0] = "Mustafo";// replaced Adil with Mustafo
        System.out.println(names[1][0]);

        System.out.println(Arrays.toString(names[1]));

        System.out.println(Arrays.deepToString(names));

        int[][] numbers = {{1, 2, 3}, {4, 5, 6,}, {7, 8, 9}, {10, 11, 12, 13}};

        //I want to print 1 2 3 4 5 6 7 8 9 10 11 12 13
        for (int i = 0; i < numbers.length; i++) {// length return total number of single dimentional arrays
            //System.out.println(Arrays.toString(numbers[i]));
            for (int j = 0; j > numbers[i].length; j++) {//checks each element
                System.out.println(numbers[i][j] + " ");

            }
        }
        System.out.println("=====================================");
        int[][] ages = {{10}, {12, 13, 14, 16, 17}, {19, 20, 21, 22}};
        //print out all the even numbers element
        for (int x = 0; x < ages.length; x++) {
            for (int k = 0; k < ages[x].length; k++) {
                if (ages[x][k] % 2 != 0) {
                    continue;
                }
                System.out.println(ages[x][k] + " ");
            }
        }
        int[] arr1D = {1, 2, 3};
        for (int each : arr1D) {// this loop will only iterate 3 times because it represents each index
            System.out.println(each + " ");

        }
        int[][] arr2D = {{10, 20, 30}, {40, 50, 60, 70, 80, 90, 100}};
        for (int[] each1Darray : arr2D) {//variable name each1DArray represents each index of 2d array
            for (int eachElement : each1Darray) {// eachElement represents
                System.out.print(eachElement + " ");
            }
        }

    }
}
