package day32;

public class Method_NumberAction {
    public static void main(String[] args) {
    //repeatString("Java", 3);
    //skipCountBy3From0to50();
    //print1Tox(9);
    //evenNumber50to0();
    countDownByEvenNumberFromXtoY(30, 6);

    }
    public static void countDownByEvenNumberFromXtoY(int x, int y){
        for (int i = x; i >=y; i--) {
            if(i%2==0){
                System.out.println(i+" ");
            }
        }
        System.out.println();


    }
    public static void comparison(int num1, int num2) {
        if (num1 > num2) {
            System.out.println("Num1 is greater than num2");
        } else if (num1 < num2) {
            System.out.println("Num1 is less than num2");
        } else if (num1 == num2) {
            System.out.println("They are equal");
        }
    }
    public static void evenNumber50to0() {

        //count down by even number 50 to 0
        for (int x = 50; x >= 0; x--) {
            if (x % 2 == 1) {
                continue;
            }
            System.out.print(x + " ");
        }
        System.out.println();
    }
       public static void skipCountBy3From0to50() {
           for (int i = 0; i <= 50; i += 3) {
               System.out.print(i + " ");
           }
           System.out.println();
       }
       public static void repeatString(String strRepeat, int count){
             for (int i = 1; i <= count; i++) {

                 System.out.println(strRepeat+" ");
             }
           System.out.println();
    }
    public static void print1Tox(int x){
        for(int i=1; i<=x; i++){
            System.out.print(i+" ");
        }
        System.out.println();
    }

}
