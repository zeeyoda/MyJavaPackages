package day17;

public class FizzBuzzTest {
    public static void main(String[] args) {
        //if a number can be divided number both 3 and 5 -->> Fizz Buzz number
        //if a number can be divided by 5 -->> F number
        //if a number can be divided by 3 -->> Buzz number
        // int num = 15 ;

        int num = 1 ;
        while (num <= 50) {
            if (num % 5 == 0 && num % 3 == 0) {
                System.out.println(num + " is Fizz Buzz number");
            } else if (num % 5 == 0) {
                System.out.println(num + " is a Fizz Number");
            } else if (num % 3 == 0) {
                System.out.println(num + " is a Buzz Number");
            }
            ++num;
        }

    }
}
