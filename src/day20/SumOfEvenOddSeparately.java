package day20;

public class SumOfEvenOddSeparately {
    public static void main(String[] args) {
        // calculate sumOfEven and SumOfOdd separetely in a loop 1-100

        int sumOfEven = 0;
        int sumOfOdd = 0;
        for(int i =10; i<=100; i++){
            if(i%2==0) {
                sumOfEven = sumOfEven + i;
            }else if(i%2==1){
                sumOfOdd = sumOfOdd + i;
            }
        }
        System.out.println("sumOfOdd = " + sumOfOdd);
        System.out.println("sumofEven = " + sumOfEven);
    }
}
