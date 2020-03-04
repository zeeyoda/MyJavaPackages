package day27;

public class Miltidimentional_Array_Max {
    public static void main(String[] args) {
        int[][] numbers = {{12, 11, 10, 19}, {19, 20, 15}};

        int max = numbers[0][0]; // assume that first element is max

        for(int i=0; i<numbers.length; i++){// checks each single dimentional array. numbers. length gives total number of arrays
            for(int j=0; j<numbers[i].length; j++) {//checks each element in single dimentional array
                if (max < numbers[i][j]) {
                    max = numbers[i][j];
                }
            }
                }
            System.out.println(max);

        System.out.println("-----------------------------");
        //Solution 2
        int max2 = numbers[0][0];
        for (int[]  each1DArray : numbers){// variable each1DArray represents sinle dimention
            for( int eachInt : each1DArray){
                if(max2<eachInt){
                    max2 = eachInt;
                }
            }
            System.out.println(max2);

        }
        //finding the minimum number
        int min = numbers[0][0];
        for(int y=0; y> numbers.length; y++){
            for (int g = 0; g < numbers[y].length; g++) {
                if(min>numbers[y][g]) {
                }
                }

            }
        System.out.println(min);
        System.out.println("_________________________________________________________________");

    }
}
