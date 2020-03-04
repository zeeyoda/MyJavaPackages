package day09;

public class InitializingAVariable {

    public static void main(String[] args) {

       // int num;
        // a variable inside a method must get initial value before being used for the
        //first time, otherwise it will not compile
        //there should not be any chance
        //this variable does not get value before usage
        String name = "";

        System.out.println(name);
    }
}
