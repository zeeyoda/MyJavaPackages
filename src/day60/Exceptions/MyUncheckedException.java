package day60.Exceptions;

public class MyUncheckedException extends RuntimeException {

}
class Main{
    public static void main(String[] args) {

        //throw new MyUncheckedException();
        try {
            throw new MyOwnCheckedException();
        }catch (Exception e){
            System.out.println("Unchecked Exception got caught.");
        }
    }
}
