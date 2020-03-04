package day20;

public class Practice_Sum_Of_Odd {
    public static void main(String[] args) {
        //calculate the sum of all odd numbers from 10 till 100
        int sum = 0;
         for( int x = 10; x <=100; x++) {
             System.out.println(x);
             if( x%2==1) {
                 sum = sum + x;
             }
         }
        System.out.println(sum);
    }
}
