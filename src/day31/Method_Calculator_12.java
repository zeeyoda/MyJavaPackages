package day31;

public class Method_Calculator_12 {
    public static void main(String[] args) {
        //create a static method that add
        //it accepts 2 numbers and prints the result of addition
        add(12, 10);
        add3Numbers(15,56, 98);
    }
    //this is a static method that has 2 int parameters
    public static void add( int num1, int num2 ){
        System.out.println("Addition result: "+ (num1+num2));
    }
    public static void add3Numbers(int num1, int num2, int num3){
        System.out.println("Adding 3 numbers: "+ (num1+num2+num3));
    }
}
