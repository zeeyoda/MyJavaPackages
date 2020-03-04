package muhtar60_Exceptions;

import java.io.IOException;

public class Exception_Throws {
    public static void main(String[] args) {
       // methodA();
        methodB();

        int breakTime = 0;
        if(breakTime==0) {
            throw new RuntimeException("Time to go home");
        }


    }
    public static void methodA() throws InterruptedException{

        Thread.sleep(3000);
    }
    public static void methodB(){
        try{
            Thread.sleep(3000);
        }catch (Exception e){

        }
    }
    public static void methodC() throws Exception{
        Thread.sleep(3000);

        System.out.println("step 1");
        System.out.println("step 2");

        Thread.sleep(4000);

        System.out.println("Step 4");
        System.out.println("Step 5");

        Thread.sleep(1000);

        try{
            int a = 10;
            System.out.println(a/0);
        } catch (Exception e){
           // System.out.println(a);// we cannot use a here. a is declared inside try block and can only be used inside try block
            System.out.println("Catch block");
        }

    }
    public static void methodD() throws InterruptedException, IOException{

    }


}
