package day36;

public class MethodWithParameter {
    public static void main(String[] args) {
        addOneHundred(25);
        addOneHundred(new Integer(100));
        int num = 29;
        addOneHundred(num);
        addOneHundred(12);

        int num1 = 10;
        int x = num1;
        addOneHundred(num1);

        num = addOneHundredAndReturn(num);
        System.out.println(num);
    }
    public static void addOneHundred(int x){
        //System.out.println(x+100);

        x = x+100;
        System.out.println(x);
    }
    public static int addOneHundredAndReturn(int x) {
        x = x + 100;
        //System.out.println( x );
        return x;
    }
}
