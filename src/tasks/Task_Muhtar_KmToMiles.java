package tasks;

import java.util.Arrays;

public class Task_Muhtar_KmToMiles {
    public static void main(String[] args) {
        getInMiles(5);
        getInLiter(8);
        int[] arr = {1, 6, 8, 7, 5, 3,};
        printDescending(arr);
        calculate(10,5,"+");

    }
    public static double getInMiles(double km){
        double miles = km*0.612;
        return miles;
    }
    public static double getInLiter(double gal){
        double liter = gal*3.75;
        return liter;

    }
    public static void printDescending (int[] arr){
        Arrays.sort(arr);
        for(int x=arr.length-1; x>=0; x--){
            System.out.println(arr[x]+" ");
        }

    }
    /*4. write a method that accepts 3 parameters: 2 numbers and one operator,
	 	and prints out the calculation
		if operator is not between [-, +, *, /, %] output should be Invalid Operator
			Ex: calculate(10, 2, "*") ==> 20;
				calculate(20, 2, "~") ==> invalid operator*/
    public static void calculate(int a, int b, String operator){
       boolean result = !operator.equals("-") ||!operator.equals("*") || !operator.equals("/") || !operator.equals("+") ||
           !operator.equals("%");
            if (!result) {
                System.out.println("Invalid operator");
                return;
            }

            if(operator.equals("-")){
                System.out.println(a-b);
            }else if(operator.equals("+")){
                System.out.println(a+b);
            }else if(operator.equals("/")){
                System.out.println(a/b);
            }else if(operator.equals("*")){
                System.out.println(a*b);
            }else if(operator.equals("%")){
                System.out.println(a%b);
            }
        }
        public static void calculate2(int a, int b, String operator){
            if(operator.equals("-")){
                System.out.println(a-b);
            }else if(operator.equals("+")){
                System.out.println(a+b);
            }else if(operator.equals("/")){
                System.out.println(a/b);
            }else if(operator.equals("*")){
                System.out.println(a*b);
            }else if(operator.equals("%")){
                System.out.println(a%b);
            }else{
                System.out.println("Invalid operator");
            }

        }

    }

