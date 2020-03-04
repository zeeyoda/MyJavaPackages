package officeHouse_02_12;

public class ExceptionsPractice {
    public static void main(String[] args) {
        try {
            System.out.println(9 / 0);// ArithmeticException
        }catch (IndexOutOfBoundsException e){
            System.out.println("Exception is handled");
        }catch (ClassCastException e){
            System.out.println("Exception handled");
        }catch (ArithmeticException e){
            System.out.println("Arithmetic exception is handled.");
        }catch (IllegalStateException e){
            System.out.println("Illegal state Exception");
        }
        System.out.println("Test completed");
    }
}
