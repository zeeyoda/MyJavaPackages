package day34;

public class Method_Number_Practice {
    public static void main(String[] args) {

        int result1 = build3DigitNumber(6,4,3);
        System.out.println("result1 "+result1);

        int result2 = build3DigitNumber(16, 14, 90);
        System.out.println("result2 "+result2);
        //add the result of first 2 methods that are called above
        System.out.println("result1+result2= " + (result1+result2));
        System.out.println(result1 + result2 + " final result of result1+result2.");
    }
    public static int build3DigitNumber(int digit1, int digit2, int digit3){
        if(digit1<0 || digit1>9){
            digit1=0;
        }if (digit2<0 || digit2>9){
            digit2 = 0;
        }if (digit3<0 || digit3>9) {
            digit3 = 0;
        }
        int number = digit1*100+digit2*10+digit3;
        return number;
    }
}
