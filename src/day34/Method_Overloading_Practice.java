package day34;

public class Method_Overloading_Practice {
    public static void main(String[] args) {
        add(100);
        add(2, 8);
        add(1256L, 9854L);
        add(85, 74, 32);

    }

    //create a 3 overloading method of add method
    // 1st will accept one parameter and add 100 to any number user passes and prints our the result
    //2nd has 2 parameters and adds them together

    public static void add(int num) {
      //  System.out.println(num+100);
     add(num, 50);

    }
    public static void add(int num1, int num2){
        int sum = 0;
        sum = num1+num2;
        System.out.println(sum);
    }
    public static void add(int num1, int num2, int num3){
        int sum = 0;
        sum = num1+num2+num3;
        System.out.println(sum);
    }
    public static void add(long num1, long num2){
        long sum = 0;
        sum = num1+num2;
        System.out.println(sum);
    }
    }


