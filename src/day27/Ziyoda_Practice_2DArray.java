package day27;

import java.util.Arrays;

public class Ziyoda_Practice_2DArray {
    public static void main(String[] args) {

       /* int [][] numbers = {{1,2,3}, {4,5,6}, {7,8,9}, {45, 65, 25, 78}};

        System.out.println(Arrays.toString(numbers[1]));//this will print the values of first single dimensional array
        System.out.println("---------------------------------------------------");
        for (int x=0; x< numbers.length; x++) { //checks each index of 2 dimensional array
           // System.out.println(Arrays.toString(numbers[x]));
            for (int j = 0; j < numbers[x].length; j++) {
                System.out.print(numbers[x][j]+" ");

            }
        }*/
        int[][] scores = {{10}, {12, 13, 14, 16, 17},{19, 20, 21, 22, 23} };

        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length ; j++) {
                if(scores[i][j]%2 !=0) {// we are printing the even numbers therefore we have to skip the odd numbers
                    continue;
                }

                    System.out.print(scores[i][j]+" ");
              }
            }
        System.out.println("------------------------------------------------------");
        int[][] sizes = {{78, 89, 45, 67, 66}, {12, 14, 16, 18}, {88, 44, 41}};

        //print the numbers divisible by 4
        for (int i = 0; i < sizes.length; i++) {
            for (int k = 0; k < sizes[i].length; k++) {
                if(sizes[i][k]%4 == 0){
                    continue;
                }
                System.out.print(sizes[i][k]+" ");

            }

        }
        }

    }

