package day59;

public class ThrowingExceptionProgrammatically {
    public static void main(String[] args) {

       // NullPointerException e1 = new NullPointerException();
        NullPointerException e2 = new NullPointerException("NullPointerException with String argument object");

        System.out.println(e2.getMessage());
        //we use throw keyword followed by the exception object (or the pointer that points to the exception object)

        throw e2;// throw i a keyword that has one purpose of throwing the exception to the runtime

       // System.out.println("the end");

        // throw keyword can be used to programmatically throw the exception to the runtime
        //to control the program flow

    }
}
