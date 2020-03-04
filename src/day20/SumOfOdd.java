package day20;

public class SumOfOdd {
    public static void main(String[] args) {
        int sum1 = 0;
        for (int y = 10; y <= 100; y++) {
            if (y % 2 == 1) { // if(y%2 !=0){
                sum1 = sum1 + y; // sum1 +=y;
            }

        }
        System.out.println("sum1 = " + sum1);

    }
}
