package day36;

public class MethodWithWrapperType {
    public static void main(String[] args) {
        //i1 is a variable with data type Integer
        // and it can store integer Object
        //what is the deal with 12? -->> autoboxing
    Integer i1 = 12;
    Integer i2 = 20;
    sumAndPrint(i1, i2);
    sumAndPrint(65, 45);
    sumAndPrint(new Integer(45), new Integer(12));
    sumAndPrint(Integer.valueOf(25), Integer.valueOf(15));

    printTheDoubleValue(23);
    printTheDoubleValue(new Integer(12));

    }

    /**
     * This method add 2 numbers and print
     * @param n1 type Integer, first number to add
     * @param n2 type Integer, second number to add
     */
    public static void sumAndPrint(Integer n1, Integer n2){
        // we cannot add 2 objects
        //compiler turns n1 and n2 to int so that it cad add
        //Integer to int conversion ---> auto unboxing
        System.out.println(n1+n2);


    }

    /**
     * This method will print the double value of what use passed
     * @param x
     * return - doesnt return anything
     */
    public static void printTheDoubleValue(int x){
        System.out.println("After doubling x= "+(x*2));
    }
}
