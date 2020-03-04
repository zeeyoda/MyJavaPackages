package day59;

import java.io.IOException;

public class CheckedAndUnchecked  {
    public static void main(String[] args) throws InterruptedException{

        String x = "abc";
        System.out.println("Start");

        Thread.sleep(3000);

        System.out.println("The end.");
        //System.out.println(x.charAt(100));

        //Exception Hierarchy
        //Throwable --> child class -->> Exception

        //Under Exception class,
        //There is one subclass knows as RunTimeException
        //Anything IS-A RunTimeException regarded as - UncheckedException
        //UncheckedException is not required to be handled at compile time

        //How do I know if it is UncheckedException
        //check whether it is a RunTimeException or subclass of RunTimeException

        //throw new RuntimeException("just throwing RuntimeException using throw keyword!");

        //What is CheckedException
        //an exception type that must be handled at compile time
        //everything that sub class of Exception but not RunTimeException
        //programmers are required to handle or declare the CheckedException

        //is the class Exception a type of checked exception or unchecked exception?
        //we use throw keyword, if unchecked it will not complain.
        // if checked it will complain, we have to use tryCatch block to handle it or declare it

        //handle -- try catch
        //declare -->> add it to the method signature to document

//          try {
//              throw new IOException("just throwing this away");
//          }catch(IOException e){
//              System.out.println("Exception caught");
//          }


    }
}
