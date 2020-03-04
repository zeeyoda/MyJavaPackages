package day58;

public class CheckedExceptionDeclaring {
    public static void main(String[] args) throws Exception{
        System.out.println("Checked Exception in next line");

            Thread.sleep(1000);

        System.out.println("After thread.sleep");
    }
}
