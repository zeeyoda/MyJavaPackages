package ziyodaPractice;

public class Repl_209 {
    public static void main(String[] args) {
        String str = "aa!!%$#.mm";

        String digit = "";
        for (int i = 0; i <str.length() ; i++) {
            if(Character.isDigit(str.charAt(i))){
                digit+=str.charAt(i);
            }

        }
        System.out.println(digit);



    }
}

