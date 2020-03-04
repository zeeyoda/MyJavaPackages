package ziyodaPractice;

public class Repl_164 {
    public static void main(String[] args) {
        System.out.println(max(5,9));
        System.out.println(max(9,5));

    }

    public static  int max(int x, int max) {

        int result = 0;
        if (x > max) {
            result= max;
        }
        if (x <= max) {
            result= x;
        }
        return result;
    }
}


