package day21;

public class Deciding_When_To_Stop {
    public static void main(String[] args) {
        //            01234567890
        String msg = "Hello World";
        int charCount = msg.length();
        int n = 1;//n is count of Char to iterate
        // x<= charCount-n
        for( int x = 0; x<= charCount-n; x++){
            System.out.println(msg.substring(x, x+n));
        }

    }
}
