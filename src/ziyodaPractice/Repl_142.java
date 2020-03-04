package ziyodaPractice;

public class Repl_142 {
    public static void main(String[] args) {
        int[][] numbers = {{5, 6, 8},{7, 2, 1}};
        int max = numbers[0][0];
        for(int[] each2DArray : numbers){
            for(int eachElement : each2DArray){
                if(eachElement>max){
                    max=eachElement;
                }
            }
        }
        System.out.println(max);

    }
}
