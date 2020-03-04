package day04;

public class ArithmeticOperator {

    public static void main(String[] args) {
//arithmetic operator between 2 int will generate another int
       // System.out.println( 5+3); //8
        //System.out.println( 5-3); //2
       // System.out.println( 5*3);// 15
        //System.out.println (5/3); // 1

//arithmetic operator between numerical date type
// the final result will be larger data type

        System.out.println( 5+3.0d); //8
        System.out.println( 5-3d); //2
        System.out.println( 5*3d);// 15
        System.out.println (5/3d); // 1
        System.out.println (5/3f); // 1

      //store above numbers in variables
      //and replace above statements with variables instead
        // data type result1- the calculation here

       // System.out.println( 5+3.0d); //8
        //System.out.println( 5-3d); //2
        //System.out.println( 5*3d);// 15
        //System.out.println (5/3d); // 1
        //System.out.println (5/3f); // 1

        int largeNumber = 10;
        short divider = 2;
        double result = 5d;

       // System.out.println(largeNumber/divider);

        int num1=5;
        double num2=3.0d;
        float num3 = 3.0f;

        double result1 = num1+num2;
        double result2 = num1-num2;
        double result3 = num1*num2;
        double result4 = num1/num2;
        double result5 = num1/num3;


        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);






    }
}
