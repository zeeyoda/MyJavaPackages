package day14;

public class Trim_And_Empty {
    public static void main(String[] args) {

        String message = "  REPL IS COMING ! " ;
        System.out.println(message);
        System.out.println("message character count is "+message.length());

        System.out.println( message.trim()  );

        System.out.println("message character count is " + message.length());

    }
}
