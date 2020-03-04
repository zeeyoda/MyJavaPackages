package day34;

import day31.Method_Calculator_V2_13;

import java.util.Arrays;

public class MathAction_CallingMethodsFromOtherPackageClass {
    public static void main(String[] args) {
        //call your build3DigitNumber method here
        //it is in different class, so i went to that class and called the method
        int result1 = Method_Number_Practice.build3DigitNumber(6,4,0);
        System.out.println("result1 = "+result1);
        // in order to use Arrays class that is coming from java.util package (not your package)
        // first we need to import them java.util/Arrays;
        //in order to call static method of Arrays class, we need to use classname.MethodName(...);
        // here Arrays.toString
        int[] nums = {2, 5, 87};
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));

        //I need to call a class from a different package
        // we need to import the class --->> import day31.
        Method_Calculator_V2_13.calculator('+', 5, 8);
    }
}
