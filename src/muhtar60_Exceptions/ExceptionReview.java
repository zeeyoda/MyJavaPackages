package muhtar60_Exceptions;

public class ExceptionReview {
    public static void main(String[] args) {

       // throw new FileNotFoundException();//checked exception, compiler is not happy

      //  throw new ClassCastException();// unchecked exception, compiler is ok with it
//        try {
//            FileInputStream file = new FileInputStream("path of file");
//
//        } catch (FileNotFoundException e){
//            System.out.println("Catch block");
//        }

        try{
            System.out.println("Inside try block before unchecked exception");
            Thread.sleep(3000);
        }catch (InterruptedException e){
            System.out.println("catch block after unchecked exception");
        }
        System.out.println("Outside of any block");
        System.out.println("==================================================================");

        try {
            System.out.println("try block");
            System.out.println(9 / 0);
        }catch (ArithmeticException e){
            e.printStackTrace();// this shows exactly what type of Exception
            System.out.println("Catch block after ArithmeticException");
        }
        System.out.println("Next test step");
        System.out.println("===============================================");

        System.out.println("Multi Catch Block Below");
        int[] arr = {1, 2, 3};
        try {
            System.out.println(arr[200]);

        }catch (NullPointerException e){
            System.out.println(1);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(2);
        }catch (IndexOutOfBoundsException e){
            System.out.println(3);
        }catch (Exception e){
            System.out.println(4);
        }
        System.out.println("End");

    }
}
