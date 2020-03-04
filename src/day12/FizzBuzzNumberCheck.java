package day12;

public class FizzBuzzNumberCheck {
    public static void main(String[] args) {

        int num = 9 ;
        if ( num%3 == 0 && num%5 ==0) {
            System.out.println("FizzBuzz Number");
        }else if( num%5 ==0) {
            System.out.println("It is Fizz Number");
        }else if( num%3 ==0) {
            System.out.println("It is Buzz Number");
        }else{
            System.out.println("Not My Number");

        }

    }
}
