package OfficeHour;



public class Practice_12_27 {
    public static void main(String[] args) {

        long num1 = 10;
        double num2 = num1;
       double number1 =  method3();
       method1();
       method2();

        System.out.println(eligible(21));
        System.out.println(eligible(45));

    }
    public static void method1(){
        System.out.println("Hello Batch 15");
        //return 10; ---> return type is void, cannot return any value
    }
    public static void method2(){
        if(false){
            return; //exits the current method
        }
        System.out.println("Test completed");
    }
    public static double method3(){
        //if return type is not void, the method must return a value at the end
        return 10.5f;
    }
    public static boolean eligible(int age){
        if(age >= 35){
            return true;
        }
        return false;

    }
}
