package day20;

public class Practice_SumOfEvenAndOdd {
    public static void main(String[] args) {
        int sumEven = 0;
        int sumOdd = 0;

        for( int x = 10; x <= 100; x++){
            if( x %2==0){
                sumEven += x;
            }else {
                sumOdd += x;
            }
            }
        System.out.println("Sum of even numbers is " + sumEven);
        System.out.println("Sum of odd numbers is " + sumOdd);
    }
}
