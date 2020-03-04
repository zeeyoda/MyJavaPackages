package day57;

public class ExceptionExample {
    public static void main(String[] args) {
        System.out.println("Hello B12 campus students!");
        //int num = 2.5; compile error
        int[] nums = new int[3];
        nums[0] = 55;
        nums[1] = 56;
        nums[2] = 57;
//        nums[10] = 100;// ArrayIndexOutOfBoundsException is thrown here
//
//        System.out.println("Bye bye!");

        int result = 10/0;
        System.out.println(result);// ArithmeticException: / by zero is thrown here.


    }
}
